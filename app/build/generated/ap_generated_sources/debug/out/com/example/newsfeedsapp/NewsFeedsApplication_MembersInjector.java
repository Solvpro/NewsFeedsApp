// Generated by Dagger (https://google.github.io/dagger).
package com.example.newsfeedsapp;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class NewsFeedsApplication_MembersInjector
    implements MembersInjector<NewsFeedsApplication> {
  private final Provider<DispatchingAndroidInjector<Activity>>
      activityDispatchingAndroidInjectorProvider;

  public NewsFeedsApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityDispatchingAndroidInjectorProvider) {
    this.activityDispatchingAndroidInjectorProvider = activityDispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<NewsFeedsApplication> create(
      Provider<DispatchingAndroidInjector<Activity>> activityDispatchingAndroidInjectorProvider) {
    return new NewsFeedsApplication_MembersInjector(activityDispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(NewsFeedsApplication instance) {
    injectActivityDispatchingAndroidInjector(
        instance, activityDispatchingAndroidInjectorProvider.get());
  }

  public static void injectActivityDispatchingAndroidInjector(
      NewsFeedsApplication instance,
      DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector) {
    instance.activityDispatchingAndroidInjector = activityDispatchingAndroidInjector;
  }
}