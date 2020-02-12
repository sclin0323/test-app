package com.fubon.testapp.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fubon.testapp.api.res.Feature;
import com.fubon.testapp.api.res.PharmacieRes;
import com.fubon.testapp.service.RoleServiceImpl;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestTemplateTest.class)
class RestTemplateTest {
	
	private static final Logger log = LoggerFactory.getLogger(RestTemplateTest.class);

	@Test
	void test() {
		log.info("xxxxxxxxxxxxx");
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		String str = response.getBody();
		Gson g = new Gson();
		PharmacieRes res = g.fromJson(str, PharmacieRes.class); 
		
		for(Feature o : res.getFeatures()) {
			log.info("Type: "+o.getType());
			log.info("Id: "+o.getProperties().getId());
			log.info("Coordinates: "+o.getGeometry().getCoordinates().get(0));
		}
		
		
		
		//log.info("response: "+dto.getFeatures().get(0).getProperties().get(0).getId());
		
//		RestTemplate restTemplate = new RestTemplate();
//		String url = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
//		ResponseEntity<PharmacieRes> response = restTemplate.getForEntity(url, PharmacieRes.class);
//		
//		PharmacieRes o = response.getBody();
//		
//		log.info("Type: "+o.getType());
//		log.info("Size: "+o.getFeatures().size());
	}

}
