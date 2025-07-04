package myApp.Services.Implementation;

import myApp.Dto.FeeDetails;
import myApp.Model.Student;
import myApp.Model.StudentFees;
import myApp.Repository.StudentFeesRepository;
import myApp.Repository.StudentRepository;
import myApp.Services.StudentPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentFeesPaymentImpl implements StudentPaymentService {
    @Autowired
    StudentFeesRepository studentFeesRepository;
    @Autowired
    StudentRepository studentRepository;
    @Override
    public String makePayment(StudentFees sf) {
        studentFeesRepository.save(sf);
        studentRepository.updateFees(sf.getUsn(), sf.getInstAmount());

        return "Payment Succesful..";
    }

    @Override
    public List<StudentFees> getStudentFees(String usn) {
        return studentFeesRepository.findOneByUsn(usn);
    }

    @Override
    public void setFees(FeeDetails sf) {
        switch(sf.getAdmincat()) {
            case "KCET":
                studentFeesRepository.setcetFees(sf.getFees());
                break;
            case "COMEDK":
                studentFeesRepository.setcomedkFees(sf.getFees()); break;
            case "MANAGEMENT":
                studentFeesRepository.setmngmenntFees(sf.getFees()); break;
            case "KDCET":
                studentFeesRepository.setkdcetFees(sf.getFees()); break;
            case "SNQ":
                studentFeesRepository.setsnqFees(sf.getFees()); break;
        }
    }
}
