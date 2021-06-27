package top.tantalum.initAndDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {
	public static void main(String [] args) {
		SpringApplication.run(MainApp.class, args);	
		@SuppressWarnings("resource")
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		InitAndDestroy showMsg=(InitAndDestroy) context.getBean("showMsg");
		System.out.println(showMsg.getMsg());
		context.registerShutdownHook();
	}
}
