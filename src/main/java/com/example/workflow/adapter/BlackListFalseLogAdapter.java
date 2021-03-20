package com.example.workflow.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BlackListFalseLogAdapter implements JavaDelegate {
	
	private final Logger LOG = LoggerFactory.getLogger(BlackListFalseLogAdapter.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("denied", (Boolean) execution.getVariable("blacklist"));
		LOG.info("Usuario nao esta na blackList. cnpj={}", (String) execution.getVariable("cnpj"));
	}
}