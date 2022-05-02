package com.SofkaU.relationalDB.service;

import com.SofkaU.relationalDB.entity.Comment;
import com.SofkaU.relationalDB.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPosts();

}
