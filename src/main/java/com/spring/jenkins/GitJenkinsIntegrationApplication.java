package com.spring.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitJenkinsIntegrationApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(GitJenkinsIntegrationApplication.class);
	
	public static void main(String[] args) {
		log.info("GitJenkinsIntegrationApplication Started......");
		SpringApplication.run(GitJenkinsIntegrationApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("CommandLineRunner run method Started......");
		log.info("Length of Argument of CommandLineRunner......"+args.length);
		log.info("CommandLineRunner run method Ended......");
		
	}

}
