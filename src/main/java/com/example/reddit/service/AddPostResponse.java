package com.example.reddit.service;

import com.example.reddit.models.Post;

public class AddPostResponse {

    private final boolean success;
    private final Post post;

    public AddPostResponse(boolean success, Post post) {
        this.success = success;
        this.post = post;
    }

    public static AddPostResponse create(Post post) {
        return new AddPostResponse(true ,post);
    }
}
