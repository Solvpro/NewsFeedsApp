
package com.example.newsfeedsapp.di.module;

import com.example.newsfeedsapp.data.AppDataManager;
import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.data.remote.ApiHelper;
import com.example.newsfeedsapp.data.remote.AppApiHelper;
import com.example.newsfeedsapp.utils.AppConstants;
import com.example.newsfeedsapp.utils.rx.AppSchedulerProvider;
import com.example.newsfeedsapp.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit.Builder().baseUrl(AppConstants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

}
