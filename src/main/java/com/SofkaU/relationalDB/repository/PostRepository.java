package com.SofkaU.relationalDB.repository;

import com.SofkaU.relationalDB.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
