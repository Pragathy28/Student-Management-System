package com.example.spring.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.SpringProject.entity.Student;
import com.example.spring.SpringProject.repository.StudentRepository;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
    
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1=new Student("Catherine","Austin","catherineaustin@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student("Steel","Brown","steelbrown@gmail.com");
		studentRepository.save(student2);
		
		Student student3=new Student("Bille","Copper","billecopper@gmail.com");
		studentRepository.save(student3);
		
	}

}
