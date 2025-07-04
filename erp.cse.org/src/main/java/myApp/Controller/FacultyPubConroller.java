package myApp.Controller;

import myApp.Model.FacultyPublications;
import myApp.Services.FacultyPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facPub")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class FacultyPubConroller {
    @Autowired
    FacultyPubService facultyPubService;
    @GetMapping("/allPublications")
    public List<FacultyPublications> getAllPublications(){
         return  facultyPubService.getAllPubs();
    }
    @PostMapping("/insertPublication")
    public String insertPublication(@RequestBody FacultyPublications fp){

        return facultyPubService.insertPublication(fp);

    }
}
