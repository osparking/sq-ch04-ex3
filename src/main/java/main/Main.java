package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import components.impl.CommentService;
import config.ProjectConfig;
import domain.Comment;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = ctx.getBean(CommentService.class);
		var comment = new Comment();
		comment.setText("오늘 같이 등산해서 고맙습니다");
		comment.setAuthor("송혜교");
		service.publishComment(comment);
	}

}
