package myApp.Controller;

import myApp.Dto.FacultyUserDTO;
import myApp.Dto.StudentUserDTO;
import myApp.Model.Grievances;
import myApp.Model.Student;
import myApp.Services.GrievancesService;
import myApp.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Student")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class StudentController {
@Autowired
StudentService studentService;
@Autowired
GrievancesService grievancesService;
@PostMapping("/insertStudent")
public String insertStudent(@RequestBody Student s){
   return studentService.insertStudent(s);
}
@GetMapping("/getAllStudents")
public List<Student> getAllStudents(){
   return studentService.getEveryStudent();
}

    @GetMapping("/getStudent/{usn}")
    public Student getStudent(@PathVariable String usn) {
        return studentService.getStudent(usn);
    }
@GetMapping("/getAllGrievances")
   public List<Grievances> getAllGrievances(){
   return grievancesService.getAllGrievances();
}

@GetMapping("/getGrievance/{cid}")
  public Grievances getGrievance(@PathVariable Long cid){
   return grievancesService.getGrievance(cid);

}
@PostMapping("/insertGrievance")
public String insertGrievance(@RequestBody Grievances g){

    return grievancesService.insertGrievance(g);
}
@GetMapping("/getAllStudentsByDname/{dname}")
public List<Student> getAllByDname(@PathVariable("dname") String dname){
return  studentService.getAllByDno(dname);
}
@PutMapping("/updateStatus/{cid}")
public String updateGStatus(@PathVariable Long cid, @RequestParam String gStatus){
   System.out.println("I am here.."+cid+" "+gStatus);
   return grievancesService.upDateGStatus(cid,gStatus);
}
   @GetMapping("/getMaxCid")
   public Long getMaxCid(){
   return grievancesService.findLastGrievanceId();
   }
    @PostMapping("/insertStudentUser")
    @ResponseStatus(HttpStatus.CREATED)
    public String insertStudentUser(@RequestBody StudentUserDTO su){
        return studentService.insertFacultyUser(su.getS(),su.getU());
    }

}
