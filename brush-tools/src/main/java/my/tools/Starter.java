/**
 * 
 */
package my.tools;

import my.tools.bean.Basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author nirmalyach
 *
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
 
		Basic basic = (Basic) context.getBean("basic");
		basic.print();

	}

}
