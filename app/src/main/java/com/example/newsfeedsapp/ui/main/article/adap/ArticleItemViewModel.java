
package com.example.newsfeedsapp.ui.main.article.adap;

import androidx.databinding.ObservableField;

import com.example.newsfeedsapp.data.model.ArticlesResponse;

public class ArticleItemViewModel {

    public final ObservableField<String> author;

    public final ObservableField<String> title;

    public final ObservableField<String> description;

    public final ObservableField<String> url;

    public final ObservableField<String> urlToImage;

    public final ObservableField<String> publishedAt;

    public final ArticleItemViewModelListener mListener;

    private final ArticlesResponse.Article mMore;

    public ArticleItemViewModel(ArticlesResponse.Article more, ArticleItemViewModelListener listener) {
        this.mMore = more;
        this.mListener = listener;
        author = new ObservableField<>(mMore.getAuthor());
        title = new ObservableField<>(mMore.getTitle());
        description = new ObservableField<>(mMore.getDescription());
        url = new ObservableField<>(mMore.getUrl());
        urlToImage = new ObservableField<>(mMore.getUrlToImage());
        publishedAt = new ObservableField<>(mMore.getPublishedAt());
    }

    public void onItemClick() {
        mListener.onItemClick();
    }

    public interface ArticleItemViewModelListener {
        void onItemClick();
    }
}
