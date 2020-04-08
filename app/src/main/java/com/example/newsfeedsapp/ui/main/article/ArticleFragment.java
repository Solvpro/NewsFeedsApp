
package com.example.newsfeedsapp.ui.main.article;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.newsfeedsapp.BR;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.ViewModelProviderFactory;
import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.databinding.FragmentArticleBinding;
import com.example.newsfeedsapp.ui.base.BaseFragment;
import com.example.newsfeedsapp.ui.main.article.adap.ArticleAdapter;

import java.util.List;

import javax.inject.Inject;


public class ArticleFragment extends BaseFragment<FragmentArticleBinding, ArticleViewModel>
        implements ArticleNavigator, ArticleAdapter.ArticleAdapterListener {

    public static final String TAG = ArticleFragment.class.getSimpleName();

    FragmentArticleBinding mFragmentArticleBinding;
    @Inject
    LinearLayoutManager mLayoutManager;
    @Inject
    ArticleAdapter mArticleAdapter;
    @Inject
    ViewModelProviderFactory factory;
    private ArticleViewModel mArticleViewModel;

    public static ArticleFragment newInstance() {
        Bundle args = new Bundle();
        ArticleFragment fragment = new ArticleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_article;
    }

    @Override
    public ArticleViewModel getViewModel() {
        mArticleViewModel = ViewModelProviders.of(this, factory).get(ArticleViewModel.class);
        return mArticleViewModel;
    }

    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void updateArticle(List<ArticlesResponse.Article> articleList) {
        mArticleAdapter.addItems(articleList);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mArticleViewModel.setNavigator(this);
        mArticleAdapter.setListener(this);
    }

    @Override
    public void onItemPositClick(int position, ArticlesResponse.Article article) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("article", article);
        Navigation.findNavController(getView()).navigate(R.id.action_ArticleFragment_to_ArticleDetailFragment, bundle);
    }

    @Override
    public void onRetryClick() {
        mArticleViewModel.fetchArticles();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFragmentArticleBinding = getViewDataBinding();
        setUp();
    }

    private void setUp() {
        mLayoutManager = new LinearLayoutManager(getContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mFragmentArticleBinding.articleRecyclerView.setLayoutManager(mLayoutManager);
        mFragmentArticleBinding.articleRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mFragmentArticleBinding.articleRecyclerView.setAdapter(mArticleAdapter);
    }

}
