package com.example.workflow.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BlackListAdapter implements JavaDelegate {
	
	private final Logger LOG = LoggerFactory.getLogger(BlackListAdapter.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String cnpj = (String) execution.getVariable("cnpj");
		LOG.info("Nao esta na BlackList, cnpj={}", cnpj);
		LOG.info("id={}", execution.getId());
	}
}