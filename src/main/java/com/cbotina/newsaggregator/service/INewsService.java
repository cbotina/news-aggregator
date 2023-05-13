package com.cbotina.newsaggregator.service;

import com.cbotina.newsaggregator.service.dto.article.NewsResponse;

public interface INewsService {
    NewsResponse getNews(String query);
}
