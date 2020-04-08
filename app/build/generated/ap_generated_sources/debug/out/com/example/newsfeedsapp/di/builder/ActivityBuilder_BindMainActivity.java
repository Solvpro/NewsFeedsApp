package com.example.newsfeedsapp.di.builder;

import android.app.Activity;
import com.example.newsfeedsapp.ui.main.MainActivity;
import com.example.newsfeedsapp.ui.main.article.ArticleFragmentProvider;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBuilder_BindMainActivity {
  private ActivityBuilder_BindMainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {ArticleFragmentProvider.class, ArticleDetailFragmentProvider.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
