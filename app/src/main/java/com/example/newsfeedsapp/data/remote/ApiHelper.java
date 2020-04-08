
package com.example.newsfeedsapp.data.remote;

import com.example.newsfeedsapp.data.model.ArticlesResponse;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiHelper {

    @GET(ApiEndPoint.ENDPOINT_WEB_ARTICLES)
    Single<Response<ArticlesResponse>> getWebArticles(@Query("source") String source,
                                                      @Query("apiKey") String apiKey);

    @GET(ApiEndPoint.ENDPOINT_ASSOCIATED_ARTICLES)
    Single<Response<ArticlesResponse>> getAssociatedArticles(@Query("source") String source,
                                                      @Query("apiKey") String apiKey);

}
