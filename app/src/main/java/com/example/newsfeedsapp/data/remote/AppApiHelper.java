
package com.example.newsfeedsapp.data.remote;


import com.example.newsfeedsapp.data.model.ArticlesResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;
import retrofit2.Response;

@Singleton
public class AppApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public Single<Response<ArticlesResponse>> getWebArticles(String source, String apiKey) {
        return mApiHeader.getApiHelper().getWebArticles(source, apiKey);
    }

    @Override
    public Single<Response<ArticlesResponse>> getAssociatedArticles(String source, String apiKey) {
        return mApiHeader.getApiHelper().getAssociatedArticles(source, apiKey);
    }

}
