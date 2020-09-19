package com.fubon.testapp.test;

import com.fubon.testapp.app.Application;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = Application.class
)
@Slf4j
public class SwaggerSpecTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void generateSpec() throws IOException {

        String swagger = this.restTemplate.getForObject("/v2/api-docs", String.class);
        log.info(swagger);

        FileUtils.writeStringToFile(new File("target/swagger.json"), swagger, StandardCharsets.UTF_8, false);
    }
}
