package com.example.newsfeedsapp.ui.main;

import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.ui.base.BaseViewModel;
import com.example.newsfeedsapp.utils.rx.SchedulerProvider;

public class MainViewModel extends BaseViewModel<MainNavigator> {

    private static final String TAG = "MainViewModel";

    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
