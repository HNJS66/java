package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;

import javax.xml.crypto.Data;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentServiceimpl implements StudentService {
    @Override
    public List<Student> addStudent(Student student) {
        return DatabaseUtils.listStudents().stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),students ->{
                    students.add(student);
                    return students;
                }));
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.listStudents().stream()
                .filter(student->student.getYear()==year)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return DatabaseUtils.listStudents().stream()
                .filter(student -> student.getYear() == year && student.getSex() == sex)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> listStudentsByYearSortedById(int year){
        return DatabaseUtils.listStudents().stream()
                .filter(student->student.getYear()==year)
                .sorted(Comparator.comparing(Student::getId).reversed())
                .collect(Collectors.toList());
    }
    @Override
    public Map<Student.Sex, List<Student>> listStudentsMapBySex() {
        return DatabaseUtils.listStudents().stream()
                .collect(Collectors.groupingBy(Student::getSex));
    }

    @Override
    public Map<Integer, Student>  listStudentsByYearMapById(int year) {
        return DatabaseUtils.listStudents().stream()
                .filter(student->student.getYear()==year)
                .collect(Collectors.toMap(Student::getId,student->student));
    }

    @Override
    public boolean removeStudent(int id) {
        List<Student> students1 = DatabaseUtils.listStudents();
        List<Student> students2 = DatabaseUtils.listStudents();
        students1 = students1.stream()
                .filter(student->student.getId()!=id)
                .collect(Collectors.toList());
        if (students2.size() == students1.size()+1){
            return true;
        }else{
            return false;
        }
    }
}
