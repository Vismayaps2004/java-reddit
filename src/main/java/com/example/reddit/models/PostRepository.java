package com.example.reddit.models;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class PostRepository {
    private final HashMap<Integer, Post> feeds;

    public PostRepository() {
        this.feeds = new HashMap<Integer, Post>();
    }

    public HashMap<Integer, Post> displayPosts() {
        return feeds;
    }
}
