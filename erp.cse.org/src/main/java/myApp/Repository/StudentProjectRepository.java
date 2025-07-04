package myApp.Repository;

import myApp.Model.StudentProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentProjectRepository extends JpaRepository<StudentProjects,Long> {
    @Query(value="select * from studentprojects where fid=?1",nativeQuery = true)
    public  List<StudentProjects> getProjByFid(Long fid);
}
