package com.example.reddit.controller;

import com.example.reddit.service.AddPostResponse;
import com.example.reddit.service.FeedService;
import com.example.reddit.service.GetPostResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
public class FeedController {
    private final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @PostMapping("/get-posts")
    public GetPostResponse displayPosts () {
        int userId = 2;
      return  feedService.displayPosts(userId);
    }

    @PostMapping("/add-post")
    public AddPostResponse addPost(@RequestBody Addpost addpost) {
        String title = addpost.getTitle();
        String body = addpost.getBody();
        return feedService.addPost(title, body);
    }

    @PostMapping("/delete-post")
    public Map<String, Boolean> deletePost(@RequestBody PostIdRequest postId) {
        Integer id = postId.getPostId();
        return feedService.deletePost(id);
    }

    @PostMapping("/like-post")
    public Map<String, Boolean> likePost(@RequestBody PostIdRequest postId) {
        Integer id = postId.getPostId();
        int userId = 1;
        return feedService.likePost(id, userId);
    }
    @PostMapping("/unlike-post")
    public Map<String, Boolean> unlikePost(@RequestBody PostIdRequest postId) {
        Integer id = postId.getPostId();
        int userId = 1;
        return feedService.unlikePost(id, userId);
    }

}
