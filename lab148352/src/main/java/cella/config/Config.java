package cella.config;

import java.io.IOException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@JMSDestinationDefinitions(
		value = {
		        @JMSDestinationDefinition(
		            name = "java:/queue/QueuePedido",
		            interfaceName = "javax.jms.Queue",
		            destinationName = "QueuePedido"
		        ),
		        @JMSDestinationDefinition(
		            name = "java:/topic/TopicVenda",
		            interfaceName = "javax.jms.Topic",
		            destinationName = "TopicVenda"
		        )
		    })

@WebServlet ("/config")
public class Config extends HttpServlet{

    @Inject
    public JMSContext context;

    @Resource(lookup = "java:/queue/QueuePedido")
    public Queue queue;

    @Resource(lookup = "java:/topic/TopicVenda")
    public Topic topic;
}
