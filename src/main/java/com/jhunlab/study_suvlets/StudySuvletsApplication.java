package com.jhunlab.study_suvlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StudySuvletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySuvletsApplication.class, args);
	}

}
