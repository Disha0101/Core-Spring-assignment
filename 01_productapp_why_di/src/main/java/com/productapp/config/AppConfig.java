package com.productapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //<context:annotation-config/>
@ComponentScan(basePackages = {"com.productapp"})
public class AppConfig {
}
