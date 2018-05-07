package com.umssonline.persistence.impl;

import com.umssonline.persistence.PersistenceCoreApplication;
import com.umssonline.persistence.api.UmssOnlineDao;
import com.umssonline.persistence.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistenceCoreApplication.class)
public class UmssOnlineDaoImplTest {

    //region TEST PROPERTIES
    @Autowired
    private UmssOnlineDao umssOnlineDaoImpl;
    //endregion


    //region PERSIST METHOD TEST
    @Test
    public void testPersistStudentSuccess() {

        //Given: Fields that a Student should and can contain.
        Address address = new Address("PersonStreet", "PersonZone", "PersonCity", "PersonCountry");
        StudentCard card = new StudentCard(new Date(2018, 12, 31));

        //Given: Instantiate a Student object and set its properties
        Student student = new Student("FR", "AL", "IS", StudyLevel.NINTH);
        student.setAddress(address);
        student.setCard(card);

        //When: Persist Student to the database.
        Student persistedStudent = umssOnlineDaoImpl.persist(student);

        //Then: Student should not be null, and it should have a valid ID
        assertThat(persistedStudent, notNullValue(Student.class));
        assertThat(persistedStudent.getId(), notNullValue());
        assertThat(persistedStudent.getAddress(), notNullValue(Address.class));
        assertThat(persistedStudent.getCard(), notNullValue(StudentCard.class));


        //When: Getting a student with a created ID in previous operation
        Student findPersistedStudent = umssOnlineDaoImpl.find(Student.class, persistedStudent.getId());

        //Then: Student should not be null
        assertThat(findPersistedStudent, notNullValue(Student.class));
        assertThat(findPersistedStudent.getId(), notNullValue());
        assertThat(findPersistedStudent.getAddress(), notNullValue(Address.class));
        assertThat(findPersistedStudent.getCard(), notNullValue(StudentCard.class));
    }

    @Test
    public void testPersistTeacherSuccess() {

        //Given: Fields that a Student should and can contain.
        Address address = new Address("PersonStreet", "PersonZone", "PersonCity", "PersonCountry");

        //Given: Instantiate a Teacher object and set its properties
        Person teacher = new Teacher("FR", "AL", 120, "Engineer");
        teacher.setAddress(address);

        //When: Persist teacher to the database
        Person persistedTeacher = umssOnlineDaoImpl.persist(teacher);

        //Then: Teacher should not be null
        assertThat(persistedTeacher, notNullValue());
        assertThat(persistedTeacher.getId(), notNullValue());
        assertThat(persistedTeacher, is(instanceOf(Teacher.class)));
        assertThat(persistedTeacher.getAddress(), notNullValue(Address.class));
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testPersistStudentErrorWhenNoAddress() {

        //Given: Instantiate a Student object and set its properties
        Person student = new Student("FR", "AL", "IS", StudyLevel.NINTH);

        //When: Persist student an exception is thrown
        umssOnlineDaoImpl.persist(student);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testPersistTeacherErrorWhenNoAddress() {
        //Given: Instantiate a Student object and set its properties
        Person teacher = new Teacher("FR", "AL", 120, "Engineer");

        //When: Persist teacher an exception is thrown
        umssOnlineDaoImpl.persist(teacher);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testPersistStudentErrorWhenNoCard() {
        //Given: Fields that a Student should and can contain.
        Address address = new Address("PersonStreet", "PersonZone", "PersonCity", "PersonCountry");

        //Given: Instantiate a Student object and set its properties
        Student student = new Student("FR", "AL", "IS", StudyLevel.NINTH);
        student.setAddress(address);

        //When: Persist student an exception is thrown
        umssOnlineDaoImpl.persist(student);
    }

    @Test
    public void testPersistCoursesWithPeopleSuccess() {

    }
    //endregion

    //region PERSIST COLLECTION METHOD TEST
    //endregion

    //region FIND METHOD TEST
    //endregion

    //region LOAD METHOD TEST
    //endregion

    //region LOAD JPQL METHOD TEST
    //endregion

    //region DELETE METHOD TEST
    //endregion

}