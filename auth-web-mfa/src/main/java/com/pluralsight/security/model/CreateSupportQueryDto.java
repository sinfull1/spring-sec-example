package com.pluralsight.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class CreateSupportQueryDto {
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	private String subject;
	private String content;
	private boolean resolved;
	
}
