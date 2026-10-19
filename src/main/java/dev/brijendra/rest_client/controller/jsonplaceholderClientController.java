package dev.brijendra.rest_client.controller;

import dev.brijendra.rest_client.DTO.Post;
import dev.brijendra.rest_client.client.jsonplaceholderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class jsonplaceholderClientController {

    private final jsonplaceholderClient client;

    public jsonplaceholderClientController(jsonplaceholderClient client) {
        this.client = client;
    }

    @GetMapping
    public List<Post> getPosts() {
        return client.getPosts();
    }
}
