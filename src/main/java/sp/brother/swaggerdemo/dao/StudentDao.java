package sp.brother.swaggerdemo.dao;

import java.util.List;

import sp.brother.swaggerdemo.entity.StudentEntity;
import sp.brother.swaggerdemo.model.Student;

public interface StudentDao {
	List<Student> getStudentList();
	void save(StudentEntity student);
}
