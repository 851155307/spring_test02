package com.qf.controller;

import com.qf.entity.Student;
import com.qf.sevice.IStudentService;
import org.apache.ibatis.javassist.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/queryall")
    public List<Student> queryAllStudent(){
        System.out.println("查询所有学生");
        return studentService.queryAllStudent();
    }
}
