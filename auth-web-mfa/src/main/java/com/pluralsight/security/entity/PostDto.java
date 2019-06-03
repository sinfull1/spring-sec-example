package com.pluralsight.security.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

	public PostDto(String queryId, String content, String username, boolean resolve) {
		super();
		this.queryId = queryId;
		this.content = content;
		this.username = username;
		this.resolve = resolve;
	}

	public PostDto() {
		// TODO Auto-generated constructor stub
	}

	private String queryId;
	private String content;
	private String username;
	private boolean resolve;

	public void setQueryId(String id) {
		this.queryId = id;

	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isResolve() {
		return resolve;
	}

	public void setResolve(boolean resolve) {
		this.resolve = resolve;
	}

	public String getQueryId() {
		return queryId;
	}

}
