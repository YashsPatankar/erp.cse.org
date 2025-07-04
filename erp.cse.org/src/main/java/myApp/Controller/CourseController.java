package myApp.Controller;

import myApp.Model.Course;
import myApp.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/Course")
public class CourseController {

    @Autowired
    CourseService courseService;
    @PostMapping("/insertCourse")
    public String addCourse(@RequestBody Course c){
        courseService.insertCourse(c);
        return "Inserted succesfully..";
    }
    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses(); //Tobe implemented.
    }
    @GetMapping("/getAllCoursesOf/{sem}")
    public List<Course> getAllCourses(@PathVariable Integer sem){
        return courseService.getAllCourses(sem); //Tobe implemented.
    }

}
