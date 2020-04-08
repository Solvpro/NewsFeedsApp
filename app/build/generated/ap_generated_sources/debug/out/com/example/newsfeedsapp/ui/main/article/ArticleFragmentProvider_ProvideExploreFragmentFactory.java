package com.example.newsfeedsapp.ui.main.article;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ArticleFragmentProvider_ProvideExploreFragmentFactory.ArticleFragmentSubcomponent.class
)
public abstract class ArticleFragmentProvider_ProvideExploreFragmentFactory {
  private ArticleFragmentProvider_ProvideExploreFragmentFactory() {}

  @Binds
  @IntoMap
  @FragmentKey(ArticleFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ArticleFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ArticleFragmentModule.class)
  public interface ArticleFragmentSubcomponent extends AndroidInjector<ArticleFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ArticleFragment> {}
  }
}
