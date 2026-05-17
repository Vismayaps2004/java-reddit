package com.example.reddit;

import com.example.reddit.controller.FeedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaRedditApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JavaRedditApplication.class, args);
		context.getBean(FeedController.class);
	}

}
