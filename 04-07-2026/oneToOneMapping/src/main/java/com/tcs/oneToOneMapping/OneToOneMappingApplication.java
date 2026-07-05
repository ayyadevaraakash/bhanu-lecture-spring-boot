package com.tcs.oneToOneMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.oneToOneMapping.entity.Aadhaar;
import com.tcs.oneToOneMapping.entity.Person;
import com.tcs.oneToOneMapping.repository.AadhaarRepository;
import com.tcs.oneToOneMapping.repository.PersonRepository;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private AadhaarRepository aadhaarRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Aadhaar aadhaar = new Aadhaar();
		aadhaar.setAadhaarNo(9172);
		aadhaar.setAadhaarCenterLocation("Mumbai");
		
		aadhaarRepository.save(aadhaar);
		
		Person person = new Person();
		person.setId(1);
		person.setName("Akash");
		person.setAge(25);
		person.setAadhaar(aadhaar);
		
		personRepository.save(person);
	}

}