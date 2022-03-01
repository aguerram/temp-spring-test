package aw.awssmtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsSmTestApplication {

	private String testen;

	public static void main(String[] args) {
		SpringApplication.run(AwsSmTestApplication.class, args);
	}


	@GetMapping
	public String hello(){
		return testen;
	}

}
