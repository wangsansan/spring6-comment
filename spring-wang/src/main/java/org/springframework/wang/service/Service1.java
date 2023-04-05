package org.springframework.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@DependsOn({"myService"})
public class Service1 {

	@Autowired
	private Service2 service2;

	@Async
	public void doSomething() {
		System.out.println("service1 do something");
	}

}
