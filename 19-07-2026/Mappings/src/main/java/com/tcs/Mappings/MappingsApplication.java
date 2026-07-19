package com.tcs.Mappings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.Mappings.entity.Branch;
import com.tcs.Mappings.entity.Employee;
import com.tcs.Mappings.entity.Passport;
import com.tcs.Mappings.entity.Person;
import com.tcs.Mappings.entity.Project;
import com.tcs.Mappings.entity.Student;
import com.tcs.Mappings.repository.EmployeeRepository;
import com.tcs.Mappings.repository.PassportRepository;
import com.tcs.Mappings.repository.PersonRepository;
import com.tcs.Mappings.repository.StudentRepository;

@SpringBootApplication
public class MappingsApplication implements CommandLineRunner {
	
//	@Autowired
//	private StudentRepository studentRepository;
	
//	@Autowired
//	private PassportRepository passportRepository;
//	
//	@Autowired
//	private PersonRepository personRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
	}
	
	// MANY TO MANY
	@Override
	public void run(String... args) throws Exception {
		Project p1 = new Project();
		p1.setId(101);
		p1.setName("TCS KYC HUB");
		p1.setManager("Palaniprakasam");
		
		Project p2 = new Project();
		p2.setId(114);
		p2.setName("UDGAM");
		p2.setManager("Amit Singh");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Vasanth N.");
		employee1.setProjects(List.of(p1, p2));
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Shivam G.");
		employee2.setProjects(List.of(p1));
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Ronak W.");
		employee3.setProjects(List.of(p1, p2));
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		
		Employee res = employeeRepository.findById(1).get();
		System.out.println(res);
		
		for(Project project : res.getProjects()) {
			System.out.println(project);
		}
	}
	
//	ONE TO MANY
//	@Override
//	public void run(String... args) throws Exception {
//		Branch branch1=new Branch();
//		branch1.setId(1);
//		branch1.setName("Computer");
//		branch1.setHod("Mr. Akash A.");
//		
//		Branch branch2=new Branch();
//		branch2.setId(2);
//		branch2.setName("Civil");
//		branch2.setHod("Mr. Bhanu P.");
//		
//		Student student1 = new Student();
//		student1.setRollNumber(17);
//		student1.setName("Vasanth N.");
//		student1.setBranch(branch1);
//		
//		Student student2 = new Student();
//		student2.setRollNumber(21);
//		student2.setName("Gowtham M.");
//		student2.setBranch(branch2);
//		
//		Student student3 = new Student();
//		student3.setRollNumber(27);
//		student3.setName("Chaitanya S.");
//		student3.setBranch(branch2);
//		
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
//	}
	
//	one to one code
//	@Override
//	public void run(String... args) throws Exception {
//		Passport passport = new Passport();
//		passport.setPassportNumber(7143);
//		passport.setIssuingOffice("Bengaluru");
//		passport.setDateOfIssue("12-02-2026");
//		passport.setDateOfExpiry("12-12-2027");
//		
//		Person person = new Person();
//		person.setId(1);
//		person.setName("Akash");
//		person.setPassport(passport);
//		
//		personRepository.save(person);
//		
//		personRepository.deleteById(1);
//	}

}