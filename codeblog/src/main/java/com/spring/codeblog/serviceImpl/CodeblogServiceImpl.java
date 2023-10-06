package com.spring.codeblog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodBlogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	@Autowired
	private CodBlogRepository codeBlogRepository;

	@Override
	public List<Post> findAll() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeBlogRepository.save(post);
	}

}
