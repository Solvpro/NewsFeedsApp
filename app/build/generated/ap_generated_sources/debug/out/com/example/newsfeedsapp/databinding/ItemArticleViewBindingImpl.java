package com.example.newsfeedsapp.databinding;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemArticleViewBindingImpl extends ItemArticleViewBinding implements com.example.newsfeedsapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemArticleViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemArticleViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.ivArticleImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvArticleAuthor.setTag(null);
        this.tvArticleDate.setTag(null);
        this.tvArticleTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.newsfeedsapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((com.example.newsfeedsapp.ui.main.article.adap.ArticleItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.newsfeedsapp.ui.main.article.adap.ArticleItemViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUrlToImage((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAuthor((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelPublishedAt((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUrlToImage(androidx.databinding.ObservableField<java.lang.String> ViewModelUrlToImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAuthor(androidx.databinding.ObservableField<java.lang.String> ViewModelAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPublishedAt(androidx.databinding.ObservableField<java.lang.String> ViewModelPublishedAt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.databinding.ObservableField<java.lang.String> viewModelUrlToImage = null;
        java.lang.String viewModelTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAuthor = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPublishedAt = null;
        java.lang.String viewModelUrlToImageGet = null;
        java.lang.String viewModelAuthorGet = null;
        java.lang.String viewModelPublishedAtGet = null;
        com.example.newsfeedsapp.ui.main.article.adap.ArticleItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.urlToImage
                        viewModelUrlToImage = viewModel.urlToImage;
                    }
                    updateRegistration(0, viewModelUrlToImage);


                    if (viewModelUrlToImage != null) {
                        // read viewModel.urlToImage.get()
                        viewModelUrlToImageGet = viewModelUrlToImage.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.author
                        viewModelAuthor = viewModel.author;
                    }
                    updateRegistration(1, viewModelAuthor);


                    if (viewModelAuthor != null) {
                        // read viewModel.author.get()
                        viewModelAuthorGet = viewModelAuthor.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.title;
                    }
                    updateRegistration(2, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.publishedAt
                        viewModelPublishedAt = viewModel.publishedAt;
                    }
                    updateRegistration(3, viewModelPublishedAt);


                    if (viewModelPublishedAt != null) {
                        // read viewModel.publishedAt.get()
                        viewModelPublishedAtGet = viewModelPublishedAt.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.example.newsfeedsapp.utils.BindingUtils.setImageUrl(this.ivArticleImage, viewModelUrlToImageGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleAuthor, viewModelAuthorGet);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.example.newsfeedsapp.utils.BindingUtils.setDate(this.tvArticleDate, viewModelPublishedAtGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleTitle, viewModelTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.newsfeedsapp.ui.main.article.adap.ArticleItemViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onItemClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.urlToImage
        flag 1 (0x2L): viewModel.author
        flag 2 (0x3L): viewModel.title
        flag 3 (0x4L): viewModel.publishedAt
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}