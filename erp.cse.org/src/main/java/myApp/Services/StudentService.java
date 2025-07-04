package myApp.Services;

import myApp.Model.Student;
import myApp.Model.User;
import myApp.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public List<Student> getEveryStudent();
    public String insertStudent(Student s);
    public List<Student> getAllBySem(Integer sem);
    public List<Student> getAllByDno(String dname);
    public List<Student> getStudentsOfParticularYear(long sem, String division);
    public void updateStudentFees(String usn, Float fees);
    String insertFacultyUser(Student s, User u);

    public Student getStudent(String usn);
}
