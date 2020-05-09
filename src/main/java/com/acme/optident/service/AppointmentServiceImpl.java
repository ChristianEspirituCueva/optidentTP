package com.acme.optident.service;

import org.springframework.http.ResponseEntity;

public class AppointmentServiceImpl {
    @Override
    public Comment createComment(Long postId, Comment comment) {
        return postRepository.findById(postId).map(post -> {
            comment.setPost(post);
            return commentRepository.save(comment);
        }).orElseThrow(() -> new ResourceNotFoundException(
                "Post", "Id", postId));

    }

    @Override
    public Comment updateComment(Long postId, Long commentId, Comment commentDetails) {
        if(!postRepository.existsById(postId))
            throw new ResourceNotFoundException("Post", "Id", postId);

        return commentRepository.findById(commentId).map(comment -> {
            comment.setText(commentDetails.getText());
            return commentRepository.save(comment);
        }).orElseThrow(() -> new ResourceNotFoundException("Comment", "Id", commentId));

    }

    @Override
    public ResponseEntity<?> deleteComment(Long postId, Long commentId) {
        return commentRepository.findByIdAndPostId(commentId, postId).map(comment -> {
            commentRepository.delete(comment);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException(
                "Comment not found with Id " + commentId + " and PostId " + postId));

    }
}