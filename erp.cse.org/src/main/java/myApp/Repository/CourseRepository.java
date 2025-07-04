package myApp.Repository;

import myApp.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query(value = "select * from courses where sem=?1",nativeQuery = true)
    List<Course> getCoursesBySem(Integer sem);
}
