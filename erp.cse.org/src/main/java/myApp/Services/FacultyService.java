package myApp.Services;

import myApp.Model.Faculty1;
import myApp.Model.FacultyLeave;
import myApp.Model.FacultyPublications;
import myApp.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FacultyService {

    public List<Faculty1> getAllFaculty();
    public String insertFaculty(Faculty1 f);
    public Long getMaxFacultyId();
    public String insertFaculty(Faculty1 f, User u);

    public List<FacultyPublications> getAllFacultyPublications();


    public Faculty1 getAFaculty(String fid);
}
