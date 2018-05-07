package com.umssonline.persistence.model;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private ReviewRating rating;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private Course course;

    protected Review() {

    }

    public Review(String description, ReviewRating rating) {
        this.description = description;
        this.rating = rating;
    }

    public ReviewRating getRating() {
        return rating;
    }

    public void setRating(ReviewRating rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }
}
