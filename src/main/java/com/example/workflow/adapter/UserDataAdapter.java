package com.example.workflow.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDataAdapter implements JavaDelegate {
	
	private final Logger LOG = LoggerFactory.getLogger(UserDataAdapter.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
	    String name = (String) execution.getVariable("name");
	    String cnpj = (String) execution.getVariable("cnpj");
	    
	    LOG.info("Validacao ok. nome={} e cnpj={}", name, cnpj);
	    execution.setVariable("name", name);
	    execution.setVariable("cnpj", cnpj);
	}
}