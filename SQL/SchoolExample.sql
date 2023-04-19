CREATE TABLE students(
	sid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE teachers(
	tid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE subjects(
	subid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE grades(
	studentID int NOT NULL references students(sid),
    teacherID int NOT NULL references teachers(tid),
    subjectID int NOT NULL references subjects(subid),
    grade int NOT NULL,
    PRIMARY KEY (studentID, teacherID, subjectID)
);

-- Insert data in students table

INSERT INTO students (sid, name) VALUES(1, 'Simon');
INSERT INTO students (sid, name) VALUES(2, 'Alvin');
INSERT INTO students (sid, name) VALUES(3, 'Theo');
INSERT INTO students (sid, name) VALUES(4, 'Brittany');
INSERT INTO students (sid, name) VALUES(5, 'Jenette');
INSERT INTO students (sid, name) VALUES(6, 'Elenor');
INSERT INTO students (sid, name) VALUES(7, 'Stu');

SELECT * FROM students;

-- Insert data in teachers table

INSERT INTO teachers (tid, name) VALUES (1, 'Washington');
INSERT INTO teachers (tid, name) VALUES (2, 'Adams');
INSERT INTO teachers (tid, name) VALUES (3, 'Jefferson');
INSERT INTO teachers (tid, name) VALUES (4, 'Lincoln');

SELECT * FROM teachers;

-- Insert data in subjects table

INSERT INTO subjects (subid, name) VALUES (1, 'History');
INSERT INTO subjects (subid, name) VALUES (2, 'Biology');
INSERT INTO subjects (subid, name) VALUES (3, 'Math');

SELECT * FROM subjects;

-- Insert data in grades table

INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 1, 9);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 2, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 3, 6);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 2, 4);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 1, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (2, 4, 3, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (3, 4, 3, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 3, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 1, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 3, 3);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 2, 5);

SELECT * FROM grades;

-- Students in order by name

SELECT * FROM students ORDER BY name ASC;
SELECT name FROM students ORDER BY name DESC;

-- Grade in History for Simon

select grade from grades  where studentID = 1 and subjectID = 1;

-- Student names who have not yet taken any classes

select name from students where sid NOT IN (SELECT studentID from grades);

-- Student names who have taken at least one class

select * from students where sid IN (SELECT studentID from grades);

-- Names of teacher who have not yet taught any class

select name from teachers where tid not in (select teacherID from grades);

-- What is id for Biology?

select subid from subjects where name =  'Biology';

-- Names of teachers who have taught Biology

select name from teachers where tid in (select teacherID from grades where subjectID = (select subid from subjects where name = 'Biology'));

-- SUM column elements
select sum(grade) as 'Total sum of grades' from grades;

-- SUM all Simons grades

select SUM(grade) as 'Simons grades sum' from grades where studentID = (select sid from students where name = 'Simon');

-- Average
select avg(grade) from grades;

-- MIN
select min(grade) from grades;

-- MAX
select max(grade) from grades;
