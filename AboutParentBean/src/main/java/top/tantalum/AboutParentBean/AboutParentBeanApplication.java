package top.tantalum.AboutParentBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AboutParentBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AboutParentBeanApplication.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//		Transportation transportation = (Transportation) context.getBean("transportation");
//		System.out.println("是否为机动车辆:"+transportation.isMotorVehicle());
		
		Train train=(Train)context.getBean("train");
		System.out.println("是否为机动车辆:"+train.isMotorVehicle());
		System.out.println("车厢数量:"+train.getNumberOfCars());
	}

}
