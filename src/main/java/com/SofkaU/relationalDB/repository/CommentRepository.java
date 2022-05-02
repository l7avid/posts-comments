package com.SofkaU.relationalDB.repository;

import com.SofkaU.relationalDB.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
