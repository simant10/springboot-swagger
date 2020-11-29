package sp.brother.swaggerdemo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import sp.brother.swaggerdemo.entity.StudentEntity;
import sp.brother.swaggerdemo.model.Student;
import sp.brother.swaggerdemo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/studentlist")
	public List<Student> getStudentList() {
		List<Student> studentData=	studentService.getStudentList();
		return studentData;
		
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentEntity student) {
		studentService.save(student);
		return new String("Successfully save");
		
		
	}
}
