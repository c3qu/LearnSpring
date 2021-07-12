package top.tantalum.constructor.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args);
		App();
	}

	static void App(){
		System.out.println("OK");
		Foot foot=new Foot(4);
		Dog dog =new Dog("ciddy",foot);
		System.out.println(dog);
	}

}
