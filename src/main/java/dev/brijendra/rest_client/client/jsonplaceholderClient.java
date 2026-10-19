package dev.brijendra.rest_client.client;

import dev.brijendra.rest_client.DTO.Post;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("https://jsonplaceholder.typicode.com")
public interface jsonplaceholderClient {

    @GetExchange("/posts")
    List<Post> getPosts();
}
