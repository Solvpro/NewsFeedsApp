package com.example.newsfeedsapp.databinding;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArticleDetailBindingImpl extends FragmentArticleDetailBinding implements com.example.newsfeedsapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clBase, 7);
        sViewsWithIds.put(R.id.clArticleDescription, 8);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArticleDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentArticleDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.btnOpenWebsite.setTag(null);
        this.ivArticleImage.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvArticleAuthor.setTag(null);
        this.tvArticleDate.setTag(null);
        this.tvArticleDescription.setTag(null);
        this.tvArticleTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.newsfeedsapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelArticleLiveData((androidx.lifecycle.MutableLiveData<com.example.newsfeedsapp.data.model.ArticlesResponse.Article>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelArticleLiveData(androidx.lifecycle.MutableLiveData<com.example.newsfeedsapp.data.model.ArticlesResponse.Article> ViewModelArticleLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.newsfeedsapp.data.model.ArticlesResponse.Article viewModelArticleLiveDataGetValue = null;
        java.lang.String viewModelArticleLiveDataDescription = null;
        java.lang.String viewModelArticleLiveDataAuthor = null;
        java.lang.String viewModelArticleLiveDataPublishedAt = null;
        java.lang.String viewModelArticleLiveDataUrlToImage = null;
        java.lang.String viewModelArticleLiveDataTitle = null;
        com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<com.example.newsfeedsapp.data.model.ArticlesResponse.Article> viewModelArticleLiveData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.articleLiveData
                    viewModelArticleLiveData = viewModel.getArticleLiveData();
                }
                updateLiveDataRegistration(0, viewModelArticleLiveData);


                if (viewModelArticleLiveData != null) {
                    // read viewModel.articleLiveData.getValue()
                    viewModelArticleLiveDataGetValue = viewModelArticleLiveData.getValue();
                }


                if (viewModelArticleLiveDataGetValue != null) {
                    // read viewModel.articleLiveData.getValue().description
                    viewModelArticleLiveDataDescription = viewModelArticleLiveDataGetValue.getDescription();
                    // read viewModel.articleLiveData.getValue().author
                    viewModelArticleLiveDataAuthor = viewModelArticleLiveDataGetValue.getAuthor();
                    // read viewModel.articleLiveData.getValue().publishedAt
                    viewModelArticleLiveDataPublishedAt = viewModelArticleLiveDataGetValue.getPublishedAt();
                    // read viewModel.articleLiveData.getValue().urlToImage
                    viewModelArticleLiveDataUrlToImage = viewModelArticleLiveDataGetValue.getUrlToImage();
                    // read viewModel.articleLiveData.getValue().title
                    viewModelArticleLiveDataTitle = viewModelArticleLiveDataGetValue.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnOpenWebsite.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.newsfeedsapp.utils.BindingUtils.setImageUrl(this.ivArticleImage, viewModelArticleLiveDataUrlToImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleAuthor, viewModelArticleLiveDataAuthor);
            com.example.newsfeedsapp.utils.BindingUtils.setDate(this.tvArticleDate, viewModelArticleLiveDataPublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleDescription, viewModelArticleLiveDataDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleTitle, viewModelArticleLiveDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.newsfeedsapp.ui.main.articledetail.ArticleDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.openWebsiteUrl();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.articleLiveData
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}