package myApp.Repository;

import jakarta.transaction.Transactional;
import myApp.Model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SettingsServiceRepository extends JpaRepository<Settings,Long> {
    @Transactional
    @Modifying
    @Query(value = "update settings s set s.acad_year=?1", nativeQuery = true)
    public void updateAcadYear(String acadYear);
}

