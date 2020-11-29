package sp.brother.swaggerdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="student_id")
		private int studentId;
		@Column(name="name")
		private String name;
		@Column(name="email")
		private String email;
		@Column(name="mobile")
		private  int mobile;
		@Column(name="status")
		private int status;
		
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		
}
