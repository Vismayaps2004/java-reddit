package com.example.reddit.service;

import com.example.reddit.models.Post;

import java.util.ArrayList;

public class GetPostResponse {
    private final boolean success;
    private final ArrayList<Post> data;

    public GetPostResponse(boolean success, ArrayList<Post> data) {
        this.success = success;
        this.data = data;
    }

    public static GetPostResponse create(ArrayList<Post> data) {
        return new GetPostResponse(true, data);
    }

    public boolean isSuccess() {
        return success;
    }

    public ArrayList<Post> getData() {
        return data;
    }
}
