package com.example.reddit.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
public class PostRepository {
    private final HashMap<Integer, Post> feeds;
    private int postId;

    public PostRepository() {
        this.feeds = new HashMap<Integer, Post>();
        this.postId = 0;
    }

    public Post addPost(Post post) {
        post.setPostId(++this.postId);
        feeds.put(postId, post);
        return post;
    }

    public ArrayList<Post> displayPosts() {
        return new ArrayList<>(feeds.values());

    }

    public void deletePost(int postId) {
        feeds.remove(postId);
    }

    public void likePost(Integer id, int userId) {
        Post post = feeds.get(id);
        post.addLike(userId);
    }
}
