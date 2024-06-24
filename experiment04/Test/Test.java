package com.experiment04.Test;

import com.experiment04.entity.Student;


import com.experiment04.service.StudentService;
import com.experiment04.service.impl.StudentServiceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
    public static void main(String[] args){
        Student st = new Student(201009, Student.Sex.MALE, "李白", 2010);
        //addStudent(st);
        //listStudentsByYear(2010);
        //listStudentsNames(2010, Student.Sex.MALE);
        //listStudentsByYearSortedById(2010);
        //listStudentsMapBySex();
        //listStudentsByYearMapById(2010);
        removeStudent(201000);
    }

    private static void addStudent(Student st) {
        StudentService studentService = new StudentServiceimpl();
        List<Student> students = new ArrayList<>();
        students = studentService.addStudent(st);
        for(int i=0;i<students.size();i++){
            Student s = students.get(i);
            System.out.print(s.getId()+",");
            System.out.print(s.getSex()+",");
            System.out.print(s.getName()+",");
            System.out.println(s.getYear());
        }
    }
    private static void listStudentsByYear(int year){
        StudentService studentService = new StudentServiceimpl();
        List<Student> students = new ArrayList<>();
        students = studentService.listStudentsByYear(year);
        for(int i=0;i<students.size();i++){
            Student s = students.get(i);
            System.out.print(s.getId()+",");
            System.out.print(s.getSex()+",");
            System.out.print(s.getName()+",");
            System.out.println(s.getYear());
        }
    }
    private static void listStudentsNames(int year, Student.Sex sex){
        StudentService studentService = new StudentServiceimpl();
        List<String> students = new ArrayList<>();
        students = studentService.listStudentsNames(year,sex);
        for(int i=0;i<students.size();i++){
            String s = students.get(i);
            System.out.println(s);
        }
    }
    private static void listStudentsByYearSortedById(int year){
        StudentService studentService = new StudentServiceimpl();
        List<Student> students = new ArrayList<>();
        students = studentService.listStudentsByYearSortedById(year);
        for(int i=0;i<students.size();i++){
            Student s = students.get(i);
            System.out.print(s.getId()+",");
            System.out.print(s.getSex()+",");
            System.out.print(s.getName()+",");
            System.out.println(s.getYear());
        }
    }
    private static void listStudentsMapBySex(){
        StudentService studentService = new StudentServiceimpl();
        Map<Student.Sex, List<Student>> students= new HashMap<>();
        students = studentService.listStudentsMapBySex();
        for (Map.Entry<Student.Sex, List<Student>> entry : students.entrySet()) {
            Student.Sex sex = entry.getKey();
            List<Student> studentList = entry.getValue();

            System.out.println("Sex: " + sex);

            for (Student student : studentList) {
                System.out.println("Id: " + student.getId() + ", Name: " + student.getName()+", Year: " + student.getYear());
            }
        }
    }
    private static void listStudentsByYearMapById(int year){
        StudentService studentService = new StudentServiceimpl();
        Map<Integer, Student> students= new HashMap<>();
        students = studentService.listStudentsByYearMapById(year);
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            Integer Id = entry.getKey();
            Student studentList = entry.getValue();
            System.out.println("Id: " + Id);
            System.out.println("Sex: " + studentList.getSex() + ", Name: " + studentList.getName()+", Year: " + studentList.getYear());
        }
    }
    private static void removeStudent(int id){
        StudentService studentService = new StudentServiceimpl();
        boolean b;
        b = studentService.removeStudent(id);
        if(b){
            System.out.println("成功移除");
        }else{
            System.out.println("移除失败");
        }
    }
}
