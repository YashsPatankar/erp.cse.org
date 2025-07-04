package myApp.Controller;

import myApp.Dto.FacultyUserDTO;
import myApp.Model.Faculty1;
import myApp.Model.FacultyPublications;
import myApp.Model.User;
import myApp.Services.FacultyService;
import myApp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Faculty")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FacultyController {
    @Autowired
    FacultyService facultyService;
    UserService userService;
    @GetMapping("/getAllFaculty")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Faculty1> getAllFaculty(){
           return facultyService.getAllFaculty();
    }

    @GetMapping("/getFaculty/{fid}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Faculty1 getFaculty(@PathVariable("fid") String fid){
        return facultyService.getAFaculty(fid);
    }


    @GetMapping("/getAllPublications")
    public List<FacultyPublications> getAllPublications(){

        return facultyService.getAllFacultyPublications();
    }

    @PostMapping("/insertFaculty")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertFaculty(@RequestBody Faculty1 f){
        System.out.println("Hello World"+f.getDesignation());
        return facultyService.insertFaculty(f);

    }
    @PostMapping("/insertFacultyUser")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertFacultyUser(@RequestBody FacultyUserDTO fu){
        return facultyService.insertFaculty(fu.getF(),fu.getU());
    }
}
