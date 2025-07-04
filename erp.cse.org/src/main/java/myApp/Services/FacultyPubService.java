package myApp.Services;

import myApp.Model.FacultyPublications;

import java.util.List;

public interface FacultyPubService {
    public List<FacultyPublications> getAllPubs();
    public String insertPublication(FacultyPublications fp);
}
