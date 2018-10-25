package com.verizon.adb.restapi;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.adb.model.Packages;
import com.verizon.adb.service.PackageService;

@Controller
@CrossOrigin
@RequestMapping("/Packages")
public class PackageController {

	@Autowired
	private PackageService service;

	@GetMapping
	public ResponseEntity<List<Packages>> getAllPackages() {
		return new ResponseEntity<>(service.getAllPackages(), HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Packages> getPackagesById(@PathVariable("id") String Title) {
		ResponseEntity<Packages> resp;
		Packages c = service.getPackageById(Title);
		if (c == null)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		return resp;

	}

	@GetMapping("/{field}/{srchValue}")
	public ResponseEntity<List<Packages>> getAllContacts(@PathVariable("field") String fieldBy,
			@PathVariable("srchValue") int searchValue) {
		ResponseEntity<List<Packages>> resp = null;
		switch (fieldBy) {
		case "cost":
			Packages cBYcost = service.findBycost(searchValue);
			if (cBYcost!= null) {
				resp = new ResponseEntity<>(Collections.singletonList(cBYcost), HttpStatus.OK);
			} else {
				resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			break;
			
		case "netspeed":
			Packages cBYnetspeed = service.findByNet(searchValue);
			if (cBYnetspeed != null) {
				resp = new ResponseEntity<>(Collections.singletonList(cBYnetspeed), HttpStatus.OK);
			} else {
				resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			break;
			
		case "maxusage":
			Packages cBYmaxusage = service.findByMaxUsage(searchValue);
			if (cBYmaxusage != null) {
				resp = new ResponseEntity<>(Collections.singletonList(cBYmaxusage), HttpStatus.OK);
			} else {
				resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			break;
			
		}
		return resp;

	}

}
