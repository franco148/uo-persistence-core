
------------------        STUDENT CARD       --------------------
INSERT INTO STUDENT_CARD(id, expiration_date)
VALUES (10001, sysdate());

INSERT INTO STUDENT_CARD(id, expiration_date)
VALUES (10002, sysdate());

INSERT INTO STUDENT_CARD(id, expiration_date)
VALUES (10003, sysdate());

INSERT INTO STUDENT_CARD(id, expiration_date)
VALUES (10004, sysdate());

INSERT INTO STUDENT_CARD(id, expiration_date)
VALUES (10005, sysdate());

---------------------------        STUDENT       ----------------------
INSERT INTO STUDENT(id, names, last_names, career, study_level, street, zone, city, country, card_id)
VALUES (20001, 'Will', 'Smith', 'Actor', 'SEVENTH', 'Street ABC', 'Zone USA', 'New York', 'USA', 10001);

INSERT INTO STUDENT(id, names, last_names, career, study_level, street, zone, city, country, card_id)
VALUES (20002, 'Luis', 'Fonsi', 'Singer', 'FOURTH', 'Street ABC', 'Zone USA', 'New York', 'USA', 10002);

INSERT INTO STUDENT(id, names, last_names, career, study_level, street, zone, city, country, card_id)
VALUES (20003, 'Cameron', 'Dias', 'Actor', 'TENTH', 'Street ABC', 'Zone USA', 'New York', 'USA', 10003);

INSERT INTO STUDENT(id, names, last_names, career, study_level, street, zone, city, country, card_id)
VALUES (20004, 'Steven', 'Gomez', 'Engineer', 'SECOND', 'Street ABC', 'Zone USA', 'New York', 'USA', 10004);

INSERT INTO STUDENT(id, names, last_names, career, study_level, street, zone, city, country, card_id)
VALUES (20005, 'Jet', 'Lee', 'Doctor', 'SIXTH', 'Street ABC', 'Zone USA', 'New York', 'USA', 10005);

---------------------------        TEACHER       ----------------------
INSERT INTO TEACHER(id, names, last_names, worked_hours, speciality, street, zone, city, country)
VALUES (30001, 'Sarah', 'Oconnor', 60, 'Shooter', 'Street ZAT', 'Zone Canada', 'Bogota', 'Colombia');

INSERT INTO TEACHER(id, names, last_names, worked_hours, speciality, street, zone, city, country)
VALUES (30002, 'Junior', 'Dorwey', 120, 'Dancer', 'Street ZAT', 'Zone Canada', 'Bogota', 'Colombia');

---------------------------        COURSES       ----------------------
INSERT INTO COURSE(id, name)
VALUES(40001, 'Programming module 1');

INSERT INTO COURSE(id, name)
VALUES(40002, 'Software architecture');

INSERT INTO COURSE(id, name)
VALUES(40003, 'Artificial Intelligence');

---------------------------        REVIEWS       ----------------------
INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50001, 'EXCELLENT', 'This was an excellent course', 40002);

INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50002, 'BAD', 'This can be improved', 40001);

INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50003, 'GOOD', 'This was an good course', 40001);

INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50004, 'EXCELLENT', 'This was an good course', 40002);

INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50005, 'BAD', 'This can be improved', 40001);

INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50006, 'EXCELLENT', 'This was an good course', 40002);

INSERT INTO REVIEW(id, rating, description, course_id)
VALUES(50007, 'GOOD', 'This was an excellent course', 40002);


---------------------------        STUDENTS AND TEACHERS       ----------------------
INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20001, 30001);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20002, 30001);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20003, 30001);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20004, 30001);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20005, 30001);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20004, 30002);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20002, 30002);

INSERT INTO STUDENTS_AND_TEACHERS (student_id, teacher_id)
VALUES(20003, 30002);

---------------------------        PEOPLE AND COURSES       ----------------------
INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20001, 40001);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20002, 40002);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20003, 40003);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20004, 40001);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20005, 40001);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(30002, 40001);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(30001, 40003);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20004, 40002);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20003, 40001);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20005, 40002);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(30002, 40002);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20005, 40003);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20003, 40002);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(30002, 40003);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(20001, 40003);

INSERT INTO PERSON_COURSES (person_id, course_id)
VALUES(30001, 40002);
