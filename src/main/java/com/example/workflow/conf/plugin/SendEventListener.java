package com.example.workflow.conf.plugin;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * In this listener you can do basically everything. You could also implement it as 
 * Spring bean an e.g. send events via Kafka to a central monitor - or to call the ELK stack
 * to hand over some events.
 */
public class SendEventListener implements ExecutionListener {
	
	private final Logger LOG = LoggerFactory.getLogger(SendEventListener.class);

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		LOG.info("event={}, activity={}, process instance={}", execution.getEventName(), execution.getCurrentActivityId(), execution.getProcessInstanceId());
	}

}
