package top.tantalum.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("Beans.xml");
		SayHello sh = (SayHello) content.getBean("sayHello");
		sh.getMsg();
	}
}
