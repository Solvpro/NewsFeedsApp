// Generated by Dagger (https://google.github.io/dagger).
package com.example.newsfeedsapp;

import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ViewModelProviderFactory_Factory implements Factory<ViewModelProviderFactory> {
  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  public ViewModelProviderFactory_Factory(
      Provider<DataManager> dataManagerProvider, Provider<SchedulerProvider> schedulerProvider) {
    this.dataManagerProvider = dataManagerProvider;
    this.schedulerProvider = schedulerProvider;
  }

  @Override
  public ViewModelProviderFactory get() {
    return provideInstance(dataManagerProvider, schedulerProvider);
  }

  public static ViewModelProviderFactory provideInstance(
      Provider<DataManager> dataManagerProvider, Provider<SchedulerProvider> schedulerProvider) {
    return new ViewModelProviderFactory(dataManagerProvider.get(), schedulerProvider.get());
  }

  public static ViewModelProviderFactory_Factory create(
      Provider<DataManager> dataManagerProvider, Provider<SchedulerProvider> schedulerProvider) {
    return new ViewModelProviderFactory_Factory(dataManagerProvider, schedulerProvider);
  }

  public static ViewModelProviderFactory newViewModelProviderFactory(
      DataManager dataManager, SchedulerProvider schedulerProvider) {
    return new ViewModelProviderFactory(dataManager, schedulerProvider);
  }
}