package com.tutor.dao.impl;


import com.tutor.dao.TeacherDistanceDao;
import com.tutor.entity.TeacherDistance;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDistanceDaoImpl extends Base implements TeacherDistanceDao{
    @Override
    public List<TeacherDistance> getAllTeacherDistance() {
        String hql="from TeacherDistance";
        Query query=this.currentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public void updateTeacherDistance(TeacherDistance teacherDistance) {
        this.getHibernateTemplate().update(teacherDistance);
    }

    @Override
    public int getDistanceCount() {
        String hql="select MAX (a.id) from TeacherDistance a";
        Query query=this.currentSession().createQuery(hql);
        return (int)query.uniqueResult();
    }

    @Override
    public TeacherDistance getOnlyTeacherDistance(Integer teacherIdFirst,Integer teacherIdSecond) {
        String hql="from TeacherDistance a where a.teacherIdFirst=? and a.teacherIdSecond=? ";
        Query query=this.currentSession().createQuery(hql);
        query.setParameter(0,teacherIdFirst);
        query.setParameter(1,teacherIdSecond);
        return (TeacherDistance) query.uniqueResult();
    }
}
