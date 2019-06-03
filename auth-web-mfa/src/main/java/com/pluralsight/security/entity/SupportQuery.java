package com.pluralsight.security.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Document
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(exclude = "posts")
public class SupportQuery {
	public SupportQuery(String username, String subject) {
		super();
		this.username = username;
		this.subject = subject;
	}

	@Id
	private String id;
	private String username;
	private String subject;
	private List<Post> posts = new ArrayList<Post>();
	private Calendar created = Calendar.getInstance();
	private boolean resolved;

	public void addPost(Post post) {
		this.posts.add(post);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public boolean isResolved() {
		return resolved;
	}

	public void addPost(String post, String username) {
		posts.add(new Post(username, post, System.currentTimeMillis()));
	}

	public void resolve() {
		this.resolved = true;
	}

	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}

}
