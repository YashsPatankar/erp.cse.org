package myApp.Repository;

import jakarta.transaction.Transactional;
import myApp.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
@Query(value = "select * from students",nativeQuery = true)
public List<Student> getAllStudents() ;
@Query(value = "select * from students where division=?2 and sem=?1",nativeQuery = true)
public List<Student> getStudentsOfParticularYear(Long sem,String div);
@Query(value="select * from students where usn=?1",nativeQuery = true)
public  Student findByUsn(String usn);

@Query(value="select * from students  where sem=?1",nativeQuery = true)
public List<Student> getAllBySem(Integer sem);
    @Modifying
    @Transactional
@Query(value="update students set fees=fees-:installment where usn=:usn",nativeQuery = true)
public void updateFees(@Param("usn") String usn, @Param("installment")  Float installment);
    @Query(value="select * from students where dname=?1",nativeQuery = true)
  public  List<Student> getByDname(String dname);
}