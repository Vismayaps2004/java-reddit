package com.example.reddit.service;

import com.example.reddit.models.Post;
import com.example.reddit.models.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FeedService {
    private final PostRepository postRepository;

    public FeedService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public GetPostResponse displayPosts() {
        ArrayList<Post> feeds = postRepository.displayPosts();
        return GetPostResponse.create(feeds);
    }

    public AddPostResponse addPost(String title, String body) {
        Post post = Post.create(title, body);
        postRepository.addPost(post);
        return AddPostResponse.create(post);
    }
}
