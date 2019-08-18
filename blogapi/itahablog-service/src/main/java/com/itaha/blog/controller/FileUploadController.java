package com.itaha.blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itaha.blog.service.FileUploadService;

@RestController
public class FileUploadController {
	@Autowired
	private FileUploadService upload;

	@PostMapping("/api/{filedir}/upload")
	public String handleFileUpload(HttpServletRequest req, @PathVariable("filedir") String filedir,
			@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		return upload.upload(file, filedir);
	}

}
