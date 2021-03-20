package com.example.workflow.controller;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.model.OnboardingRequest;

@RestController
@RequestMapping("/onboarding/v1")
public class UserController {
	
	@Autowired
	private ProcessEngine camunda;

	@PostMapping("/verify")
    @ResponseStatus(HttpStatus.OK)
    public void health(@RequestBody OnboardingRequest request) {
		placeUser(request);
    }
	
	public ProcessInstance placeUser(OnboardingRequest request) {
	    return camunda.getRuntimeService().startProcessInstanceByKey(//
	    		"camunda_test",
	        Variables
	        	.putValue("name", request.getName())
	            .putValue("cnpj", request.getCnpj())
	            .putValue("blacklist", request.getBlacklist()));
	  }
}