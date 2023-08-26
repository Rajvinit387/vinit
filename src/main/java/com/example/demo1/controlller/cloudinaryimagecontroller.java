package com.example.demo1.controlller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo1.services.cloudimaginaryservice;

@RestController
public class cloudinaryimagecontroller {
	
	
	@Autowired
	private cloudimaginaryservice cloudimaginaryservice;
	
	@PostMapping(value = "/cloud/image")
	public ResponseEntity<Map> uploadimage(@RequestParam("cloudfile") MultipartFile file)
	{
	Map map=	this.cloudimaginaryservice.uploadMap(file);
	return new ResponseEntity<>(map,HttpStatus.OK);
		
	}

}
