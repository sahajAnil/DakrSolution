
  
  

package com.dakrsolution.student.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakrsolution.student.model.Student;
import com.dakrsolution.student.service.StudentService;

@RestController
@RequestMapping("web/student")
public class StudentController {

	@Autowired
	private StudentService stdService;

	@PostMapping("/save")
	public String saveData(@RequestBody Student studentModel) {
	
		Student student2=stdService.saveStudent(studentModel);
		String message = null;
		if (student2 != null) {
			message = "Student saved successfully in DataBase";
		} else {
			message = "Student not save in Database";
		}

		return message; 
	}

	@PutMapping("/update/{stdId}")
	public Student updateStudent(@RequestBody Student studentModel,
			@PathVariable Integer stdId) {

		Student studentReposne=stdService.getStudent(stdId);
		Student student = new Student();
		student.setStdId(stdId);
		student.setStdName(studentModel.getStdName());
		student.setStdCourse(studentModel.getStdCourse());
		Student student2=stdService.updateStudent(student);
		return student2;
	}

	@GetMapping("/get/{stdId}")
	public Student findById(@PathVariable Integer stdId) {
		Student student = stdService.getStudent(stdId);
		Student studentModel = new Student();
		
		if (student != null) {
			BeanUtils.copyProperties(student, studentModel);
		}
		return studentModel;
	}
	
	@GetMapping("/getAll")
	public List<Student> findAll() {
		List<Student> studentList = stdService.getAllStudent();
//		List<Student> stdentModelList=new ArrayList<>();
//		Student studentModel = null;
//		for(Student entity:studentList) {
//			Student model=new Student();
//			BeanUtils.copyProperties(entity, model);
//			stdentModelList.add(model);
//		}
		return studentList;
	}

	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam(name = "studentId",required = false) Integer stdId) {
		stdService.deleteStudent(stdId);
	}	
}
  
  
