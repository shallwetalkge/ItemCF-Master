package com.tutor.dao.impl;

import com.tutor.dao.TeacherGradeDao;
import com.tutor.entity.TeacherGrade;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TeacherGradeDaoImpl extends Base implements TeacherGradeDao {
    @Override
    public List<TeacherGrade> getAllTeacherGrade() {
        String hql="from TeacherGrade ";
        Query query=this.currentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public List<TeacherGrade> getByStudentId(Integer id) {
        String hql="from TeacherGrade a  where a.studentId=?";
        Query query=this.currentSession().createQuery(hql);
        query.setParameter(0,id);
        return query.list();
    }

    @Override
    public List<TeacherGrade> getByTeacherId(Integer id) {
        String hql="from TeacherGrade a where a.teacherId=?";
        Query query=this.currentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public TeacherGrade getOnlyTeacherGrade(Integer studentId, Integer teacherId) {
        String hql="from TeacherGrade a where a.studentId=? and a.teacherId=?";
        Query query=this.currentSession().createQuery(hql);
        query.setParameter(0,studentId);
        query.setParameter(1,teacherId);
        return (TeacherGrade) query.uniqueResult();
    }

}
