package com.fral.uo.data.core.impl;

import com.fral.uo.data.core.PersistenceCoreApplication;
import com.fral.uo.data.core.PersistenceCoreApplicationTests;
import com.fral.uo.data.core.api.UmssOnlineDao;
import com.fral.uo.data.core.model.Person;
import com.fral.uo.data.core.model.Review;
import com.fral.uo.data.core.model.Student;
import com.fral.uo.data.core.model.StudyLevel;
import org.h2.jdbc.JdbcSQLException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistenceCoreApplication.class)
public class UmssOnlineDaoImplTest {

    @Autowired
    private UmssOnlineDao umssOnlineDaoImpl;

    //@Test(expected = JdbcSQLException.class)
    @Test(expected = DataIntegrityViolationException.class)
    public void persist() {

        Review review = umssOnlineDaoImpl.find(Review.class, 1001L);
        System.out.println(review);

        Person student = new Student("Franz Roberto", "Arratia Lopez", "Sistemas", StudyLevel.TENTH);
        Person result = umssOnlineDaoImpl.persist(student);
        System.out.println(result);
    }

    @Test
    public void persist1() {
    }

    @Test
    public void find() {
    }

    @Test
    public void load() {
    }

    @Test
    public void find1() {
    }
}