package com.cbotina.newsaggregator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class AbstractClient {
    @Value("${nytimes.url}")
    protected String baseUrl;

    @Value("${nytimes.apikey}")
    protected String apiKey;

    protected final RestTemplate restTemplate;

    public AbstractClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}
