
package com.example.newsfeedsapp.ui.main.articledetail;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.newsfeedsapp.BR;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.ViewModelProviderFactory;
import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.databinding.FragmentArticleDetailBinding;
import com.example.newsfeedsapp.ui.base.BaseFragment;
import com.example.newsfeedsapp.ui.main.MainActivity;
import com.example.newsfeedsapp.utils.CommonUtils;

import javax.inject.Inject;

public class ArticleDetailFragment extends BaseFragment<FragmentArticleDetailBinding, ArticleDetailViewModel>
        implements ArticleDetailNavigator {

    FragmentArticleDetailBinding mFragmentArticleDetailBinding;
    @Inject
    ViewModelProviderFactory factory;
    private ArticleDetailViewModel mArticleDetailViewModel;

    public static ArticleDetailFragment newInstance() {
        Bundle args = new Bundle();
        ArticleDetailFragment fragment = new ArticleDetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_article_detail;
    }

    @Override
    public ArticleDetailViewModel getViewModel() {
        mArticleDetailViewModel = ViewModelProviders.of(this, factory).get(ArticleDetailViewModel.class);
        return mArticleDetailViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mArticleDetailViewModel.setNavigator(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFragmentArticleDetailBinding = getViewDataBinding();

        ((MainActivity) getBaseActivity()).lockDrawer();
        ((MainActivity) getBaseActivity()).showBackIcon();
        ((MainActivity) getBaseActivity()).mDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v != null){
                    ((MainActivity) getBaseActivity()).onBackPressed();
                    ((MainActivity) getBaseActivity()).showHamburgerIcon();
                    ((MainActivity) getBaseActivity()).unlockDrawer();
                }
            }
        });

        setUp();
    }

    private void setUp() {
        mArticleDetailViewModel.articleLiveData.postValue(
                (ArticlesResponse.Article) getArguments().getSerializable("article"));
    }

    @Override
    public void openWebsite(String url) {
        CommonUtils.openBrowserFromUrl(getContext(), url);
    }
}
