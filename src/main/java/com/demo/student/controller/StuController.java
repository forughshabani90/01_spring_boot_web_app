package com.demo.student.controller;

import com.demo.student.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/"})
public class StuController {
    public List<Student> students=new ArrayList<>();

    @GetMapping
    public List<Student> get(){
        return students;
    }
    @PostMapping
    public Student save(@RequestBody Student student){
       students.add(student);
        return student;
    }
     @DeleteMapping
    public void delet(@PathVariable("id") int id){
        students.remove(id);
     }
     @PutMapping({"id"})
    public Student update(@PathVariable("id")int id , Student student){
        Student student1=new Student();
        for (Student stu: students){
            if (stu.getId()==id) {
                student1 = stu;
            }
            if (student.getFirstname()!=null){
                student1.setFirstname(student.getFirstname());
             } else if (student.getLastname()!=null) {
                student1.setLastname(student.getLastname());
            }
            students.set(id,student1);
        }
        return student1;
     }


}
