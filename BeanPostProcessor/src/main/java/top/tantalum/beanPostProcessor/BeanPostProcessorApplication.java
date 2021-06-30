package top.tantalum.beanPostProcessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanPostProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanPostProcessorApplication.class, args);
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		ShowMessage sm=(ShowMessage) context.getBean("showMsg");
		System.out.println(sm.getMsg());
		
		context.registerShutdownHook();
	}

}
