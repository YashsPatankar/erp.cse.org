package myApp.Controller;

import myApp.Dto.FeeDetails;
import myApp.Model.StudentFees;
import myApp.Services.StudentPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/StudentFees")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentFeesController {
    @Autowired
    StudentPaymentService studentPaymentService;
    @PostMapping("/makePayment")
    public String makePayment(@RequestBody StudentFees sf){
    System.out.println("Hello i am here");
    System.out.println(sf.toString());
      return  studentPaymentService.makePayment(sf);
}
   @GetMapping("/getinstallmentDetails/{usn}")
    public List<StudentFees> getStudentFees(@PathVariable("usn") String usn){
       return studentPaymentService.getStudentFees(usn);
   }
   @PostMapping("/setFees")
    public String setStudentFees(@RequestBody FeeDetails sf){
        studentPaymentService.setFees(sf);
        return "Fees Updated..";
   }

}
