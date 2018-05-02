package com.fral.uo.data.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher extends Person {

    private int workedHours;
    private String speciality;

    @ManyToMany(mappedBy = "teachers")
//    @JsonIgnore
    private List<Student> students = new ArrayList<>();

    protected Teacher() {

    }

    public Teacher(String names, String lastNames, int workedHours, String speciality) {
        super(names, lastNames);
        this.workedHours = workedHours;
        this.speciality = speciality;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workedHours=" + workedHours +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
