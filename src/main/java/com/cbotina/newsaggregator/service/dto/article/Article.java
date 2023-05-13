package com.cbotina.newsaggregator.service.dto.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Article {
    private String snippet;
    @JsonProperty("web_url")
    private String url;
    private String source;
}
