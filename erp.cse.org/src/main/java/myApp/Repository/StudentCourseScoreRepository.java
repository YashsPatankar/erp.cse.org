package myApp.Repository;

import jakarta.transaction.Transactional;
import myApp.Model.StudentCourseScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentCourseScoreRepository extends JpaRepository<StudentCourseScore, Long> {

    @Query(value = "select * from scores where usn=?1",nativeQuery = true)
    public List<StudentCourseScore> findByUsn(String usn);

    @Query(value="select  * from scores where acadyear=?1 and fid=?2",nativeQuery = true)
    public List<StudentCourseScore> getAllFacCoursesByAcadYear(String acadyear, Long fid);

    @Modifying
    @Transactional
    @Query(value="insert into scores(acadyear,usn,scode,fid,division) values(:v1,:v2,:v3,:v4,:v5)",nativeQuery = true)
    public void registerStudent(@Param("v1") String v1, @Param("v2") String v2, @Param("v3") String v3, @Param("v4") Long v4, @Param("v5") Character division);

    @Transactional
    @Query(value = "select * from scores where usn=?1 and scode=?2 and division=?3 and fid=?4",nativeQuery = true)
    public StudentCourseScore findByUsnCodeDiv(String usn, String scode, Character division,Long fid);
}
