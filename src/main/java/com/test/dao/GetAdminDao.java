package com.test.dao;


import com.test.entity.PmmAdminEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetAdminDao {

    public List<PmmAdminEntity> getAdminList(){
        Session session = null;
        List<PmmAdminEntity> adminEntities = null;

        //实例化configuration,这行代码默认加载hibernate.cfg.xml文件
        Configuration configuration = new Configuration().configure();
        //以configuration创建sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //实例化session
        session = sessionFactory.openSession();
        String hql = "from PmmAdminEntity";
        Query query = session.createQuery(hql);
        adminEntities = query.list();
        return adminEntities;
    }
} 