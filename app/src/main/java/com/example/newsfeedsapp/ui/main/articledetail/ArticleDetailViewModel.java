
package com.example.newsfeedsapp.ui.main.articledetail;

import android.content.Intent;
import android.net.Uri;

import androidx.lifecycle.MutableLiveData;

import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.ui.base.BaseViewModel;
import com.example.newsfeedsapp.utils.rx.SchedulerProvider;

public class ArticleDetailViewModel extends BaseViewModel<ArticleDetailNavigator> {

    public final MutableLiveData<ArticlesResponse.Article> articleLiveData;

    public ArticleDetailViewModel(DataManager dataManager,
                         SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        articleLiveData = new MutableLiveData<>();

    }

    public MutableLiveData<ArticlesResponse.Article> getArticleLiveData() {
        return articleLiveData;
    }

    public void openWebsiteUrl(){
        if (articleLiveData.getValue().getUrl() != null
                && !articleLiveData.getValue().getUrl().isEmpty())
            getNavigator().openWebsite(articleLiveData.getValue().getUrl());
    }
}
