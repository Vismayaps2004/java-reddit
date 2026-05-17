package com.example.reddit.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class Post {
    private final String title;
    private final String body;
    private final String author;
    private final int userId;
    private final ArrayList<Object> likedBy;
    private final LocalDateTime time;
    private int postId;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
        this.author = "vismaya";
        this.userId = 1;
        this.likedBy = new ArrayList<>();
        this.time = LocalDateTime.now();
    }

    public static Post create(String title, String body) {
        return new Post(title, body);
    }

    public void setPostId(int id) {
        this.postId = id;
    };
}
