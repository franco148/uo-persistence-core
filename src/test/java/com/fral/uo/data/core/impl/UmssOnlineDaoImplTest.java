package com.fral.uo.data.core.impl;

import com.fral.uo.data.core.PersistenceCoreApplication;
import com.fral.uo.data.core.PersistenceCoreApplicationTests;
import com.fral.uo.data.core.api.UmssOnlineDao;
import com.fral.uo.data.core.model.Person;
import com.fral.uo.data.core.model.Student;
import com.fral.uo.data.core.model.StudyLevel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistenceCoreApplication.class)
public class UmssOnlineDaoImplTest {

    @Autowired
    private UmssOnlineDao umssOnlineDaoImpl;

    @Test
    public void persist() {
        Person student = new Student("Franz Roberto", "Arratia Lopez", "Sistemas", StudyLevel.TENTH);
        umssOnlineDaoImpl.persist(student);
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