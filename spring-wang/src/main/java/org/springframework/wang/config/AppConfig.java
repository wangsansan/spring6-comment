package org.springframework.wang.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(value = "org.springframework.wang")
@Configuration
@EnableAsync
public class AppConfig {



}
