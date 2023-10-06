package com.spring.codeblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.CodeblogService;

@Controller
public class CodeblogController {
	
	@Autowired
	private CodeblogService codebologService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = codebologService.findAll();
		mv.addObject("posts", posts);
		
		return mv;
		
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public ModelAndView getPostDetails(@PathVariable("id") long id) {
		
		ModelAndView mv = new ModelAndView("postDetails");
		Post post = codebologService.findById(id);
		mv.addObject("post", post);

		return mv;
		
	}

}
