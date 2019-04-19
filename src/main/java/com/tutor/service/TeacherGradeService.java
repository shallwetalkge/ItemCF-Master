package com.tutor.service;

import com.tutor.entity.TeacherDistance;
import com.tutor.entity.TeacherGrade;

import java.util.List;

public interface TeacherGradeService {

    List<TeacherGrade> getAllTeacherGrade();

    List<TeacherGrade> getByStudentId(Integer id);

    List<TeacherGrade> getByTeacherId(Integer id);

    TeacherGrade getOnlyTeacherGrade(Integer studentId,Integer teacherId);


}
