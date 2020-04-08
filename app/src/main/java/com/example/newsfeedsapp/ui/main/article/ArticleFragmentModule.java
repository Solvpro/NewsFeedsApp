
package com.example.newsfeedsapp.ui.main.article;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.newsfeedsapp.ui.main.article.adap.ArticleAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class ArticleFragmentModule {

    @Provides
    ArticleAdapter provideMoreAdapter() {
        return new ArticleAdapter(new ArrayList<>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(ArticleFragment fragment) {
        return new LinearLayoutManager(fragment.getActivity());
    }
}
