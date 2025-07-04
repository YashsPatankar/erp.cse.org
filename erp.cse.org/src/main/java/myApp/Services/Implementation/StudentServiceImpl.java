package myApp.Services.Implementation;

import myApp.Model.Student;
import myApp.Model.User;
import myApp.Repository.StudentRepository;
import myApp.Repository.UserRepository;
import myApp.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    UserRepository userRepository;
    @Override
    public List<Student> getEveryStudent() {
        return studentRepository.getAllStudents();
    }

    @Override
    public String insertStudent(Student s) {
        studentRepository.save(s);
        return "Inserted Succesfully";
    }
    @Override
    public List<Student> getStudentsOfParticularYear(long sem, String division) {
        return studentRepository.getStudentsOfParticularYear(sem,division);
    }

    @Override
    public void updateStudentFees(String usn,Float fees) {
        studentRepository.updateFees(usn,fees);
    }

    @Override
    public String insertFacultyUser(Student s, User u) {
        studentRepository.save(s);
        userRepository.save(u);
        return "Student user creted..";
    }

    @Override
    public Student getStudent(String usn) {
        return studentRepository.findByUsn(usn);
    }

    @Override
    public List<Student> getAllBySem(Integer sem) {
        return studentRepository.getAllBySem(sem);
    }

    @Override
    public List<Student> getAllByDno(String dname) {
        return studentRepository.getByDname(dname);
    }
}
