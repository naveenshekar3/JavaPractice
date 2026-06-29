package javaPrograms;

import java.util.*;

public class Student {
     int studentId;
     String name;
     int grade;

    static  List<Student> listOfStudents = new ArrayList<>();

    public Student(int studentId, String name, int grade){
        this.studentId=studentId;
        this.name=name;
        this.grade = grade;
    }
    public static void main(String[] args) {
        //        Each javaPrograms.Student has:
//        studentId
//                name
//        grade (e.g., 8, 9, 10)
//        The system should be able to:
//        Add a student
//        Remove a student
//        Fetch a student by ID
//        List all students

        Student student1 = new Student(1,"naveen", 8);
        Student student2 = new Student(2,"tom", 8);

        Student student3 = new Student(3,"carie", 9);
        Student student4 = new Student(4,"karthik", 9);

        Student student5 = new Student(5,"navya", 10);
        Student student6 = new Student(6,"chandana", 10);

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);

        for (Student student: listOfStudents){
            System.out.println(student.studentId+","+student.name+","+student.grade);
        }



        Iterator<Student> iterator = listOfStudents.iterator();

        while (iterator.hasNext()){
            Student s = iterator.next();
            if (s.grade==8){
                iterator.remove();
            }
        }

        for (Student s: listOfStudents){
            System.out.println(s.name);
        }

    }
}
