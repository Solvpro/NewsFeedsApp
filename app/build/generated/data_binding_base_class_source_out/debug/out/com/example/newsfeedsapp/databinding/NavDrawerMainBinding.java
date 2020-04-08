// Generated by data binding compiler. Do not edit!
package com.example.newsfeedsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.ui.main.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NavDrawerMainBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivEMagazineDrawerSelected;

  @NonNull
  public final ImageView ivEMagazineSelected;

  @NonNull
  public final ImageView ivExploreDrawerSelected;

  @NonNull
  public final ImageView ivExploreSelected;

  @NonNull
  public final ImageView ivGalleryDrawerSelected;

  @NonNull
  public final ImageView ivGallerySelected;

  @NonNull
  public final ImageView ivLiveChatDrawerSelected;

  @NonNull
  public final ImageView ivLiveChatSelected;

  @NonNull
  public final ImageView ivWishListDrawerSelected;

  @NonNull
  public final ImageView ivWishListSelected;

  @NonNull
  public final ConstraintLayout navItemEMagazine;

  @NonNull
  public final ConstraintLayout navItemExplore;

  @NonNull
  public final ConstraintLayout navItemGallery;

  @NonNull
  public final ConstraintLayout navItemLiveChat;

  @NonNull
  public final ConstraintLayout navItemWishList;

  @NonNull
  public final TextView tvEMagazineDrawer;

  @NonNull
  public final TextView tvExploreDrawer;

  @NonNull
  public final TextView tvGalleryDrawer;

  @NonNull
  public final TextView tvLiveChatDrawer;

  @NonNull
  public final TextView tvWishListDrawer;

  @Bindable
  protected MainViewModel mViewModel;

  protected NavDrawerMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivEMagazineDrawerSelected, ImageView ivEMagazineSelected,
      ImageView ivExploreDrawerSelected, ImageView ivExploreSelected,
      ImageView ivGalleryDrawerSelected, ImageView ivGallerySelected,
      ImageView ivLiveChatDrawerSelected, ImageView ivLiveChatSelected,
      ImageView ivWishListDrawerSelected, ImageView ivWishListSelected,
      ConstraintLayout navItemEMagazine, ConstraintLayout navItemExplore,
      ConstraintLayout navItemGallery, ConstraintLayout navItemLiveChat,
      ConstraintLayout navItemWishList, TextView tvEMagazineDrawer, TextView tvExploreDrawer,
      TextView tvGalleryDrawer, TextView tvLiveChatDrawer, TextView tvWishListDrawer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivEMagazineDrawerSelected = ivEMagazineDrawerSelected;
    this.ivEMagazineSelected = ivEMagazineSelected;
    this.ivExploreDrawerSelected = ivExploreDrawerSelected;
    this.ivExploreSelected = ivExploreSelected;
    this.ivGalleryDrawerSelected = ivGalleryDrawerSelected;
    this.ivGallerySelected = ivGallerySelected;
    this.ivLiveChatDrawerSelected = ivLiveChatDrawerSelected;
    this.ivLiveChatSelected = ivLiveChatSelected;
    this.ivWishListDrawerSelected = ivWishListDrawerSelected;
    this.ivWishListSelected = ivWishListSelected;
    this.navItemEMagazine = navItemEMagazine;
    this.navItemExplore = navItemExplore;
    this.navItemGallery = navItemGallery;
    this.navItemLiveChat = navItemLiveChat;
    this.navItemWishList = navItemWishList;
    this.tvEMagazineDrawer = tvEMagazineDrawer;
    this.tvExploreDrawer = tvExploreDrawer;
    this.tvGalleryDrawer = tvGalleryDrawer;
    this.tvLiveChatDrawer = tvLiveChatDrawer;
    this.tvWishListDrawer = tvWishListDrawer;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static NavDrawerMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.nav_drawer_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NavDrawerMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NavDrawerMainBinding>inflateInternal(inflater, R.layout.nav_drawer_main, root, attachToRoot, component);
  }

  @NonNull
  public static NavDrawerMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.nav_drawer_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NavDrawerMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NavDrawerMainBinding>inflateInternal(inflater, R.layout.nav_drawer_main, null, false, component);
  }

  public static NavDrawerMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NavDrawerMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (NavDrawerMainBinding)bind(component, view, R.layout.nav_drawer_main);
  }
}
