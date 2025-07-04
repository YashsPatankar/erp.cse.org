package myApp.Controller;

import myApp.Model.FacultyDoc;
import myApp.Services.FacultyDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facultyDoc")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FacultyDocController {

    @Autowired
    FacultyDocService facultyDocService;
    @PostMapping("/upload")
    public String insertDocument(@RequestBody FacultyDoc fd){
        System.out.println("I am here"+fd.toString());
       return facultyDocService.insertDocument(fd);
    }
    @GetMapping("/getAllDocs")
    public List<FacultyDoc> getAllDocs(){
        return facultyDocService.getAllDocs();
    }
}
