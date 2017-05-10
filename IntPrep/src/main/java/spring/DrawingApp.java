package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // TODO Auto-generated method stub
		  //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  Triangle tr = (Triangle) context.getBean("triangle");
		  tr.draw();
	}

}
