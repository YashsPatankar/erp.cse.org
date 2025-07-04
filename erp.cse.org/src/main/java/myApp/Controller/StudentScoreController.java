package myApp.Controller;

import myApp.Dto.FacInfoDTO;
import myApp.Dto.StudentScoreDto;
import myApp.Model.Student;
import myApp.Model.StudentCourseScore;
import myApp.Services.StudentCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ScoreController")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentScoreController {

    @Autowired
    StudentCourseScoreService studentCourseScoreService;

    @PostMapping("/register")
    public String registerForCourses(@RequestBody StudentScoreDto stdscore){
        System.out.println(stdscore.getAcadyear()+" "+stdscore.getCourseCode()+" "+stdscore.getUsn());
          return studentCourseScoreService.registerStudentCourse(stdscore);

    }
    @PostMapping("/getfacSubjects")
    public List<StudentCourseScore> getAllFacCourses(@RequestBody FacInfoDTO f){
        System.out.println(f.getAcadyear()+" "+ f.getFid());
        return studentCourseScoreService.getAllFacCourses(f.getAcadyear(),f.getFid());
    }
    @PostMapping("/updateMarks")
    public String updateStudentMarks(@RequestBody StudentScoreDto sm){
        System.out.println(sm.toString());
        return studentCourseScoreService.upDateStudentMarks(sm.getFid(),sm.getUsn(),sm.getCourseCode(),
                sm.getM1(),sm.getM2(),sm.getDivision(),sm.getAss(),sm.getProj());
    }

    @GetMapping("/getStudentMarks/{usn}")
    public List<StudentCourseScore> getMarksByUsn(@PathVariable String usn){
        System.out.println("I am here.."+usn);
         return  studentCourseScoreService.getStudentScores(usn);
    }
}
