package com.example.reddit.service;

import com.example.reddit.models.Post;
import com.example.reddit.models.PostRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FeedService {
    private final PostRepository postRepository;

    public FeedService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public HashMap<Integer, Post> displayPosts() {
        return postRepository.displayPosts();
    }
}
