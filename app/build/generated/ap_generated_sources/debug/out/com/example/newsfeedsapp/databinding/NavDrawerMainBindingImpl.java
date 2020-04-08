package com.example.newsfeedsapp.databinding;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NavDrawerMainBindingImpl extends NavDrawerMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(22);
        sIncludes.setIncludes(0, 
            new String[] {"nav_header_main"},
            new int[] {1},
            new int[] {com.example.newsfeedsapp.R.layout.nav_header_main});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.navItemExplore, 2);
        sViewsWithIds.put(R.id.ivExploreDrawerSelected, 3);
        sViewsWithIds.put(R.id.ivExploreSelected, 4);
        sViewsWithIds.put(R.id.tvExploreDrawer, 5);
        sViewsWithIds.put(R.id.navItemLiveChat, 6);
        sViewsWithIds.put(R.id.ivLiveChatDrawerSelected, 7);
        sViewsWithIds.put(R.id.ivLiveChatSelected, 8);
        sViewsWithIds.put(R.id.tvLiveChatDrawer, 9);
        sViewsWithIds.put(R.id.navItemGallery, 10);
        sViewsWithIds.put(R.id.ivGalleryDrawerSelected, 11);
        sViewsWithIds.put(R.id.ivGallerySelected, 12);
        sViewsWithIds.put(R.id.tvGalleryDrawer, 13);
        sViewsWithIds.put(R.id.navItemWishList, 14);
        sViewsWithIds.put(R.id.ivWishListDrawerSelected, 15);
        sViewsWithIds.put(R.id.ivWishListSelected, 16);
        sViewsWithIds.put(R.id.tvWishListDrawer, 17);
        sViewsWithIds.put(R.id.navItemEMagazine, 18);
        sViewsWithIds.put(R.id.ivEMagazineDrawerSelected, 19);
        sViewsWithIds.put(R.id.ivEMagazineSelected, 20);
        sViewsWithIds.put(R.id.tvEMagazineDrawer, 21);
    }
    // views
    @Nullable
    private final com.example.newsfeedsapp.databinding.NavHeaderMainBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NavDrawerMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private NavDrawerMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[17]
            );
        this.mboundView0 = (com.example.newsfeedsapp.databinding.NavHeaderMainBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.newsfeedsapp.ui.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.newsfeedsapp.ui.main.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}