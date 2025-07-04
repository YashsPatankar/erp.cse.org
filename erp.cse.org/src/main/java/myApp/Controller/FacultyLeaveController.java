package myApp.Controller;

import myApp.Model.FacultyLeave;
import myApp.Services.FacultyLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Leave")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FacultyLeaveController {
    @Autowired
    FacultyLeaveService facultyLeaveService;
    @PostMapping("/insertLeave")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertFacultyLeave(@RequestBody FacultyLeave fl){
        return facultyLeaveService.insertFacultyLeave(fl);

    }

    @GetMapping("/getAllLeaves")
    public List<FacultyLeave> getAllLeaves(){
        return facultyLeaveService.getAllLeaves();
    }
}
