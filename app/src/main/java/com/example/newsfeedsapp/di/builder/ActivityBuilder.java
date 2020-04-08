
package com.example.newsfeedsapp.di.builder;

import com.example.newsfeedsapp.ui.main.article.ArticleFragmentProvider;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragment;
import com.example.newsfeedsapp.ui.main.MainActivity;
import com.example.newsfeedsapp.ui.main.article.ArticleFragmentModule;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragmentModule;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            ArticleFragmentProvider.class,
            ArticleDetailFragmentProvider.class
    })
    abstract MainActivity bindMainActivity();

}
