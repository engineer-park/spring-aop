package net.zerocoding.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	private static ApplicationContext app;
	
	public static void main(String[] args) {
		app = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		ICalculator cal = (ICalculator) app.getBean("calculator");
		
		cal.add(1, 2);
		cal.div(10, 2);
		
	}
}
