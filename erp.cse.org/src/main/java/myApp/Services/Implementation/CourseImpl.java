package myApp.Services.Implementation;

import myApp.Model.Course;
import myApp.Repository.CourseRepository;
import myApp.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


    @Override
    public void insertCourse(Course c) {
        courseRepository.save(c);
    }

    @Override
    public List<Course> getAllCourses(Integer sem) {
        return courseRepository.getCoursesBySem(sem);
    }
}
