package myApp.Services.Implementation;

import myApp.Model.User;
import myApp.Repository.UserRepository;
import myApp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public String addUser(User u) {
        userRepository.save(u);
        return "User Added Succesfully..";
    }

    @Override
    public User getUser(String uname,String uType) {
        return userRepository.findByUname(uname,uType);
    }


}
