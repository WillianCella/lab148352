package cella.entrega;

import javax.ejb.Stateless;
import javax.inject.Inject;

import cella.config.Config;

@Stateless
public class ProcessEntrega {

	@Inject
	Config config;
	
	public void processarEntrega(Entrega entrega) {
		config.context.createProducer().send(config.queue, entrega);
	}
}