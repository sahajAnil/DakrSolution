package com.dakrsolution.contactus.controller;

import com.dakrsolution.base.WebResponseEntity;
import com.dakrsolution.contactus.ContactDataEntity;
import com.dakrsolution.contactus.service.ContactUsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController("contactUsController")
@RequestMapping("web/contact")
public class ContactUsController {


    @Autowired
    @Qualifier("contactUsServiceImpl")
    ContactUsService contactUsService;


    @PostMapping("save")
    public ResponseEntity<WebResponseEntity<ContactDataEntity>> saveContactUsData(@RequestBody ContactDataEntity contactData){
//        log.info("saving the contact data");
        try{
            contactUsService.saveContactUsData(contactData);
            WebResponseEntity<ContactDataEntity> response = new WebResponseEntity<>(0,"Created Sucessfully");
            return new ResponseEntity<>(response,HttpStatus.OK);
        }catch (Exception exception){
//        log.error("Error in saving the contact details",exception);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public <T> ResponseEntity<WebResponseEntity<List<ContactDataEntity>>> getAllContactDetails(@RequestParam (required = false) int offset,
                                                                                           @RequestParam (required = false) int pageSize,
                                                                                           @RequestParam (required = false) String searchValue){
//        log.info("reterving all the contact details");
        try {
            WebResponseEntity<List<ContactDataEntity>> response = new WebResponseEntity<>(true,"Sucessfully Created",
                    contactUsService.getAllContactDetails(offset,pageSize,searchValue));
            return new ResponseEntity<>(response,HttpStatus.OK);
        }catch (Exception e){
//            log.error("Error in reterving the data",e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("{id}")
    public <T> ResponseEntity<WebResponseEntity<List<ContactDataEntity>>> getAllContactDetails(@PathVariable  String id){
        log.info("reterving the contact detail of "+id);
        try {
            WebResponseEntity<List<ContactDataEntity>> response = new WebResponseEntity<>(true,"Sucessfully Created",
                    contactUsService.getContactDetailById(id));
            return new ResponseEntity<>(response,HttpStatus.OK);
        }catch (Exception e){
            log.error("Error in reterving the data",e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
