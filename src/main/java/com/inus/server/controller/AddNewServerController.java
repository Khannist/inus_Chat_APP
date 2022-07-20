package com.inus.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddNewServerController {

	
	@RequestMapping("AddNewServer")
	public String newServer() {
		return "";
	}
}
