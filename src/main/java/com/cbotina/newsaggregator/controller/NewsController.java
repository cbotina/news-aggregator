package com.cbotina.newsaggregator.controller;

import com.cbotina.newsaggregator.service.INewsService;
import com.cbotina.newsaggregator.service.dto.article.NewsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class NewsController {
    private final INewsService newsService;

    public NewsController(INewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("news")
    public NewsResponse findNews(@RequestParam("q") String q){
        return newsService.getNews(q);
    }
}
