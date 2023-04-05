package org.springframework.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

	@Autowired
	private Service1 service1;
}
