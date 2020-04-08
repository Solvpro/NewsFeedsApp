
package com.example.newsfeedsapp.ui.main.article.adap;

public class ArticleEmptyItemViewModel {

    private ArticleEmptyItemViewModelListener mListener;

    public ArticleEmptyItemViewModel(ArticleEmptyItemViewModelListener listener) {
        this.mListener = listener;
    }

    public void onRetryClick() {
        mListener.onRetryClick();
    }

    public interface ArticleEmptyItemViewModelListener {

        void onRetryClick();

    }
}
