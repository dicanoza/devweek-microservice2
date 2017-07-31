package com.daitangroup.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daitangroup.model.Entity;

@RestController
public class MyController {

	@RequestMapping("/")
	public String myMessage() {
		return "HAKUNA MATATA";
	}

	@RequestMapping("/entity")
	public ResponseEntity<Entity> myEnity() {
		return ResponseEntity.ok(new Entity("joao"));
	}


}
