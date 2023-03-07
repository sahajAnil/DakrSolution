package com.dakrsolution.contactus.repository;


import com.dakrsolution.contactus.ContactDataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactUsDao extends CrudRepository<ContactDataEntity,String> {

}
