package com.example.demo1.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class cloudconfig {
	
	@Bean
	public Cloudinary getCloudinary()
	{
		Map map= new HashMap();
		map.put("cloud_name", "dxychwikm");
		map.put("api_key", "267693741461328");
		map.put("api_secret", "vjqs1JhSymnyKh48RWqh9APITpA");
		map.put("secure", true);
		
		return new Cloudinary(map);
		}

}
