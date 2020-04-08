// Generated by Dagger (https://google.github.io/dagger).
package com.example.newsfeedsapp.ui.main.article;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.newsfeedsapp.ViewModelProviderFactory;
import com.example.newsfeedsapp.ui.main.article.adap.ArticleAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ArticleFragment_MembersInjector implements MembersInjector<ArticleFragment> {
  private final Provider<LinearLayoutManager> mLayoutManagerProvider;

  private final Provider<ArticleAdapter> mArticleAdapterProvider;

  private final Provider<ViewModelProviderFactory> factoryProvider;

  public ArticleFragment_MembersInjector(
      Provider<LinearLayoutManager> mLayoutManagerProvider,
      Provider<ArticleAdapter> mArticleAdapterProvider,
      Provider<ViewModelProviderFactory> factoryProvider) {
    this.mLayoutManagerProvider = mLayoutManagerProvider;
    this.mArticleAdapterProvider = mArticleAdapterProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ArticleFragment> create(
      Provider<LinearLayoutManager> mLayoutManagerProvider,
      Provider<ArticleAdapter> mArticleAdapterProvider,
      Provider<ViewModelProviderFactory> factoryProvider) {
    return new ArticleFragment_MembersInjector(
        mLayoutManagerProvider, mArticleAdapterProvider, factoryProvider);
  }

  @Override
  public void injectMembers(ArticleFragment instance) {
    injectMLayoutManager(instance, mLayoutManagerProvider.get());
    injectMArticleAdapter(instance, mArticleAdapterProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectMLayoutManager(
      ArticleFragment instance, LinearLayoutManager mLayoutManager) {
    instance.mLayoutManager = mLayoutManager;
  }

  public static void injectMArticleAdapter(
      ArticleFragment instance, ArticleAdapter mArticleAdapter) {
    instance.mArticleAdapter = mArticleAdapter;
  }

  public static void injectFactory(ArticleFragment instance, ViewModelProviderFactory factory) {
    instance.factory = factory;
  }
}