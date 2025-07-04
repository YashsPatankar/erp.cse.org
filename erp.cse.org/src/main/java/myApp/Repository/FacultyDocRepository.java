package myApp.Repository;

import myApp.Model.FacultyDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyDocRepository extends JpaRepository<FacultyDoc,Long> {
}
