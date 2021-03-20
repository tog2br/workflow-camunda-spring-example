package com.example.workflow.model;

public class OnboardingResponse {
	
	private Boolean verified;
	private String message;
	
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}