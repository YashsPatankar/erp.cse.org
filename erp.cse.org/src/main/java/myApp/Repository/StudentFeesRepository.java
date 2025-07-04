package myApp.Repository;

import jakarta.transaction.Transactional;
import myApp.Model.StudentFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentFeesRepository extends JpaRepository<StudentFees,Long> {
    @Query(value = "select * from student_fees where usn=?1",nativeQuery = true)
    public List<StudentFees> findOneByUsn(String usn);

    @Transactional
    @Modifying
    @Query(value="update settings set cet_fees=:fees",nativeQuery = true)
    void setcetFees(@Param("fees") Float fees);

    @Transactional
    @Modifying
    @Query(value="update settings set comek_fees=:fees",nativeQuery = true)
    void setcomedkFees(@Param("fees") Float fees);
    @Transactional
    @Modifying
    @Query(value="update settings set mngment_fees=:fees",nativeQuery = true)
    void setmngmenntFees(@Param("fees") Float fees);

    @Transactional
    @Modifying
    @Query(value="update settings set kdcet_fees=:fees",nativeQuery = true)
    void setkdcetFees(Float fees);

    @Transactional
    @Modifying
    @Query(value="update settings set snqfees=:fees",nativeQuery = true)
    void setsnqFees(Float fees);
}
