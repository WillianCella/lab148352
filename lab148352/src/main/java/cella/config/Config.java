package cella.config;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@JMSDestinationDefinitions(value = {
		@JMSDestinationDefinition(name = "java:/queue/QueuePedido", interfaceName = "javax.jms.Queue", destinationName = "QueuePedido"),
		@JMSDestinationDefinition(name = "java:/topic/TopicVenda", interfaceName = "javax.jms.Topic", destinationName = "TopicVenda") })

@WebServlet("/config")
public class Config extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	public JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	public Queue queue;

	@Resource(lookup = "java:/topic/TopicVenda")
	public Topic topic;
}
