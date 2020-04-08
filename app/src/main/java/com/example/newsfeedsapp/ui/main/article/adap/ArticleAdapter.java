package com.example.newsfeedsapp.ui.main.article.adap;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.recyclerview.widget.RecyclerView;

import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.databinding.ItemArticleEmptyViewBinding;
import com.example.newsfeedsapp.databinding.ItemArticleViewBinding;
import com.example.newsfeedsapp.ui.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<BaseViewHolder> implements Filterable {

    public static final int VIEW_TYPE_EMPTY = 0;

    public static final int VIEW_TYPE_NORMAL = 1;

    private List<ArticlesResponse.Article> mArticleResponseList;

    private List<ArticlesResponse.Article> mArticleResponseListFull;

    private ArticleAdapterListener mListener;

    public ArticleAdapter(List<ArticlesResponse.Article> articleList) {
        this.mArticleResponseList = articleList;
        this.mArticleResponseListFull = new ArrayList<>(articleList);
    }

    @Override
    public int getItemCount() {
        if (mArticleResponseList != null && mArticleResponseList.size() > 0) {
            return mArticleResponseList.size();
        } else {
            return 1;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mArticleResponseList != null && !mArticleResponseList.isEmpty()) {
            return VIEW_TYPE_NORMAL;
        } else {
            return VIEW_TYPE_EMPTY;
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_NORMAL:
                ItemArticleViewBinding moreViewBinding = ItemArticleViewBinding.inflate(LayoutInflater.from(parent.getContext()),
                        parent, false);
                return new ArticleViewHolder(moreViewBinding);
            case VIEW_TYPE_EMPTY:
            default:
                ItemArticleEmptyViewBinding emptyViewBinding = ItemArticleEmptyViewBinding.inflate(LayoutInflater.from(parent.getContext()),
                        parent, false);
                return new EmptyViewHolder(emptyViewBinding);
        }
    }

    public void addItems(List<ArticlesResponse.Article> articleList) {
        mArticleResponseList.addAll(articleList);
        mArticleResponseListFull.addAll(articleList);
        notifyDataSetChanged();
    }

    public void clearItems() {
        mArticleResponseList.clear();
    }

    public void updateItem(int position, ArticlesResponse.Article article) {
        mArticleResponseList.set(position, article);
        notifyItemChanged(position);
    }

    public void setListener(ArticleAdapterListener listener) {
        this.mListener = listener;
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<ArticlesResponse.Article> filterList = new ArrayList<>();

            if (charSequence == null || charSequence.length() == 0){
                filterList.addAll(mArticleResponseListFull);
            } else {
                String filteredPattern = charSequence.toString().toLowerCase().trim();

                for (ArticlesResponse.Article item : mArticleResponseListFull){

                    if (item.getAuthor().toLowerCase().contains(filteredPattern)
                            || item.getTitle().toLowerCase().contains(filteredPattern)
                            || item.getPublishedAt().toLowerCase().contains(filteredPattern)){ //  startsWith
                        filterList.add(item);

                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filterList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            mArticleResponseList.clear();
            mArticleResponseList.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };

    public interface ArticleAdapterListener {

        void onItemPositClick(int position, ArticlesResponse.Article article);

        void onRetryClick();

    }

    public class ArticleViewHolder extends BaseViewHolder implements ArticleItemViewModel.ArticleItemViewModelListener {

        private ItemArticleViewBinding mBinding;

        private ArticleItemViewModel mArticleItemViewModel;

        public ArticleViewHolder(ItemArticleViewBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        @Override
        public void onBind(int position) {
            final ArticlesResponse.Article article = mArticleResponseList.get(position);
            mArticleItemViewModel = new ArticleItemViewModel(article, this);
            mBinding.setViewModel(mArticleItemViewModel);

            mBinding.executePendingBindings();

        }

        @Override
        public void onItemClick() {
            mListener.onItemPositClick(getAdapterPosition(), mArticleResponseList.get(getAdapterPosition()));
        }
    }

    public class EmptyViewHolder extends BaseViewHolder
            implements ArticleEmptyItemViewModel.ArticleEmptyItemViewModelListener {

        private ItemArticleEmptyViewBinding mBinding;

        public EmptyViewHolder(ItemArticleEmptyViewBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        @Override
        public void onBind(int position) {
            ArticleEmptyItemViewModel emptyItemViewModel = new ArticleEmptyItemViewModel(this);
            mBinding.setViewModel(emptyItemViewModel);
        }

        @Override
        public void onRetryClick() {
            mListener.onRetryClick();
        }
    }


}
