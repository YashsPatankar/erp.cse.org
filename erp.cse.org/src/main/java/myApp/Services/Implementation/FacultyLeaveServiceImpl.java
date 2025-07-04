package myApp.Services.Implementation;

import myApp.Model.FacultyLeave;
import myApp.Repository.FacultyLeaveRepository;
import myApp.Services.FacultyLeaveService;
import myApp.Services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyLeaveServiceImpl implements FacultyLeaveService {
    @Autowired
    FacultyLeaveRepository facultyLeaveRepository;
    @Override
    public String insertFacultyLeave(FacultyLeave fl) {
        facultyLeaveRepository.save(fl);
        return "Inserted succesfully...";
    }

    @Override
    public List<FacultyLeave> getAllLeaves() {
        return facultyLeaveRepository.findAll();
    }
}
