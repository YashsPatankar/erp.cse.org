package myApp.Services.Implementation;

import myApp.Model.FacultyPublications;
import myApp.Repository.FacultyPublicationRepository;
import myApp.Services.FacultyPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyPubServiceImp implements FacultyPubService {

    @Autowired
    FacultyPublicationRepository facultyPublicationRepository;
    @Override
    public List<FacultyPublications> getAllPubs() {

        return facultyPublicationRepository.getAllPubs();
    }

    @Override
    public String insertPublication(FacultyPublications fp) {
        facultyPublicationRepository.save(fp);
        return "Publication succesfully inserted";
    }
}
