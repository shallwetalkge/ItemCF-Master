package com.tutor.dao;

import com.tutor.entity.TeacherDistance;

import java.util.List;

public interface TeacherDistanceDao {

    List<TeacherDistance> getAllTeacherDistance();


    void updateTeacherDistance(TeacherDistance teacherDistance);


    int getDistanceCount();


    TeacherDistance getOnlyTeacherDistance(Integer teacherIdFirst,Integer teacherIdSecond);
}
