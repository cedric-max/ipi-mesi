package com.numeralt.NumerAlt;

import com.numeralt.NumerAlt.service.CandidatDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NumerAltApplication {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Hello from Spring";
	}

	public static void main(String[] args) { SpringApplication.run(NumerAltApplication.class, args);

	}

}
