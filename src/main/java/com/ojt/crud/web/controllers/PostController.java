package com.ojt.crud.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ojt.crud.bl.services.post.PostService;
import com.ojt.crud.persistence.entity.Post;

@Controller
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService service;
	
	@RequestMapping(value="/home")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Post> listContact = service.getAllPost();
	    model.addObject("listContact", listContact);
	    model.setViewName("home");
	 
	    return model;
	}	
}