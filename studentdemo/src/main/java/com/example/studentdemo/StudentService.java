package com.example.studentdemo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	private List<Student> students=new ArrayList<>();
	private static Long currentId=1L;
	public List<Student> getAllStudents(){
		return students;
	}
	public Student getStudentById(Long id) {
		return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found"));
	}
	public Student addStudent(Student student) {
		student.setId(currentId++);
		students.add(student);
		return student;
	}
	public Student updateStudent(Long id,Student updatedStudent) {
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getId().equals(id)) {
				updatedStudent.setId(id);
				students.set(i, updatedStudent);
				return updatedStudent;
			}
		}
		return null;
	}
	public boolean deleteStudent(Long id) {
		return students.removeIf(student -> student.getId().equals(id));
	}
}
