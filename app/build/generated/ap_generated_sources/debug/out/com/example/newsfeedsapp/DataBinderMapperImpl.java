package com.example.newsfeedsapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.newsfeedsapp.databinding.ActivityMainBindingImpl;
import com.example.newsfeedsapp.databinding.FragmentArticleBindingImpl;
import com.example.newsfeedsapp.databinding.FragmentArticleDetailBindingImpl;
import com.example.newsfeedsapp.databinding.ItemArticleEmptyViewBindingImpl;
import com.example.newsfeedsapp.databinding.ItemArticleViewBindingImpl;
import com.example.newsfeedsapp.databinding.NavDrawerMainBindingImpl;
import com.example.newsfeedsapp.databinding.NavHeaderMainBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTARTICLE = 2;

  private static final int LAYOUT_FRAGMENTARTICLEDETAIL = 3;

  private static final int LAYOUT_ITEMARTICLEEMPTYVIEW = 4;

  private static final int LAYOUT_ITEMARTICLEVIEW = 5;

  private static final int LAYOUT_NAVDRAWERMAIN = 6;

  private static final int LAYOUT_NAVHEADERMAIN = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.fragment_article, LAYOUT_FRAGMENTARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.fragment_article_detail, LAYOUT_FRAGMENTARTICLEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.item_article_empty_view, LAYOUT_ITEMARTICLEEMPTYVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.item_article_view, LAYOUT_ITEMARTICLEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.nav_drawer_main, LAYOUT_NAVDRAWERMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newsfeedsapp.R.layout.nav_header_main, LAYOUT_NAVHEADERMAIN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTICLE: {
          if ("layout/fragment_article_0".equals(tag)) {
            return new FragmentArticleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_article is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTICLEDETAIL: {
          if ("layout/fragment_article_detail_0".equals(tag)) {
            return new FragmentArticleDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_article_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMARTICLEEMPTYVIEW: {
          if ("layout/item_article_empty_view_0".equals(tag)) {
            return new ItemArticleEmptyViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_article_empty_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMARTICLEVIEW: {
          if ("layout/item_article_view_0".equals(tag)) {
            return new ItemArticleViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_article_view is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVDRAWERMAIN: {
          if ("layout/nav_drawer_main_0".equals(tag)) {
            return new NavDrawerMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_drawer_main is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERMAIN: {
          if ("layout/nav_header_main_0".equals(tag)) {
            return new NavHeaderMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_main is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.example.newsfeedsapp.R.layout.activity_main);
      sKeys.put("layout/fragment_article_0", com.example.newsfeedsapp.R.layout.fragment_article);
      sKeys.put("layout/fragment_article_detail_0", com.example.newsfeedsapp.R.layout.fragment_article_detail);
      sKeys.put("layout/item_article_empty_view_0", com.example.newsfeedsapp.R.layout.item_article_empty_view);
      sKeys.put("layout/item_article_view_0", com.example.newsfeedsapp.R.layout.item_article_view);
      sKeys.put("layout/nav_drawer_main_0", com.example.newsfeedsapp.R.layout.nav_drawer_main);
      sKeys.put("layout/nav_header_main_0", com.example.newsfeedsapp.R.layout.nav_header_main);
    }
  }
}
