package human.class1.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {
	
	@RequestMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";
	}
	
	@RequestMapping("/upload")
	public String upload(MultipartHttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("contnent");
		System.out.println("title" + title);
		System.out.println("content" + content);
		
		MultipartFile mf = req.getFile("file1");
		
		long fileSize = mf.getSize();
		System.out.println("fileSize" + fileSize);
		
		String fileName = mf.getOriginalFilename();
		System.out.println("filename" + fileName);
		
		String path = "C:\\temp\\upload";
		String safeFileName = path + "\\"+ System.currentTimeMillis() + "_" + fileName;
		
		File file = new File(safeFileName);
		
		try {
		mf.transferTo( file );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		return "uploadForm";
	}

}
