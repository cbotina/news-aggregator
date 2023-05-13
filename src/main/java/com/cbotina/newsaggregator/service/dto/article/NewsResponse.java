package com.cbotina.newsaggregator.service.dto.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NewsResponse {
    public String status;
    public Response response;
}

class Response {
    @JsonProperty("docs")
    public List<Article> articles;
}
