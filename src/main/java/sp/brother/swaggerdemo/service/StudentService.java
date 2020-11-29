package sp.brother.swaggerdemo.service;

import java.util.List;

import sp.brother.swaggerdemo.entity.StudentEntity;
import sp.brother.swaggerdemo.model.Student;

public interface StudentService {
	public List<Student> getStudentList();
	void save(StudentEntity student);
}
