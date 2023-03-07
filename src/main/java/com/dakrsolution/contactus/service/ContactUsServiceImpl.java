package com.dakrsolution.contactus.service;

import com.dakrsolution.contactus.ContactDataEntity;
import com.dakrsolution.contactus.repository.ContactUsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service("contactUsServiceImpl")
public class ContactUsServiceImpl implements ContactUsService {


    @Autowired
//    @Qualifier("contactUsDaoImpl")
    ContactUsDao contactUsDao;

    @Override
    @Transactional
    public void saveContactUsData(ContactDataEntity contactData) {
        contactUsDao.save(contactData);
    }

    @Override
    public <T> T  getAllContactDetails(int offset, int pageSize, String searchValue) {
        return (T) contactUsDao.findAll();
    }

    @Override
    public <T> T getContactDetailById(String id) {
        return (T) contactUsDao.findById(id);
    }

}
