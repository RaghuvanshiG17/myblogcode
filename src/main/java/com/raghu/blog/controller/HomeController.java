package com.raghu.blog.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.blog.model.Post;
import com.raghu.blog.services.PostServices;

@Controller
public class HomeController {

	@Autowired
	private PostServices postServicesImpl;
	
	@RequestMapping("/")
	public String index(Model model){
		List<Post> latest5Post = postServicesImpl.findLatest5();
		model.addAttribute("latest5Post",latest5Post);
		
		List<Post> latest3Post = latest5Post.stream().limit(3)
				.collect(Collectors.toList());
		model.addAttribute("latest3Post",latest3Post);
		return "index";
	}
	
}





















