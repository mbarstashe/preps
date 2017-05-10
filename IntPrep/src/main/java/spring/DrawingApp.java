package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // TODO Auto-generated method stub
		  //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  context.registerShutdownHook();
		  Shape tr = (Shape) context.getBean("triangle");
		  tr.draw();
		  
		  Shape circle = (Shape) context.getBean("circle");
		  circle.draw();
	}

}
