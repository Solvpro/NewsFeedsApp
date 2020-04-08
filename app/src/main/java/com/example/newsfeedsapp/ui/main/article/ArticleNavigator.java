
package com.example.newsfeedsapp.ui.main.article;

import com.example.newsfeedsapp.data.model.ArticlesResponse;

import java.util.List;

public interface ArticleNavigator {

    void handleError(Throwable throwable);

    void updateArticle(List<ArticlesResponse.Article> articleList);

}
