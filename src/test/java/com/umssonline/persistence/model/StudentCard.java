package com.umssonline.persistence.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StudentCard {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Date expirationDate;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "card")
    //@OneToOne(fetch = FetchType.LAZY)
    private Student student;


    protected StudentCard() {

    }

    public StudentCard(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentCard{" +
                "expirationDate=" + expirationDate +
                '}';
    }
}
