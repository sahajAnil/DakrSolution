
package com.dakrsolution.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student2")
public class Student {
	@Id
	private int stdId;
	
	@Column()
	private String stdName;
	
	@Column(name="scourse")
	private String stdCourse;

	public Student() {
		super();
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}
	
	//PDC+PSM+PGM+PPC+toString()
	

	
	
	
	
}