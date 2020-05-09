package com.acme.optident.service;

import org.springframework.http.ResponseEntity;

public interface DiagnosticService {
    Comment createComment(Long postId, Comment comment);
    Comment updateComment(Long postId, Long commentId, Comment commentDetails);
    ResponseEntity<?> deleteComment(Long postId, Long commentId);
}
