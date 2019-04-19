package com.tutor.service;

import com.tutor.entity.TeacherDistance;

import java.util.List;

public interface TeacherDistanceService {

    List<TeacherDistance> getAllTeacherDistance();

    void update(TeacherDistance teacherDistance);

    int getDistanceCount();

    TeacherDistance getOnlyTeacherDistance(Integer teacherIdFirst, Integer teacherIdSecond);
}
