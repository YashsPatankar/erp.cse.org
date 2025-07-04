package myApp.Controller;

import myApp.Model.User;
import myApp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/User")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUser/{uname}/{uType}")
    public User getUser(@PathVariable String uname,@PathVariable String uType){
     //   System.out.println(uname);
       return userService.getUser(uname,uType);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User u){

        return userService.addUser(u);
    }
}
