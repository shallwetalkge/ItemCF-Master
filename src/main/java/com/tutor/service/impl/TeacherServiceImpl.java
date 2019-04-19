package com.tutor.service.impl;

import com.tutor.dao.TeacherDao;
import com.tutor.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherDao teacherDao;

    @Override
    public Integer getMaxTeacherId() {
        return teacherDao.getMaxTeacherId();
    }
}
