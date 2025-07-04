package myApp.Controller;

import myApp.Model.StudentProjects;
import myApp.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Project")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ProjectController {

    @Autowired
    ProjectService projectService;
    @PostMapping("/addProject")
    public String addProject(@RequestBody StudentProjects sp){
       return projectService.insertProject(sp);
    }
    @GetMapping("/getProjects/{fid}")
    public List<StudentProjects> getProjects(@PathVariable("fid") Long fid){
      return  projectService.getProjects(fid);
    }

    @PostMapping("/updateMarks")
    public String updateProjMarks(@RequestBody StudentProjects sp){
        projectService.updateMarks(sp);
        return "Project Marks Updated..";
    }
}
