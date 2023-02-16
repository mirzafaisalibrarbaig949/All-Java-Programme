package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUplaodForm() {

		return "fileform";
	}

	@RequestMapping(path = "/uploadfile", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpSession session,Model model) {
		System.out.println("File upload Handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		byte[] data = file.getBytes();
		// we have save to file in server
//		String realPath = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator
//				+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		String realPath = session.getServletContext().getRealPath("/") + "WEB-INF/resources/image/"
				+ file.getOriginalFilename();
		System.out.println(realPath);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(realPath);
			fileOutputStream.write(data);
			fileOutputStream.close();
			System.out.println("file uploded sussccessfully");
			model.addAttribute("msg","Uploaded successfully");
			model.addAttribute("filename",file.getOriginalFilename());
		} catch (IOException e) {
			System.out.println("Uploading Error");
			model.addAttribute("msg","Uploaded error");
			
		}

		return "filesuccess";
	}
}