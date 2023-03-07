package com.dakrsolution.contactus;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contact")
@Data
public class ContactDataEntity implements Serializable {

    private static final long SERIALVERSIONID = 1l;

    @Id
    @Column
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "sysyem-uuid",strategy = "uuid2")
    private String id;
    @Column(length = 100)
    private String name;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String subject;

    @Column(length = 12)
    private String mobileNumber;

    @Column(length = 255)
    private String message;

    @Column()
    private String document;
}
