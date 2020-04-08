
package com.example.newsfeedsapp.ui.main.articledetail;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ArticleDetailFragmentProvider {

    @ContributesAndroidInjector(modules = ArticleDetailFragmentModule.class)
    abstract ArticleDetailFragment provideExploreFragmentFactory();
}
