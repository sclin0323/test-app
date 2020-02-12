package com.fubon.testapp.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fubon.testapp.service.RoleServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestTemplateTest.class)
class RestTemplateTest {
	
	private static final Logger log = LoggerFactory.getLogger(RestTemplateTest.class);

	@Test
	void test() {
		log.info("xxxxxxxxxxxxx");
	}

}
