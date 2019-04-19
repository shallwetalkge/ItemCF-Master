package com.tutor.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_teacherGrade")
public class TeacherGrade {


    @Id
    @GenericGenerator(name = "generator", strategy = "increment") //设置主键自增
    @GeneratedValue(generator = "generator")
    @Column(name = "teacherGrade_id")
    private Integer id;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "score1")
    private float teacherScore1;

    @Column(name = "score2")
    private float teacherScore2;

    @Column(name = "score3")
    private float teacherScore3;

    @Column(name = "scoreSum")
    private float scoreSum;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public float getTeacherScore1() {
        return teacherScore1;
    }

    public void setTeacherScore1(float teacherScore1) {
        this.teacherScore1 = teacherScore1;
    }

    public float getTeacherScore2() {
        return teacherScore2;
    }

    public void setTeacherScore2(float teacherScore2) {
        this.teacherScore2 = teacherScore2;
    }

    public float getTeacherScore3() {
        return teacherScore3;
    }

    public void setTeacherScore3(float teacherScore3) {
        this.teacherScore3 = teacherScore3;
    }

    public float getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(float scoreSum) {
        this.scoreSum = scoreSum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
