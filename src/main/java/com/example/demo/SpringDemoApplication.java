package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.rest.KittenController;
import com.example.demo.service.KittenServiceList;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(SpringDemoApplication.class, args);
		KittenController controller = beanBag.getBean(KittenController.class);
		System.out.println(controller);
		
		KittenServiceList service = beanBag.getBean(KittenServiceList.class);
		System.out.println(service);
		
		//How you do it without spring
		KittenServiceList myService = new KittenServiceList();
		KittenController myController = new KittenController(myService);
	}

}
