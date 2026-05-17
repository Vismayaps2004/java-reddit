package com.example.reddit.service;

import com.example.reddit.models.Post;

public class AddPostResponse {

    private final boolean success;
    private final Post post;

    public AddPostResponse(boolean success, Post post) {
        this.success = success;
        this.post = post;
    }

    public static AddPostResponse create(Post data) {
        return new AddPostResponse(true ,data);
    }

    public boolean isSuccess() {
        return success;
    }

    public Post getPost() {
        return post;
    }
}
