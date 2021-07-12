package com.mindtree.talent.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileStorageService {

	public static final String directory = "/mydata/";
	/*
	 * public void saveFile(MultipartFile file) throws IllegalStateException,
	 * IOException { //Files.copy(file.getInputStream(),
	 * "C:\\Users\\Aman\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\CodingChallenge\\ColudStreamPractice\\FileUpload\\temp",
	 * StandardCopyOption.REPLACE_EXISTING); file.transferTo(new File(""));
	 * 
	 * }
	 */

	public void saveFile(List<MultipartFile> files) throws IOException {
		for(MultipartFile file:files) {
		Files.copy(file.getInputStream(), Paths.get(directory + File.separator + file.getOriginalFilename()),
				StandardCopyOption.REPLACE_EXISTING);
		}
	}

}
