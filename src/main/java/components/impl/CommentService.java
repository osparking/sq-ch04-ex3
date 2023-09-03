package components.impl;

import org.springframework.stereotype.Component;

import components.CommentNotiProxy;
import components.CommentRepository;
import domain.Comment;

@Component
public class CommentService {
	private CommentRepository repository;
	private CommentNotiProxy notiProxy;
	
	public CommentService(CommentRepository repository, CommentNotiProxy notiProxy) {
		super();
		this.repository = repository;
		this.notiProxy = notiProxy;
	}

	public void publishComment(Comment comment) {
		repository.storeComment(comment);
		notiProxy.notifyCommEmail(comment);
	}
}
