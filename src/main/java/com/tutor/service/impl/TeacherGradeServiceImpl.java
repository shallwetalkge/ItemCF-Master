package com.tutor.service.impl;

import com.tutor.dao.TeacherGradeDao;
import com.tutor.entity.TeacherGrade;
import com.tutor.service.TeacherGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("teacherGradeService")
public class TeacherGradeServiceImpl implements TeacherGradeService {
    @Autowired
    TeacherGradeDao teacherGradeDao;

    @Override
    public List<TeacherGrade> getAllTeacherGrade() {
        return teacherGradeDao.getAllTeacherGrade();
    }

    @Override
    public List<TeacherGrade> getByStudentId(Integer id) {
        return teacherGradeDao.getByStudentId(id);
    }

    @Override
    public List<TeacherGrade> getByTeacherId(Integer id) {
        return teacherGradeDao.getByTeacherId(id);
    }

    @Override
    public TeacherGrade getOnlyTeacherGrade(Integer studentId, Integer teacherId) {
        return teacherGradeDao.getOnlyTeacherGrade(studentId,teacherId);
    }
}
