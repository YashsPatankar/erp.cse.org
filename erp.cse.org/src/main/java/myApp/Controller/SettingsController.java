package myApp.Controller;

import myApp.Model.Settings;
import myApp.Services.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Settings")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class SettingsController {
   @Autowired
   SettingsService settingsService;
@GetMapping("/getAllSettings")
    public List<Settings> getSettings(){
    return    settingsService.getAllSettings();
}
@GetMapping("/setAcadYear/{acadYear}")
    public String setAcadYear(@PathVariable("acadYear") String acadYear){
        return settingsService.updateAcadYear(acadYear);
    }
}
