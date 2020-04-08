package com.example.newsfeedsapp;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.ui.main.MainViewModel;
import com.example.newsfeedsapp.ui.main.article.ArticleViewModel;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailViewModel;
import com.example.newsfeedsapp.utils.rx.SchedulerProvider;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {

    private final DataManager dataManager;
    private final SchedulerProvider schedulerProvider;

    @Inject
    public ViewModelProviderFactory(DataManager dataManager,
                                    SchedulerProvider schedulerProvider) {
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            //noinspection unchecked
            return (T) new MainViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(ArticleViewModel.class)) {
            //noinspection unchecked
            return (T) new ArticleViewModel(dataManager,schedulerProvider);
        } else if (modelClass.isAssignableFrom(ArticleDetailViewModel.class)) {
            //noinspection unchecked
            return (T) new ArticleDetailViewModel(dataManager,schedulerProvider);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }

}
