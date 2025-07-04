package myApp.Repository;

import myApp.Model.FacultyPublications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyPublicationRepository extends JpaRepository<FacultyPublications,Long> {

    @Query(value = "select * from facpubs  order by pubyear desc",nativeQuery = true)
    public List<FacultyPublications> getAllPubs();
}
