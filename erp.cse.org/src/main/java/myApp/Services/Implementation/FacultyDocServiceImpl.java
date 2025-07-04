package myApp.Services.Implementation;

import myApp.Model.FacultyDoc;
import myApp.Repository.FacultyDocRepository;
import myApp.Services.FacultyDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyDocServiceImpl implements FacultyDocService {
    @Autowired
    FacultyDocRepository facultyDocRepository;
    @Override
    public String insertDocument(FacultyDoc fd) {
        facultyDocRepository.save(fd);
        return "Document Inserted Succesfully";
    }

    @Override
    public List<FacultyDoc> getAllDocs() {
        return facultyDocRepository.findAll();
    }
}
