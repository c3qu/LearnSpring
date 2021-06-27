package top.tantalum.aboutScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		TestScope ts1 = (TestScope) context.getBean("testScope");
		ts1.setMsg("大杀特杀");
		System.out.println("ts1:"+ts1.getMsg());
		
		TestScope ts2 = (TestScope) context.getBean("testScope");
		System.out.println("ts2:"+ts2.getMsg());
	}
}
