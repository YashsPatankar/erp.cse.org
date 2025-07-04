package myApp.Services;

import myApp.Model.StudentProjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProjectService {


    public String insertProject(StudentProjects sp);

   public List<StudentProjects> getProjects(Long fid);

    void updateMarks(StudentProjects sp);
}
