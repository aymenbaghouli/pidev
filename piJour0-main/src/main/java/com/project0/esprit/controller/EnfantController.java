package com.project0.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.service.EnfantService;



@RestController
@RequestMapping(path="enfant")
@CrossOrigin("*")
public class EnfantController {
	@Autowired
	private EnfantService enfantService;	
	@PostMapping("/add")

	public Enfant addContract(@RequestBody Enfant newparent) {
		return enfantService.add(newparent);
	}
	// request method to create a new account by a guest
	//@CrossOrigin
	//@RequestMapping(value = "/addE", method = RequestMethod.POST)
	/*public ResponseEntity<?> createParent(@RequestBody Enfant newenfant) {
		if (enfantService.find(newenfant.getIdEnfant()) != null) {
				//logger.error("username Already exist " + newUser.getUsername());
				return new ResponseEntity(
						new CustomErrorType("user with username " + newenfant.getIdEnfant() + "already exist "),
						HttpStatus.CONFLICT);
			}
			
			
			return new ResponseEntity<Enfant>(enfantService.add(newenfant), HttpStatus.CREATED);
		}
	*/
	
}
