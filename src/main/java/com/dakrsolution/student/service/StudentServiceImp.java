
package com.dakrsolution.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakrsolution.student.model.Student;
import com.dakrsolution.student.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepo stdRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Student student1=stdRepo.save(student);
		return student1;
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student student1=stdRepo.save(student);
		return student1;
	}

	@Override
	public void deleteStudent(Integer stdId) {
		// TODO Auto-generated method stub
		stdRepo.deleteById(stdId);
	}

	@Override
	public Student getStudent(Integer stdId) {
		// TODO Auto-generated method stub
		Optional<Student> student=stdRepo.findById(stdId);
		Student studentReposne=student.get();
		return studentReposne;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList=(List<Student>) stdRepo.findAll();
		return studentList;
	}
}