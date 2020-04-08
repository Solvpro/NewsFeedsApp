
package com.example.newsfeedsapp.di.component;

import android.app.Application;

import com.example.newsfeedsapp.NewsFeedsApplication;
import com.example.newsfeedsapp.di.builder.ActivityBuilder;
import com.example.newsfeedsapp.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(NewsFeedsApplication app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
