package myApp.Repository;

import myApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "select * from user where uname=?1 and category=?2",nativeQuery = true)
    public User findByUname(String uname,String uType);
}
