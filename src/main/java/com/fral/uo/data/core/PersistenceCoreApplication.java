package com.fral.uo.data.core;

import com.fral.uo.data.core.api.UmssOnlineDao;
//import com.fral.uo.data.core.model.Review;
//import com.fral.uo.data.core.model.ReviewRating;
import com.fral.uo.data.core.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class PersistenceCoreApplication implements CommandLineRunner {

	@Resource
	private UmssOnlineDao dao;

	public static void main(String[] args) {
		SpringApplication.run(PersistenceCoreApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		Address address = new Address("ABC", "DEF", "CBBA", "BOL");
//
//		Person student = new Student("FRAL", "AL", "IS", StudyLevel.TENTH);
//		student.setAddress(address);
//
//        Person teacher = new Teacher("TA1", "TLN", 180, "Mobile");
//        teacher.setAddress(address);
//
//        dao.persist(student);
//        dao.persist(teacher);
//
//        System.out.println("Completed...");
	}
}
