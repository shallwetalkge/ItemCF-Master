package com.tutor.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_teacherDistance")
public class TeacherDistance {


    @Id
    @GenericGenerator(name = "generator", strategy = "increment") //设置主键自增
    @GeneratedValue(generator = "generator")
    @Column(name = "teacherDistance_id")
    private Integer id;

    @Column(name = "teacher_id_first")
    private int teacherIdFirst;

    @Column(name = "teacher_id_second")
    private int teacherIdSecond;

    @Column(name = "teacher_distance")
    private double teacherDistance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTeacherIdFirst() {
        return teacherIdFirst;
    }

    public void setTeacherIdFirst(int teacherIdFirst) {
        this.teacherIdFirst = teacherIdFirst;
    }

    public int getTeacherIdSecond() {
        return teacherIdSecond;
    }

    public void setTeacherIdSecond(int teacherIdSecond) {
        this.teacherIdSecond = teacherIdSecond;
    }

    public double getTeacherDistance() {
        return teacherDistance;
    }

    public void setTeacherDistance(double teacherDistance) {
        this.teacherDistance = teacherDistance;
    }
}
