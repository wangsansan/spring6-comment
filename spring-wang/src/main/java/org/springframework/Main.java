package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.wang.config.AppConfig;
import org.springframework.wang.service.MyService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		MyService bean = ac.getBean(MyService.class);
		System.out.println(bean);
	}
}