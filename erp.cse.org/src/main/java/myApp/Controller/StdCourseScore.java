package myApp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/StdScore")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StdCourseScore {
    @PutMapping("/updateScore")
    public String updateScore(@RequestBody StdCourseScore StdScore){
        return "Updated succesfully";
    }
}
