package com.pluralsight.security.model;

import java.util.Calendar;
import java.util.List;

import com.pluralsight.security.entity.PostDto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class SupportQueryDto {

	private  String id;
	public SupportQueryDto(String id, String subject, Calendar creationTime, String username, boolean resolved,
			List<PostDto> posts) {
		super();
		this.id = id;
		this.subject = subject;
		this.creationTime = creationTime;
		this.username = username;
		this.resolved = resolved;
		this.posts = posts;
	}
	private  String subject;
	private  Calendar creationTime;
	private  String username;
	private  boolean resolved;
	private  List<PostDto> posts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Calendar getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Calendar creationTime) {
		this.creationTime = creationTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	public List<PostDto> getPosts() {
		return posts;
	}
	public void setPosts(List<PostDto> posts) {
		this.posts = posts;
	}
	
}
