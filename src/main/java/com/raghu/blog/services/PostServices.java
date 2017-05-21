package com.raghu.blog.services;

import java.util.List;

import com.raghu.blog.model.Post;

public interface PostServices {

	List<Post> findAll();
	List<Post> findLatest5();
	Post findById(Long id);
	Post create(Post post);
	Post edit(Post post);
	void deleteById(Long id);
	
}
