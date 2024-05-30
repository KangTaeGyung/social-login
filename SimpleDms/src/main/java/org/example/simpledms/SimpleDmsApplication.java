package org.example.simpledms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SimpleDmsApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SimpleDmsApplication.class, args);
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
	}

}
