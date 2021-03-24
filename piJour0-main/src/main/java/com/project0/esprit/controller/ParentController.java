package com.project0.esprit.controller;



import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.firebase.messaging.FirebaseMessagingException;
import com.project0.esprit.entity.Enfant;
import com.project0.esprit.entity.Note;
import com.project0.esprit.entity.Parent;
import com.project0.esprit.service.ParentService;


//import com.project0.esprit.service.FirebaseMessagingService;
@RequestMapping(path="parent")

@RestController
@CrossOrigin("*")
public class ParentController {
	@Autowired
	private ParentService parentService;
	/**************GET*******************/
	@GetMapping("/get")
	public Iterable<Parent> GetParent () {

	  
return parentService.findALL();
	}
	
	/**************Delete*******************/
	@RequestMapping(value="/delete/{idparent}",method = RequestMethod.DELETE)
	public void deleteParent (@PathVariable long idparent) {

	   // Long pId = Long.parseLong (idparent);
        parentService.deleteById(idparent);
	}
	/**************ADD******************/
	   @RequestMapping(value="/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	   //consumes = MediaType.APPLICATION_JSON_VALUE
		public Parent  addContract(@RequestBody Parent newparent)throws Exception  {
		   System.out.println(newparent.getNom());
		return 	 parentService.add(newparent);
		}
		/**************EffectADD******************/

	 @RequestMapping(value="/addenfant/{id}",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	   //consumes = MediaType.APPLICATION_JSON_VALUE
		public Enfant  effectEnfant(@RequestBody Enfant f ,@PathVariable int id)throws Exception  {
		   System.out.println(f.getNom());
		return 	 parentService.affectToParent(f, id);
		}
		/**************Update******************/

	  @PutMapping("/update/{idparent}")
	 	public ResponseEntity<Object> UpdateParent(@RequestBody Parent newparent,@PathVariable long idparent) {
	 
	 	   Parent parentO= parentService.findONE(idparent);
	 	   newparent.setIdParent(idparent);
	 	   parentService.add(newparent);
	 		return ResponseEntity.notFound().build();
	 	}
	   
	
	/*@Autowired
	private FirebaseMessagingService firebaseService;

	@RequestMapping("/send-notification")
	@ResponseBody
	public String sendNotification(@RequestBody Note note,
	                               @RequestParam String token) throws FirebaseMessagingException {
	    return firebaseService.sendNotification(note, token);
	}*/

	
}
	