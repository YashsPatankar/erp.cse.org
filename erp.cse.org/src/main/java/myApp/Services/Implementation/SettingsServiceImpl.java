package myApp.Services.Implementation;

import myApp.Model.Settings;
import myApp.Repository.SettingsServiceRepository;
import myApp.Services.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SettingsServiceImpl implements SettingsService {
    @Autowired
    SettingsServiceRepository settingsServiceRepository;
    @Override
    public List<Settings> getAllSettings() {

        return settingsServiceRepository.findAll();
    }

    @Override
    public String updateAcadYear(String acadYear) {
        settingsServiceRepository.updateAcadYear(acadYear);
        return "Academic Year Updated..";
    }
}
