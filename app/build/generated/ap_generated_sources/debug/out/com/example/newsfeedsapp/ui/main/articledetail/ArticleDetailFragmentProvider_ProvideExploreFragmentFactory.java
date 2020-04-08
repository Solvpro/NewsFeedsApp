package com.example.newsfeedsapp.ui.main.articledetail;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ArticleDetailFragmentProvider_ProvideExploreFragmentFactory.ArticleDetailFragmentSubcomponent
          .class
)
public abstract class ArticleDetailFragmentProvider_ProvideExploreFragmentFactory {
  private ArticleDetailFragmentProvider_ProvideExploreFragmentFactory() {}

  @Binds
  @IntoMap
  @FragmentKey(ArticleDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ArticleDetailFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ArticleDetailFragmentModule.class)
  public interface ArticleDetailFragmentSubcomponent
      extends AndroidInjector<ArticleDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ArticleDetailFragment> {}
  }
}
