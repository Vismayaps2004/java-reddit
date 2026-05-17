package com.example.reddit.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public ArrayList<Post> displayPosts(int currentUserId) {
        ArrayList<Post> allFeeds = feeds
                .entrySet()
                .stream()
                .filter(post -> post.getValue().getUserId() == currentUserId || isIncludesSubscription(currentUserId))
                .map(entry -> entry.getValue())
                .skip(0)
                .limit(2)
                .collect(Collectors.toCollection(ArrayList::new));

        return new ArrayList<>(allFeeds);

    }

    private boolean isIncludesSubscription(int currentUserId) {
        int[] subscriptions = new int[]{1, 2, 3, 4};
        return Arrays.stream(subscriptions).anyMatch(value -> value == currentUserId);
    }

    public void deletePost(int postId) {
        feeds.remove(postId);
    }

    public void likePost(Integer id, int userId) {
        Post post = feeds.get(id);
        post.addLike(userId);
    }

    public void unlikePost(Integer id, int userId) {
        Post post = feeds.get(id);
        post.removeLike(userId);
    }
}
