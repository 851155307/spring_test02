package com.qf.dao;

import com.qf.entity.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> queryAllStudent();
}
