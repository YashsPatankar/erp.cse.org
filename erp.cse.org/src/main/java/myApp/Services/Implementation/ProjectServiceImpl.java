package myApp.Services.Implementation;

import myApp.Model.StudentProjects;
import myApp.Repository.StudentProjectRepository;
import myApp.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    StudentProjectRepository studentProjectRepository;
    @Override
    public String insertProject(StudentProjects sp) {

        studentProjectRepository.save(sp);
        return "Inserted Succesfully";
    }

    @Override
    public List<StudentProjects> getProjects(Long fid) {
        return studentProjectRepository.getProjByFid(fid);
    }

    @Override
    public void updateMarks(StudentProjects sp) {
        studentProjectRepository.save(sp);
    }
}
