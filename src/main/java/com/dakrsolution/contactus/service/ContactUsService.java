package com.dakrsolution.contactus.service;

import com.dakrsolution.contactus.ContactDataEntity;

public interface ContactUsService {

    void saveContactUsData(ContactDataEntity contactData);

    <T> T  getAllContactDetails(int offset, int pageSize, String searchValue);

    <T> T getContactDetailById(String id);
}
