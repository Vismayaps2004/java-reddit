package com.example.reddit.service;

import com.example.reddit.models.Post;
import com.example.reddit.models.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class FeedService {
    private final PostRepository postRepository;

    public FeedService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public GetPostResponse displayPosts(int currentUserId) {
        ArrayList<Post> feeds = postRepository.displayPosts(currentUserId);
        return GetPostResponse.create(feeds);
    }

    public AddPostResponse addPost(String title, String body) {
        Post post = Post.create(title, body);
        postRepository.addPost(post);
        return AddPostResponse.create(post);
    }

    public Map<String, Boolean> deletePost(int postId) {
        postRepository.deletePost(postId);
        return Map.of("success", true);
    }

    public Map<String, Boolean> likePost(Integer id, int userId) {
        postRepository.likePost(id, userId);
        return Map.of("success", true);
    }

    public Map<String, Boolean> unlikePost(Integer id, int userId) {
        postRepository.unlikePost(id, userId);
        return Map.of("success", true);
    }
}
