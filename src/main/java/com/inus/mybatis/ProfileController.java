package com.inus.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired
	private ProfileMapper profileMapper;
	
	@PostMapping("")
	public int post(@RequestBody Profile profile) {
		return profileMapper.insert(profile);
	}
}
