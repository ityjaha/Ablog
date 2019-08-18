package com.itaha.blog.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import com.itaha.blog.service.FileUploadService;

@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Override
	public String upload(MultipartFile file, String filedir) {
		try {
			// 获取当前项目的真实路径，然后拼接前面的文件名
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			String path = ResourceUtils.getURL("classpath:static").getPath();
			String baseUrl = "/image" + File.separator + filedir + File.separator + uuid;
			String destFileName = path + "/api" + baseUrl;
			File destFile = new File(destFileName);
			destFile.getParentFile().mkdirs();
			// 5.把浏览器上传的文件复制到希望的位置
			// 这里需要将图片上传信息保存到数据库去
			// TODO 暂时先不做
			file.transferTo(destFile);
			// 返回url
			return baseUrl;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "上传失败," + e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return "上传失败," + e.getMessage();
		}
	}

	@Override
	public Stream<Path> loadAll() {
		throw new RuntimeException("如有需要，请重写！");

	}

	@Override
	public Path load(String filename) {
		throw new RuntimeException("如有需要，请重写！");
	}

	@Override
	public Resource loadAsResource(String filename) {
		throw new RuntimeException("如有需要，请重写！");
	}

	@Override
	public void deleteAll() {
		throw new RuntimeException("如有需要，请重写！");
	}

	@Override
	public void init() {
		throw new RuntimeException("如有需要，请重写！");
	}
}
