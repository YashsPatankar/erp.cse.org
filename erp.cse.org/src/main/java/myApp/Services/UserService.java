package myApp.Services;

import myApp.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public String addUser(User u);
    public User getUser(String uname,String uType);
}
