package com.example.newsfeedsapp.data;

import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.data.remote.ApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;
import retrofit2.Response;

@Singleton
public class AppDataManager implements DataManager {

    private final ApiHelper mApiHelper;

    @Inject
    public AppDataManager(ApiHelper apiHelper) {
        mApiHelper = apiHelper;
    }

    @Override
    public Single<Response<ArticlesResponse>> getWebArticles(String source, String apiKey) {
        return mApiHelper.getWebArticles(source, apiKey);
    }

    @Override
    public Single<Response<ArticlesResponse>> getAssociatedArticles(String source, String apiKey) {
        return mApiHelper.getAssociatedArticles(source, apiKey);
    }
}
