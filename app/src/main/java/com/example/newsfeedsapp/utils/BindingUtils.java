
package com.example.newsfeedsapp.utils;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.newsfeedsapp.R;
import com.example.newsfeedsapp.data.model.ArticlesResponse;
import com.example.newsfeedsapp.ui.main.article.adap.ArticleAdapter;

import java.util.List;

public final class BindingUtils {

    private BindingUtils() {
        // This class is not publicly instantiable
    }

    @BindingAdapter({"adapter"})
    public static void addArticleItems(RecyclerView recyclerView, List<ArticlesResponse.Article> articles) {
        ArticleAdapter adapter = (ArticleAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(articles);
        }
    }

    @BindingAdapter("setImageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.placeholder);
        // requestOptions.error(R.drawable.ic_error);

        Context context = imageView.getContext();
        Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(url).centerCrop().into(imageView);
    }

    @BindingAdapter({"setDate"})
    public static void setDate(TextView textView, String text)
    {
        if (text != null && !text.isEmpty())
            textView.setText(CommonUtils.getDateFromString(text));
    }
}
