package com.example.workflow.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BlackListTrueLogAdapter implements JavaDelegate {
	
	private final Logger LOG = LoggerFactory.getLogger(BlackListTrueLogAdapter.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("denied", (Boolean) execution.getVariable("blacklist"));
		LOG.info("Usuario na blackList. cnpj={}", (String) execution.getVariable("cnpj"));
	}
}