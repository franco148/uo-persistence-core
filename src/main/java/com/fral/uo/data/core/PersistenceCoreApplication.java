package com.fral.uo.data.core;

import com.fral.uo.data.core.api.UmssOnlineDao;
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
		dao.persist(new Object());
	}
}
