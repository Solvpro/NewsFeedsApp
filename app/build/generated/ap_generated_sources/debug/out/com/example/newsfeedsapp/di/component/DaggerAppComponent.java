// Generated by Dagger (https://google.github.io/dagger).
package com.example.newsfeedsapp.di.component;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.newsfeedsapp.NewsFeedsApplication;
import com.example.newsfeedsapp.NewsFeedsApplication_MembersInjector;
import com.example.newsfeedsapp.ViewModelProviderFactory;
import com.example.newsfeedsapp.ViewModelProviderFactory_Factory;
import com.example.newsfeedsapp.data.AppDataManager;
import com.example.newsfeedsapp.data.AppDataManager_Factory;
import com.example.newsfeedsapp.data.DataManager;
import com.example.newsfeedsapp.data.remote.ApiHeader;
import com.example.newsfeedsapp.data.remote.ApiHeader_Factory;
import com.example.newsfeedsapp.data.remote.ApiHelper;
import com.example.newsfeedsapp.data.remote.AppApiHelper;
import com.example.newsfeedsapp.data.remote.AppApiHelper_Factory;
import com.example.newsfeedsapp.di.builder.ActivityBuilder_BindMainActivity;
import com.example.newsfeedsapp.di.module.AppModule;
import com.example.newsfeedsapp.di.module.AppModule_ProvideApiHelperFactory;
import com.example.newsfeedsapp.di.module.AppModule_ProvideDataManagerFactory;
import com.example.newsfeedsapp.di.module.AppModule_ProvideRetrofitFactory;
import com.example.newsfeedsapp.di.module.AppModule_ProvideSchedulerProviderFactory;
import com.example.newsfeedsapp.ui.main.MainActivity;
import com.example.newsfeedsapp.ui.main.MainActivity_MembersInjector;
import com.example.newsfeedsapp.ui.main.article.ArticleFragment;
import com.example.newsfeedsapp.ui.main.article.ArticleFragmentModule;
import com.example.newsfeedsapp.ui.main.article.ArticleFragmentModule_ProvideLinearLayoutManagerFactory;
import com.example.newsfeedsapp.ui.main.article.ArticleFragmentModule_ProvideMoreAdapterFactory;
import com.example.newsfeedsapp.ui.main.article.ArticleFragmentProvider_ProvideExploreFragmentFactory;
import com.example.newsfeedsapp.ui.main.article.ArticleFragment_MembersInjector;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragment;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragmentProvider_ProvideExploreFragmentFactory;
import com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailFragment_MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ApiHeader> apiHeaderProvider;

  private Provider<AppApiHelper> appApiHelperProvider;

  private Provider<ApiHelper> provideApiHelperProvider;

  private Provider<AppDataManager> appDataManagerProvider;

  private Provider<DataManager> provideDataManagerProvider;

  private AppModule_ProvideSchedulerProviderFactory provideSchedulerProvider;

  private Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return Collections
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.provideRetrofitProvider =
        DoubleCheck.provider(AppModule_ProvideRetrofitFactory.create(builder.appModule));
    this.apiHeaderProvider =
        DoubleCheck.provider(ApiHeader_Factory.create(provideRetrofitProvider));
    this.appApiHelperProvider =
        DoubleCheck.provider(AppApiHelper_Factory.create(apiHeaderProvider));
    this.provideApiHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvideApiHelperFactory.create(builder.appModule, appApiHelperProvider));
    this.appDataManagerProvider =
        DoubleCheck.provider(AppDataManager_Factory.create(provideApiHelperProvider));
    this.provideDataManagerProvider =
        DoubleCheck.provider(
            AppModule_ProvideDataManagerFactory.create(builder.appModule, appDataManagerProvider));
    this.provideSchedulerProvider =
        AppModule_ProvideSchedulerProviderFactory.create(builder.appModule);
    this.viewModelProviderFactoryProvider =
        DoubleCheck.provider(
            ViewModelProviderFactory_Factory.create(
                provideDataManagerProvider, provideSchedulerProvider));
  }

  @Override
  public void inject(NewsFeedsApplication app) {
    injectNewsFeedsApplication(app);
  }

  private NewsFeedsApplication injectNewsFeedsApplication(NewsFeedsApplication instance) {
    NewsFeedsApplication_MembersInjector.injectActivityDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityBuilder_BindMainActivity.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent {
    private Provider<
            ArticleFragmentProvider_ProvideExploreFragmentFactory.ArticleFragmentSubcomponent
                .Builder>
        articleFragmentSubcomponentBuilderProvider;

    private Provider<
            ArticleDetailFragmentProvider_ProvideExploreFragmentFactory
                .ArticleDetailFragmentSubcomponent.Builder>
        articleDetailFragmentSubcomponentBuilderProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(2)
          .put(ArticleFragment.class, (Provider) articleFragmentSubcomponentBuilderProvider)
          .put(
              ArticleDetailFragment.class,
              (Provider) articleDetailFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.articleFragmentSubcomponentBuilderProvider =
          new Provider<
              ArticleFragmentProvider_ProvideExploreFragmentFactory.ArticleFragmentSubcomponent
                  .Builder>() {
            @Override
            public ArticleFragmentProvider_ProvideExploreFragmentFactory.ArticleFragmentSubcomponent
                    .Builder
                get() {
              return new ArticleFragmentSubcomponentBuilder();
            }
          };
      this.articleDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              ArticleDetailFragmentProvider_ProvideExploreFragmentFactory
                  .ArticleDetailFragmentSubcomponent.Builder>() {
            @Override
            public ArticleDetailFragmentProvider_ProvideExploreFragmentFactory
                    .ArticleDetailFragmentSubcomponent.Builder
                get() {
              return new ArticleDetailFragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectFragmentDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MainActivity_MembersInjector.injectFactory(
          instance, DaggerAppComponent.this.viewModelProviderFactoryProvider.get());
      return instance;
    }

    private final class ArticleFragmentSubcomponentBuilder
        extends ArticleFragmentProvider_ProvideExploreFragmentFactory.ArticleFragmentSubcomponent
            .Builder {
      private ArticleFragmentModule articleFragmentModule;

      private ArticleFragment seedInstance;

      @Override
      public ArticleFragmentProvider_ProvideExploreFragmentFactory.ArticleFragmentSubcomponent
          build() {
        if (articleFragmentModule == null) {
          this.articleFragmentModule = new ArticleFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(
              ArticleFragment.class.getCanonicalName() + " must be set");
        }
        return new ArticleFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ArticleFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ArticleFragmentSubcomponentImpl
        implements ArticleFragmentProvider_ProvideExploreFragmentFactory
            .ArticleFragmentSubcomponent {
      private ArticleFragmentModule articleFragmentModule;

      private ArticleFragment seedInstance;

      private ArticleFragmentSubcomponentImpl(ArticleFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private LinearLayoutManager getLinearLayoutManager() {
        return ArticleFragmentModule_ProvideLinearLayoutManagerFactory
            .proxyProvideLinearLayoutManager(articleFragmentModule, seedInstance);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ArticleFragmentSubcomponentBuilder builder) {
        this.articleFragmentModule = builder.articleFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(ArticleFragment arg0) {
        injectArticleFragment(arg0);
      }

      private ArticleFragment injectArticleFragment(ArticleFragment instance) {
        ArticleFragment_MembersInjector.injectMLayoutManager(instance, getLinearLayoutManager());
        ArticleFragment_MembersInjector.injectMArticleAdapter(
            instance,
            ArticleFragmentModule_ProvideMoreAdapterFactory.proxyProvideMoreAdapter(
                articleFragmentModule));
        ArticleFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelProviderFactoryProvider.get());
        return instance;
      }
    }

    private final class ArticleDetailFragmentSubcomponentBuilder
        extends ArticleDetailFragmentProvider_ProvideExploreFragmentFactory
            .ArticleDetailFragmentSubcomponent.Builder {
      private ArticleDetailFragment seedInstance;

      @Override
      public ArticleDetailFragmentProvider_ProvideExploreFragmentFactory
              .ArticleDetailFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ArticleDetailFragment.class.getCanonicalName() + " must be set");
        }
        return new ArticleDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ArticleDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ArticleDetailFragmentSubcomponentImpl
        implements ArticleDetailFragmentProvider_ProvideExploreFragmentFactory
            .ArticleDetailFragmentSubcomponent {
      private ArticleDetailFragmentSubcomponentImpl(
          ArticleDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ArticleDetailFragment arg0) {
        injectArticleDetailFragment(arg0);
      }

      private ArticleDetailFragment injectArticleDetailFragment(ArticleDetailFragment instance) {
        ArticleDetailFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelProviderFactoryProvider.get());
        return instance;
      }
    }
  }
}
