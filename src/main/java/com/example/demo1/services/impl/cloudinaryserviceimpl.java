package com.example.demo1.services.impl;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.example.demo1.services.cloudimaginaryservice;


@Service
public class cloudinaryserviceimpl implements cloudimaginaryservice {
	
	@Autowired
	private Cloudinary cloudinary;

	@Override
	public Map uploadMap(MultipartFile f) {
		try {
		Map dataMap=	this.cloudinary.uploader().upload(f.getBytes(), Map.of());
		return dataMap;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("image upload failed");
		}
		
		}

}
