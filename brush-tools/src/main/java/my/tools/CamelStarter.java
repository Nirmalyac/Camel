/**
 * 
 */
package my.tools;

import org.apache.activemq.command.ActiveMQDestination;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author nirmalyach
 *
 */
public class CamelStarter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ProducerTemplate camelTemplate = context.getBean("camelTemplate", ProducerTemplate.class);
        System.out.println("Message Sending started");
        camelTemplate.sendBody("jms:queue:queue1","Sample Message for test only");
        System.out.println("Message sent");
	}
	
	
	public void testCamelFunction(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ProducerTemplate camelTemplate = context.getBean("camelTemplate", ProducerTemplate.class);
        System.out.println("Message Sending started");
        camelTemplate.sendBody("jms:queue:queue1","Sample Message for test only");
        System.out.println("Message sent");
	}

}
