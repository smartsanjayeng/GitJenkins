package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitJenkinsIntegrationApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(GitJenkinsIntegrationApplicationTests.class);
	
	@Test
	void contextLoads() {
		log.info("Its my Test calss GitJenkinsIntegrationApplicationTests ..........");
		assertEquals(true, true);
	}

}
