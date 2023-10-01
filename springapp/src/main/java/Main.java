package com.examly.springapp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Student bean
        Student student = (Student) context.getBean("student");
        Scanner input=new Scanner(System.in);
        int studentId=input.nextInt();
        String FirstName=input.nextLine();
        String LastName=input.nextLine();
        // Perform operations with the student object
        student.setStudentId(studentId);
        student.setFirstName(FirstName);
        student.setLastName(LastName);

        // You can print or use the student object as needed
        System.out.println(student);
    }
}
