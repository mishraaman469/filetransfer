package com.mindtree.talent.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mindtree.talent.service.FileStorageService;

@RestController
public class FileController {

		
	
	@Autowired
	FileStorageService fileStorageService;
		
	@PostMapping("/save")
	public void saveFile(@RequestParam("file") List<MultipartFile> file) throws IllegalStateException, IOException {
		 this.fileStorageService.saveFile(file); 
	}
	
}
