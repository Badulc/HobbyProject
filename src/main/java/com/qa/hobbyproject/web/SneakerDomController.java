package com.qa.hobbyproject.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbyproject.domain.SneakerDom;

import com.qa.hobbyproject.service.SnkrService;

@RestController // annotation to tell spring this is a controller
//Rest Compliant or REST API

public class SneakerDomController {

	private SnkrService service;

	@Autowired // tell spring to fetch SnkrService from the context
	// dependency injection
	public SneakerDomController(SnkrService service) {
		super();
		this.service = service;
	}

	// endpoints
	// creating https response codes
	// @GetMapping()

	// CRUD functionality
	// repsonse entity is an extension of HttpEntity
	// that represents http reponses including status code,headers and body

	@PostMapping("/createSnkr") // 201 - created
	// create sneaker list
	public ResponseEntity<SneakerDom> createSneaker(@RequestBody SneakerDom s) {
		SneakerDom created = this.service.createSneaker(s);
		// create a response
		ResponseEntity<SneakerDom> response = new ResponseEntity<SneakerDom>(created, HttpStatus.CREATED);
		// returning response code
		return response;
	}

	// read all from list method
	@GetMapping("/getAllSnkr") // 200 - ok
	public ResponseEntity<List<SneakerDom>> getAllSneakers() {
		return ResponseEntity.ok(this.service.getAllSnkrs());
	}

	// read one from list
	@GetMapping("/getSnkr/{id}") // 200 - ok
	public SneakerDom getSneaker(@PathVariable Integer id) {
		return this.service.getSnkr(id);
	}

	// update method
	@PutMapping("/replaceSnkr/{id}") // 202 - accepted
	public ResponseEntity<SneakerDom> replaceSneaker(@PathVariable Integer id, @RequestBody SneakerDom repSnkr) {
		SneakerDom body = this.service.replaceSnkr(id, repSnkr);
		ResponseEntity<SneakerDom> response = new ResponseEntity<SneakerDom>(body, HttpStatus.ACCEPTED);
		return response;
	}

	// delete from list
	@DeleteMapping("/removeSnkr/{id}") // 204 - no content
	public ResponseEntity<?> removeSneaker(@PathVariable Integer id) {
		this.service.removeSnkr(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
