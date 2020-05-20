package com.codurance.retropolis.acceptance;

import com.codurance.retropolis.Retropolis;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", strict = true)
@CucumberContextConfiguration
@SpringBootTest(classes = Retropolis.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class CucumberIntegrationTest {

}