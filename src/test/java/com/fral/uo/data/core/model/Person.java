package com.fral.uo.data.core.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@MappedSuperclass
//Based on what we need to do, this class will not be abstract.

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String names;
    private String lastNames;

    @Embedded
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "StudentsAndCoursesRelationship",
            joinColumns = @JoinColumn(name = "personId"),
            inverseJoinColumns = @JoinColumn(name = "courseId")
    )
    private List<Course> courses = new ArrayList<>();

    protected Person() {
    }

    public Person(String names, String lastNames) {
        this.names = names;
        this.lastNames = lastNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastnames) {
        this.lastNames = lastnames;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Person{" +
                "names='" + names + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", address=" + address +
                '}';
    }
}
