package com.cbotina.newsaggregator.service;

import com.cbotina.newsaggregator.service.dto.article.NewsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
@Slf4j
@Service
public class NewsServiceImpl extends AbstractClient implements INewsService{
    public NewsServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public NewsResponse getNews(String query) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl)
                .queryParam("api-key", apiKey);

        ResponseEntity<NewsResponse> response = restTemplate.exchange(
                builder.toUriString(), HttpMethod.GET,null, NewsResponse.class);

        if(response.getStatusCode().is2xxSuccessful()){
            return response.getBody();
        }
        throw new RuntimeException("Error");
    }

}
