
package com.example.newsfeedsapp.data.remote;

import com.example.newsfeedsapp.utils.AppConstants;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
public class ApiHeader {

    private Retrofit mRetrofitServiceApi;

    @Inject
    public ApiHeader(Retrofit retrofitServiceApi) {
        mRetrofitServiceApi = retrofitServiceApi;
    }

    public ApiHelper getApiHelper(){

        if(mRetrofitServiceApi == null){

            mRetrofitServiceApi = new Retrofit
                    .Builder()
                    .baseUrl(AppConstants.BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return mRetrofitServiceApi.create(ApiHelper.class);
    }

}
