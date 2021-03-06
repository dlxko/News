package h.radoslav.au.news.ui.news

import android.arch.lifecycle.LiveData
import h.radoslav.au.news.datasource.IDataSource
import h.radoslav.au.news.models.Article
import h.radoslav.au.news.models.NewsSource


class NewsViewModel(private var remoteData: IDataSource) {

    fun getNews(category: String, language: String): LiveData<NewsSource>
            = remoteData.getNews(category, language)

    fun getArticle(language: String): LiveData<Article>
            = remoteData.getArticle(language)

}