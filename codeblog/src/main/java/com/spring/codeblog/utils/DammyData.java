package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodBlogRepository;

@Component
public class DammyData {
	
	@Autowired
	CodBlogRepository codBlogRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Wytlamar Oliveira");
		post1.setData(LocalDate.now());
		post1.setTitulo("Proposições");
		post1.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		
		Post post2 = new Post();
		post2.setAutor("Wyltamar");
		post2.setData(LocalDate.now());
		post2.setTitulo("Uso da Notação @PostConstructor em Spring");
		post2.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		
		Post post3 = new Post();
		post3.setAutor("Wyltamar");
		post3.setData(LocalDate.now());
		post3.setTitulo("Raciocínio Lógico");
		post3.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		
		postList.add(post1);
		postList.add(post2);
		postList.add(post3);
		
		for (Post post : postList) {
			Post postSaved = codBlogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
