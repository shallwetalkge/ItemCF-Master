package com.tutor.dao.impl;

import com.tutor.dao.StudentDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends Base implements StudentDao {
    @Override
    public Integer getMaxStudentId() {
        String hql="select Max(a.id) from  Student a";
        Query query=this.currentSession().createQuery(hql);
        return (Integer) query.uniqueResult();
    }
}
