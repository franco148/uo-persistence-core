package com.fral.uo.data.core;

import com.fral.uo.data.core.api.UmssOnlineDao;
//import com.fral.uo.data.core.model.Review;
//import com.fral.uo.data.core.model.ReviewRating;
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
//		Review review = new Review("First description", ReviewRating.EXCELENT);
//		Review result = dao.persist(review);
//		System.out.println(result);
	}
}
