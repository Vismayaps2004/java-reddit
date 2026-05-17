package com.example.reddit.controller;

import com.example.reddit.service.AddPostResponse;
import com.example.reddit.service.FeedService;
import com.example.reddit.service.GetPostResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
public class FeedController {
    private final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @PostMapping("/get-posts")
    public GetPostResponse displayPosts () {
      return  feedService.displayPosts();
    }

    @PostMapping("/add-post")
    public AddPostResponse addPost(@RequestBody Addpost addpost) {
        String title = addpost.getTitle();
        String body = addpost.getBody();
        return feedService.addPost(title, body);
    }
}
