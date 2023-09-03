package components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import components.CommentNotiProxy;
import components.CommentRepository;
import domain.Comment;

@Component
public class CommentService {
	@Autowired
	private CommentRepository repository;
	@Autowired
	private CommentNotiProxy notiProxy;

	public void publishComment(Comment comment) {
		repository.storeComment(comment);
		notiProxy.notifyCommEmail(comment);
	}
}
