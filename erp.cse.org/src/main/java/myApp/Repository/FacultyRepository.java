package myApp.Repository;

import myApp.Model.Faculty1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty1,Long> {
   @Query(value = "select * from faculty1",nativeQuery = true)
   public List<Faculty1> getAllFacultyFromDatabase();

   @Query(value = "select max(id) from faculty1",nativeQuery = true)
   public Long getMaxFacultyId();
    @Query(value = "select * from faculty1 where id=?1",nativeQuery = true)
    Faculty1 findByfid(String fid);
}
