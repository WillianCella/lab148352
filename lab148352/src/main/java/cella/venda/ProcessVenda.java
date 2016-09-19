package cella.venda;

import javax.ejb.Stateless;
import javax.inject.Inject;

import cella.config.Config;

@Stateless
public class ProcessVenda {
	
	@Inject
	private Config config;
	
	public void processarVenda(Venda venda) {
		
		config.context.createProducer().send(config.topic, venda);
		
	}
}
