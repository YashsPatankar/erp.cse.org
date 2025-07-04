package myApp.Controller;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/Upload")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FileUploadController {

    @PostMapping
    public String uploadFile(@RequestParam("file") MultipartFile file,
                             @RequestParam("destination") String destination,
                             @RequestParam("newfilename") String newfname) {
        String UPLOAD_DIRECTORY = "D:\\mdhvesha-test\\routing-app\\public\\";
        System.out.println("I am here..."+destination+ "  "+file.getOriginalFilename()+" "+newfname);
        if (file.isEmpty()) {
            return "Please select a file to upload.";
        }

        try {
            // Create the directory if it doesn't exist
            File directory = new File(UPLOAD_DIRECTORY+destination);
            if (!directory.exists()) {
                directory.mkdirs();
                System.out.println("Directory created..");// You can handle this more robustly
            }

            // Save the file to the server
            String filePath = directory+"\\"+newfname+"."+StringUtils.getFilenameExtension(file.getOriginalFilename());
            System.out.println(filePath);
            file.transferTo(new File(filePath));

            return "File uploaded successfully to: " + filePath;
        } catch (IOException e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }
}

