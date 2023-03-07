package com.dakrsolution.contactus.repository;

import com.dakrsolution.base.BaseServiceImpl;
import com.dakrsolution.contactus.ContactDataEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("contactUsDaoImpl")
public class ContactUsDaoImpl extends BaseServiceImpl {

//    @Autowired
//    SessionFactory sessionFactory;
//    @Override
//    public void saveContactUsData(ContactDataEntity contactData) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(contactData);
//    }
//
//    @Override
//    public <T> T  getAllContactDetails(int offset, int pageSize, String searchValue) {
//        Session session = sessionFactory.getCurrentSession();
//
//        Criteria criteria =  session.createCriteria(ContactDataEntity.class)
//                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
//
//        Criteria countCriteria = session.createCriteria(ContactDataEntity.class)
//                .setProjection(Projections.rowCount());
//        return paginationResponse(offset,pageSize,true,criteria,countCriteria);
//    }


}
