package myApp.Repository;

import myApp.Model.Grievances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GrievancesRepository extends JpaRepository<Grievances,Long> {
    @Query(value="select max(cid) as mcid from grievances",nativeQuery = true)
    public Long findlastcid();
}
