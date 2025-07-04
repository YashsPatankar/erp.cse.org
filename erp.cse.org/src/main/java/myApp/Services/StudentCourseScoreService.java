package myApp.Services;

import myApp.Dto.StudentScoreDto;
import myApp.Model.StudentCourseScore;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentCourseScoreService {

    public String registerStudentCourse(StudentScoreDto score);
    public String upDateScore(StudentCourseScore scs);
    public List<StudentCourseScore> getStudentScores(String usn);

    public List<StudentCourseScore> getAllFacCourses(String acadyear, Long fid);

//    public String upDateStudentMarks(Long fid, String usn, String scode, Integer m1, Integer m2,Character division);

    String upDateStudentMarks(Long fid, String usn, String courseCode, Integer m1, Integer m2, Character division, Integer ass, Integer proj);
}
