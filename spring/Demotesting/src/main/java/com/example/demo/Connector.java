package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/Demo")

public class Connector {
		@Autowired
			private UserRepository userre;
			@PostMapping(path="/add") 
			  public  String addNewUser (@RequestParam String fname
			      , @RequestParam String email) {
				Testspring ts=new Testspring();
				ts.setName(fname);
				ts.setEmail(email);
				userre.save(ts);
					return "saved";
					
				
			} 
				@GetMapping(path="/show")
					public Iterable<Testspring> display()
					{
						return userre.findAll();

					} 
				 
			
					public Testspring change(@PathVariable Integer id,@RequestBody Testspring task)
						{
							 Testspring taskr =userre.getOne(id);
							 
							   taskr.setName(task.getName());
						       taskr.setEmail(task.getEmail());
							   return userre.save(taskr);
						}
						@DeleteMapping(path="/remove")
						public void deleteStudent(
							      Integer id) {
							userre.findById(id);
							userre.deleteById(id);
						}
						 
					 


}
