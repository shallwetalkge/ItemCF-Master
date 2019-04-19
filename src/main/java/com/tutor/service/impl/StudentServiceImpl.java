package com.tutor.service.impl;

import com.tutor.dao.StudentDao;
import com.tutor.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;
    @Override
    public Integer getMaxStudentId() {
        return studentDao.getMaxStudentId();
    }
}
