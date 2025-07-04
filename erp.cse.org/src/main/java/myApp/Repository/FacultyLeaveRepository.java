package myApp.Repository;

import myApp.Model.FacultyLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyLeaveRepository extends JpaRepository<FacultyLeave, Long> {

}
