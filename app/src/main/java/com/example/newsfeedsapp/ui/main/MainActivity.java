package com.example.newsfeedsapp.ui.main;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.newsfeedsapp.BR;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.ViewModelProviderFactory;
import com.example.newsfeedsapp.databinding.ActivityMainBinding;
import com.example.newsfeedsapp.databinding.NavDrawerMainBinding;
import com.example.newsfeedsapp.databinding.NavHeaderMainBinding;
import com.example.newsfeedsapp.ui.base.BaseActivity;
import com.example.newsfeedsapp.ui.main.article.ArticleFragment;
import com.google.android.material.navigation.NavigationView;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel>
        implements MainNavigator, HasSupportFragmentInjector, View.OnClickListener {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;
    private ActivityMainBinding mActivityMainBinding;
    private DrawerLayout mDrawer;
    private MainViewModel mMainViewModel;
    private NavigationView mNavigationView;
    public ActionBarDrawerToggle mDrawerToggle;
    private Toolbar mToolbar;
    private AppBarConfiguration mAppBarConfiguration;
    private NavController mNavController;

    private ImageView ivExploreSelected, ivLiveChatSelected,
            ivGallerySelected, ivWishListSelected, ivEMagazineSelected;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        mMainViewModel = ViewModelProviders.of(this, factory).get(MainViewModel.class);
        return mMainViewModel;
    }

    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Drawable drawable = item.getIcon();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        switch (item.getItemId()) {
            case R.id.action_search:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = getViewDataBinding();
        mMainViewModel.setNavigator(this);
        setUp();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mDrawer != null) {
            mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        }
    }

    public void lockDrawer() {
        if (mDrawer != null) {
            mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        }
    }

    public void unlockDrawer() {
        if (mDrawer != null) {
            mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        }
    }

    public void showHamburgerIcon() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerToggle.setDrawerSlideAnimationEnabled(true);
        mDrawer.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }

    public void showBackIcon() {
        mDrawerToggle.setDrawerIndicatorEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
    }

    private void setUp() {

        mDrawer = mActivityMainBinding.drawerView;
        mToolbar = mActivityMainBinding.toolbar;
        mNavigationView = mActivityMainBinding.navigationView;

        setSupportActionBar(mToolbar);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_explore, R.id.nav_article_detail)
                .setDrawerLayout(mDrawer)
                .build();

        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, mNavController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(mNavigationView, mNavController);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawer,
                mToolbar,
                R.string.open_drawer,
                R.string.close_drawer) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                hideKeyboard();
            }
        };
        mDrawer.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        setupNavMenu();

    }

    private void setupNavMenu() {

        NavDrawerMainBinding navDrawerMainBinding = DataBindingUtil.inflate(getLayoutInflater(),
                R.layout.nav_drawer_main, mActivityMainBinding.navigationView, false);
        mActivityMainBinding.navigationView.addView(navDrawerMainBinding.getRoot());
        navDrawerMainBinding.setViewModel(mMainViewModel);

        navDrawerMainBinding.navItemExplore.setOnClickListener(this::onClick);
        navDrawerMainBinding.navItemLiveChat.setOnClickListener(this::onClick);
        navDrawerMainBinding.navItemGallery.setOnClickListener(this::onClick);
        navDrawerMainBinding.navItemWishList.setOnClickListener(this::onClick);
        navDrawerMainBinding.navItemEMagazine.setOnClickListener(this::onClick);

        ivExploreSelected = navDrawerMainBinding.ivExploreSelected;
        ivLiveChatSelected = navDrawerMainBinding.ivLiveChatSelected;
        ivGallerySelected = navDrawerMainBinding.ivGallerySelected;
        ivWishListSelected = navDrawerMainBinding.ivWishListSelected;
        ivEMagazineSelected = navDrawerMainBinding.ivEMagazineSelected;

    }

    private void selectNavDrawer(Boolean[] booleans){

        if (booleans[0]){
            ivExploreSelected.setImageDrawable(getDrawable(R.drawable.selected));
            ivLiveChatSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivGallerySelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivWishListSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivEMagazineSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
        }
        else if (booleans[1]){
            ivExploreSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivLiveChatSelected.setImageDrawable(getDrawable(R.drawable.selected));
            ivGallerySelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivWishListSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivEMagazineSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
        }
        else if (booleans[2]){
            ivExploreSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivLiveChatSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivGallerySelected.setImageDrawable(getDrawable(R.drawable.selected));
            ivWishListSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivEMagazineSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
        }
        else if (booleans[3]){
            ivExploreSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivLiveChatSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivGallerySelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivWishListSelected.setImageDrawable(getDrawable(R.drawable.selected));
            ivEMagazineSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
        }
        else if (booleans[4]){
            ivExploreSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivLiveChatSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivGallerySelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivWishListSelected.setImageDrawable(getDrawable(R.drawable.un_selected));
            ivEMagazineSelected.setImageDrawable(getDrawable(R.drawable.selected));
        }

    }

    @Override
    public void onClick(View view) {

        Boolean[] booleans = new Boolean[5];

        switch (view.getId()){
            case R.id.navItemExplore:
                mDrawer.closeDrawer(GravityCompat.START);
                booleans[0] = true; booleans[1] = false;
                booleans[2] = false; booleans[3] = false;
                booleans[4] = false;
                selectNavDrawer(booleans);
                break;
            case R.id.navItemLiveChat:
                popupToast(getString(R.string.live_chat));
                booleans[0] = false; booleans[1] = true;
                booleans[2] = false; booleans[3] = false;
                booleans[4] = false;
                selectNavDrawer(booleans);
                break;
            case R.id.navItemGallery:
                popupToast(getString(R.string.gallery));
                booleans[0] = false; booleans[1] = false;
                booleans[2] = true; booleans[3] = false;
                booleans[4] = false;
                selectNavDrawer(booleans);
                break;
            case R.id.navItemWishList:
                popupToast(getString(R.string.wish_list));
                booleans[0] = false; booleans[1] = false;
                booleans[2] = false; booleans[3] = true;
                booleans[4] = false;
                selectNavDrawer(booleans);

                break;
            case R.id.navItemEMagazine:
                popupToast(getString(R.string.e_magazine));
                booleans[0] = false; booleans[1] = false;
                booleans[2] = false; booleans[3] = false;
                booleans[4] = true;
                selectNavDrawer(booleans);
                break;
        }
    }
}
