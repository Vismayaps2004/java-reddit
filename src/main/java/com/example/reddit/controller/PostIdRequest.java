package com.example.reddit.controller;

import lombok.Getter;

@Getter
public class PostIdRequest {
    private Integer postId;

    private void setId(Integer postId) {
        this.postId = postId;
    }

}
