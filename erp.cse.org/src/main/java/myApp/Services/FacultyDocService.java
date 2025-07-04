package myApp.Services;

import myApp.Model.FacultyDoc;
import myApp.Model.FacultyPublications;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacultyDocService {

    public String insertDocument(FacultyDoc fd);
    public List<FacultyDoc> getAllDocs();
}
