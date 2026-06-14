package com.tcs.manyToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.manyToOne.entity.Branch;
import com.tcs.manyToOne.entity.Student;
import com.tcs.manyToOne.repository.BranchRepository;
import com.tcs.manyToOne.repository.StudentRepository;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private BranchRepository branchRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Branch comps = new Branch();
		comps.setName("Computer");
		comps.setHod("Latha");
		
		Branch civil = new Branch();
		civil.setName("Civil");
		civil.setHod("Pooja");
		
		Branch mech = new Branch();
		mech.setName("Mechanical");
		mech.setHod("Praveen");
		
		branchRepository.save(comps);
		branchRepository.save(civil);
		branchRepository.save(mech);
		
		Student s1 = new Student(1, "Akash", comps);
		Student s2 = new Student(2, "Bhanu", comps);
		Student s3 = new Student(3, "Pradip", mech);
		Student s4 = new Student(4, "Bhavitha", civil);
		Student s5 = new Student(5, "Jayanth", mech);
		
		List<Student> compList = List.of(s1,s2);
		List<Student> mechList = List.of(s3,s5);
		List<Student> civilList = List.of(s4);
		
		comps.setStudents(compList);
		mech.setStudents(mechList);
		civil.setStudents(civilList);
		
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		studentRepository.save(s5);
		
		Branch branch = branchRepository.findById("Computer").get();

		System.out.println("Students in Computer Branch:");

		for(Student s : branch.getStudents()) {
		    System.out.println(s.getId() + " " + s.getName());
		}
	}

}