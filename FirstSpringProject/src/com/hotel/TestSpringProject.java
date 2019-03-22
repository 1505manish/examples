package com.hotel;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class TestSpringProject {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		//Restaruant restaruantobj = (Restaruant) context.getBean("restaruantbean");
		//restaruantobj.prepareHotDrink();
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		//restaruantobj.displayWaitersNames();
		Restaruant restaruantobj = (Restaruant) context.getBean("restaruantbean");
		//restaruantobj.setWelcomeNote("object is setting welcome note property");
		restaruantobj.greetCustomer();
		((AbstractApplicationContext)context).registerShutdownHook();
		
		/*Restaruant restaruantobj2 = (Restaruant) context.getBean("restaruantbean");
		restaruantobj2.greetCustomer();*/
		
		
		
	}

}
