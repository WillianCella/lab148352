package cella.mdbs;

import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import cella.venda.Venda;

@MessageDriven(name = "MdbFinanceiro", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbFinanceiro extends AbstractMDB implements MessageListener {

	@Override
	public void onMessage(Message rcvMessage) {
		Venda msg = null;
		try {
			msg = rcvMessage.getBody(Venda.class);
			this.salvarLog(this.getClass().getSimpleName(), new Date(), msg.toString());
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}