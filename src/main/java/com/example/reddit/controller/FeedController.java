package com.example.reddit.controller;

import com.example.reddit.models.Post;
import com.example.reddit.service.FeedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FeedController {
    private final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @GetMapping("/display-posts")
    public HashMap<Integer, Post> displayPosts () {
      return  feedService.displayPosts();
    }

}
