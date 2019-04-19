package com.tutor.service.impl;

import com.tutor.dao.TeacherDistanceDao;
import com.tutor.entity.TeacherDistance;
import com.tutor.service.TeacherDistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherDistance")
public class TeacherDistanceServiceImpl implements TeacherDistanceService{

    @Autowired
    TeacherDistanceDao teacherDistanceDao;

    @Override
    public List<TeacherDistance> getAllTeacherDistance() {
        return teacherDistanceDao.getAllTeacherDistance();
    }

    @Override
    public void update(TeacherDistance teacherDistance) {
        teacherDistanceDao.updateTeacherDistance(teacherDistance);
    }

    @Override
    public int getDistanceCount() {
        return teacherDistanceDao.getDistanceCount();
    }

    @Override
    public TeacherDistance getOnlyTeacherDistance(Integer teacherIdFirst, Integer teacherIdSecond) {
        return teacherDistanceDao.getOnlyTeacherDistance(teacherIdFirst,teacherIdSecond);
    }
}
