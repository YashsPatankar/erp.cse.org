package myApp.Services;

import myApp.Dto.FeeDetails;
import myApp.Model.StudentFees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentPaymentService {

    public String makePayment(StudentFees sf);

    public List<StudentFees> getStudentFees(String usn);

    void setFees(FeeDetails sf);
}
