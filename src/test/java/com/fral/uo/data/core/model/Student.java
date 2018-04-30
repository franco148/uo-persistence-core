package com.fral.uo.data.core.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student extends Person {

    @Column(nullable = false)
    private String career;

    @Enumerated(EnumType.STRING)
    private StudyLevel studyLevel;

    @OneToOne(fetch = FetchType.LAZY)
    private StudentCard studentCard;

    @ManyToMany
    @JoinTable(
            name = "StudentsAndTeachersRelationship",
            joinColumns = @JoinColumn(name = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "teacherId")
    )
    private List<Teacher> teachers = new ArrayList<>();

    protected Student() {

    }

    public Student(String names, String lastNames, String career, StudyLevel studyLevel) {
        super(names, lastNames);
        this.career = career;
        this.studyLevel = studyLevel;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(StudyLevel studyLevel) {
        this.studyLevel = studyLevel;
    }

    public StudentCard getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(StudentCard studentCard) {
        this.studentCard = studentCard;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "Student{" +
                "career='" + career + '\'' +
                ", studyLevel=" + studyLevel +
                '}';
    }
}