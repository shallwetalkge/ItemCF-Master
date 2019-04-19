package com.tutor.dao;

import com.tutor.entity.TeacherGrade;

import java.util.List;


public interface TeacherGradeDao {

    List<TeacherGrade> getAllTeacherGrade();

    List<TeacherGrade> getByStudentId(Integer id);

    List<TeacherGrade> getByTeacherId(Integer id);

    TeacherGrade getOnlyTeacherGrade(Integer studentId,Integer teacherId);
}
