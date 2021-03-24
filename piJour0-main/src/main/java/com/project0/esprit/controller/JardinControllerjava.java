package com.project0.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project0.esprit.entity.Enfant;
import com.project0.esprit.service.JardinService;
import com.project0.esprit.service.ParentService;

@RequestMapping(path="jardin")

@RestController
@CrossOrigin("*")
public class JardinControllerjava {
	@Autowired
	private JardinService jardinService;
	/**************EffectADD******************/

	 @RequestMapping(value="/EffectEnfantToJardin/{idj}/{idp}",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	   //consumes = MediaType.APPLICATION_JSON_VALUE
		public Enfant  effectEnfantToJardin(@RequestBody Enfant f ,@PathVariable int idj,@PathVariable int idp)throws Exception  {
		   System.out.println(f.getNom());
		return 	 jardinService.affectEnfantTojardin(f, idj,idp);
		}
}
