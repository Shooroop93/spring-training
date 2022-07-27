package com.sergeev.application.actual;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sergeev.application")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {


}
