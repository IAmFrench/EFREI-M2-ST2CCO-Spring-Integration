package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		new ClassPathXmlApplicationContext("moviesApplication.xml");
	}

}
 