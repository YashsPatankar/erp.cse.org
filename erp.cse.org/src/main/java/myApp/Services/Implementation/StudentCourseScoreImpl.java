package myApp.Services.Implementation;

import myApp.Dto.StudentScoreDto;
import myApp.Model.Student;
import myApp.Model.StudentCourseScore;
import myApp.Repository.StudentCourseScoreRepository;
import myApp.Services.StudentCourseScoreService;
import myApp.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentCourseScoreImpl implements StudentCourseScoreService {
    @Autowired
    StudentCourseScoreRepository studentCourseScoreRepository;
    @Autowired
    StudentService studentService;
    @Override
    public String registerStudentCourse(StudentScoreDto sscore) {
        List<Student> allStudents=studentService.getAllBySem(sscore.getSem());

        try {
            for (Student s : allStudents)
                studentCourseScoreRepository.registerStudent(sscore.getAcadyear(), s.getUsn(), sscore.getCourseCode(),
                        sscore.getFid(), sscore.getDivision());
            return "Registration succesful..";

        }catch (Exception e){

            return(e.toString());
        }
    }

    @Override
    public String upDateScore(StudentCourseScore scs) {
        //To be implemented findByUSNCode and update...
        studentCourseScoreRepository.save(scs);
        return "Updated Succesfully..";
    }

    @Override
    public List<StudentCourseScore> getStudentScores(String usn) {
        return studentCourseScoreRepository.findByUsn(usn);
    }

    @Override
    public List<StudentCourseScore> getAllFacCourses(String acadyear, Long fid) {
        return studentCourseScoreRepository.getAllFacCoursesByAcadYear(acadyear,fid);
    }

    @Override
    public String upDateStudentMarks(Long fid, String usn, String scode, Integer m1, Integer m2,Character division,Integer ass,Integer proj) {
        StudentCourseScore sc= studentCourseScoreRepository.findByUsnCodeDiv(usn,scode,division,fid);
        sc.setM1(m1);
        sc.setM2(m2);
        sc.setAscore(ass);
        sc.setPscore(proj);
//        GregorianCalendar cal = new GregorianCalendar(2007, 9 - 1, 23);

        studentCourseScoreRepository.save(sc);
        return "Marks Updated Succesfully";
    }


}
