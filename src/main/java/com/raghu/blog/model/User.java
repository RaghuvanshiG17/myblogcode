package com.raghu.blog.model;

import java.util.HashSet;
import java.util.Set;

public class User {

	private Long id;
	private String username;
	private String passwordHash;
	private String fullname;
	private Set<Post> posts = new HashSet<>();
	
	
	
	public User(Long id, String username, String fullname) {
		this.id = id;
		this.username = username;
		this.fullname = fullname;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passwordHash=" + passwordHash + ", fullname=" + fullname
				+ "]";
	}
	
	
}
