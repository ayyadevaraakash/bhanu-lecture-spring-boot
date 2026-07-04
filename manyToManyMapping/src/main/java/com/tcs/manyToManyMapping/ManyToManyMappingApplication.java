package com.tcs.manyToManyMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.manyToManyMapping.entity.Student;
import com.tcs.manyToManyMapping.entity.Subject;
import com.tcs.manyToManyMapping.repository.StudentRepository;

@SpringBootApplication
public class ManyToManyMappingApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Akash");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Bhanu");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Vasanth");

		Subject sub1 = new Subject();
		sub1.setSubjectId(1);
		sub1.setSubjectName("Maths");

		Subject sub2 = new Subject();
		sub2.setSubjectId(2);
		sub2.setSubjectName("Physics");

		Subject sub3 = new Subject();
		sub3.setSubjectId(3);
		sub3.setSubjectName("Chemistry");

		s1.setSubjects(List.of(sub1, sub2));
		s2.setSubjects(List.of(sub2));
		s3.setSubjects(List.of(sub1, sub3));

		studentRepository.saveAll(List.of(s1, s2, s3));
	}
}