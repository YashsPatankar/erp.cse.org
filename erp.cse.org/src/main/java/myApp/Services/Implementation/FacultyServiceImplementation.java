package myApp.Services.Implementation;
import myApp.Model.Faculty1;
import myApp.Model.FacultyLeave;
import myApp.Model.FacultyPublications;
import myApp.Model.User;
import myApp.Repository.FacultyLeaveRepository;
import myApp.Repository.FacultyPublicationRepository;
import myApp.Repository.FacultyRepository;
import myApp.Repository.UserRepository;
import myApp.Services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyServiceImplementation implements FacultyService {
    @Autowired
    FacultyRepository facultyRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    FacultyPublicationRepository facultyPublicationRepository;
    @Override
    public List<Faculty1> getAllFaculty() {
        return facultyRepository.findAll();
    }

    @Override
    public String insertFaculty(Faculty1 f) {
        facultyRepository.save(f);
        return "Insertion succesfull...";

    }

    @Override
    public Long getMaxFacultyId() {
        return facultyRepository.getMaxFacultyId();
    }

    @Override
    public String insertFaculty(Faculty1 f, User u) {
        facultyRepository.save(f);
        Long fid=getMaxFacultyId();
        u.setFid(fid);
        userRepository.save(u);
        return "Faculty User Created Succesfully..";
    }


    @Override
    public List<FacultyPublications> getAllFacultyPublications() {
        return facultyPublicationRepository.findAll();
    }

    @Override
    public Faculty1 getAFaculty(String fid) {
        return facultyRepository.findByfid(fid);
    }
}
