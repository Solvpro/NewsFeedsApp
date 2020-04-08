
package com.example.newsfeedsapp.ui.main.article;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.ui.base.BaseViewModel;
import com.example.newsfeedsapp.ui.main.article.adap.ArticleItemViewModel;
import com.example.newsfeedsapp.utils.AppConstants;
import com.example.newsfeedsapp.utils.rx.SchedulerProvider;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public class ArticleViewModel extends BaseViewModel<ArticleNavigator> {

    private final MutableLiveData<List<ArticlesResponse.Article>> articleListLiveData;
    private List<ArticlesResponse.Article> articleList;

    public ArticleViewModel(DataManager dataManager,
                         SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        articleListLiveData = new MutableLiveData<>();
        articleList = new ArrayList<>();
        fetchArticles();
    }

    public void fetchArticles() {
        setIsLoading(true);

        getCompositeDisposable().add(getDataManager()
                .getWebArticles(AppConstants.SOURCE_NEXT, AppConstants.API_KEY)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(articleResponse -> {
                    if (articleResponse != null && articleResponse.body().getData() != null) {
                        articleList.addAll(articleResponse.body().getData());
                    }
                }, throwable -> {
                    getNavigator().handleError(throwable);
                }));

        getCompositeDisposable().add(getDataManager()
                .getWebArticles(AppConstants.SOURCE_ASSOCIATE, AppConstants.API_KEY)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(articleResponse -> {
                    if (articleResponse != null && articleResponse.body().getData() != null) {
                        articleList.addAll(articleResponse.body().getData());
                        articleListLiveData.postValue(articleList);
                    }
                    setIsLoading(false);
                }, throwable -> {
                    setIsLoading(false);
                    getNavigator().handleError(throwable);
                }));

    }

    public MutableLiveData<List<ArticlesResponse.Article>> getArticleListLiveData() {
        return articleListLiveData;
    }
    
}
