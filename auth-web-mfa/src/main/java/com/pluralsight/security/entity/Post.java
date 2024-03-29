package com.pluralsight.security.entity;

import org.bson.types.ObjectId;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class Post {

	private String id;
	private final String username;
	private final String content;
	private final long timestamp;

	public Post(String username, String content, long timestamp) {
		this.username=username;
		this.content=content;
		this.timestamp=timestamp;
		this.id = new ObjectId().toHexString();
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

	public String getContent() {
		return content;
	}

	public long getTimestamp() {
		return timestamp;
	}

	
}


