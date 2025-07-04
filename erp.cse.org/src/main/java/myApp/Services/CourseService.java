package myApp.Services;

import myApp.Model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    public List<Course> getAllCourses();
    public void insertCourse(Course c);

    public List<Course> getAllCourses(Integer sem);
}
