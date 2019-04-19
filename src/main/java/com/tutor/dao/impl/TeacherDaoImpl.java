package com.tutor.dao.impl;

import com.tutor.dao.TeacherDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl extends Base implements TeacherDao{
    @Override
    public Integer getMaxTeacherId() {
        String hql="select Max(a.id) from  Teacher a";
        Query query=this.currentSession().createQuery(hql);
        return (Integer) query.uniqueResult();
    }
}
