package com.qf.sevice.impl;

import com.qf.dao.IStudentDao;
import com.qf.entity.Student;
import com.qf.sevice.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public List<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }
}
