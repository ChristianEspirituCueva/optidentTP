package com.acme.optident.service;

import com.acme.optident.model.DatingDetails;
import org.springframework.http.ResponseEntity;

public interface DatingDetailService {
    DatingDetails createComment(Long postId, Comment comment);
    Comment updateComment(Long postId, Long commentId, Comment commentDetails);
    ResponseEntity<?> deleteComment(Long postId, Long commentId);
}
