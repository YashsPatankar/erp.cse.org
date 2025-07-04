package myApp.Services;

import myApp.Model.FacultyLeave;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacultyLeaveService {
    public String insertFacultyLeave(FacultyLeave fl);

    public List<FacultyLeave> getAllLeaves();
}
