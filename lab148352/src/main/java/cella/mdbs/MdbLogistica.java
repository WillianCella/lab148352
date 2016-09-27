package cella.mdbs;

import java.util.Date;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import cella.entrega.Entrega;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbLogistica extends AbstractMDB implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message rcvMessage) {
		Entrega msg = null;
		try {
			msg = rcvMessage.getBody(Entrega.class);
			this.salvarLog(this.getClass().getSimpleName(), new Date(), msg.toString());
			Thread.sleep(30000);
			this.salvarLog(this.getClass().getSimpleName(), new Date(), "A entrega foi mandada embora kk..");
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
