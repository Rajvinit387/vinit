package com.example.demo1.services;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public interface cloudimaginaryservice {
	
	public Map uploadMap(MultipartFile f);

}
