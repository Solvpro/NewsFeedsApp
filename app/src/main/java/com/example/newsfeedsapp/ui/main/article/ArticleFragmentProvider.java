
package com.example.newsfeedsapp.ui.main.article;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ArticleFragmentProvider {

    @ContributesAndroidInjector(modules = ArticleFragmentModule.class)
    abstract ArticleFragment provideExploreFragmentFactory();
}
