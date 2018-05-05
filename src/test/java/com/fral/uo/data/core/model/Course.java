package com.fral.uo.data.core.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
    private List<Person> people = new ArrayList<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.PERSIST)
    private List<Review> reviews = new ArrayList<>();

    protected Course() {

    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
