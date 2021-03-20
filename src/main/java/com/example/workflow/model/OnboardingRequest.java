package com.example.workflow.model;

public class OnboardingRequest {
	
	private String name;
	private String cnpj;
	private Boolean blacklist;
	
	public Boolean getBlacklist() {
		return blacklist;
	}
	public void setBlacklist(Boolean blacklist) {
		this.blacklist = blacklist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}