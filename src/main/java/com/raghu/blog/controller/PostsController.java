package com.raghu.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.blog.model.Post;
import com.raghu.blog.services.NotificationService;
import com.raghu.blog.services.PostServices;

@Controller
public class PostsController {

	@Autowired
	private PostServices postServices;
	
	@Autowired
    private NotificationService notifyService;
	
	 @RequestMapping("/posts/view/{id}")
	public String view( @PathVariable("id") Long id , Model model){
		Post post = postServices.findById(id);
		if (post == null) {
            notifyService.addErrorMessage("Cannot find post #" + id);
            return "redirect:/";
        }
		model.addAttribute("post",post);
		System.out.println("this method is execut .....");
		return "posts/view";
	}
	
}
