package com.usoscontrolers.controles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.usoscontrolers.controles.entity.Persona;
import com.usoscontrolers.controles.service.ItemServiceImpl;
import com.usoscontrolers.controles.service.PersonaServiceImpl;




@Controller
public class PersonaController 
{
	@Autowired
	private PersonaServiceImpl personaService;
	@Autowired
	private ItemServiceImpl itemService;
	
	@GetMapping({"/","index"})
	public String findAll(Model model) 
	{
		model.addAttribute("personas",personaService.findAll());
		model.addAttribute("items", itemService.findAll());
		return "index";
	}

	
	@GetMapping("/personaslist")
	public String savePersonas() 
	{
		Persona persona1=new Persona();
		Persona persona2=new Persona();		
		//Juan 31 años
		persona1.setNombre("Juan");
		persona1.setEdad(31);
		personaService.save(persona1);		
		//Leo 32 años
		persona2.setNombre("Leo");
		persona2.setEdad(32);
		personaService.save(persona2);
		return "redirect:/index";
	}
	
	@GetMapping("personas/eliminar/{id}")
	public String deleteById(@PathVariable Long id) 
	{
		personaService.deleteById(id);
		return "redirect:/index";
	}
	
	@GetMapping("personas/eliminar/todo")
	public String deleteAll() 
	{
		personaService.deleteAll();
		return "redirect:/index";
	}
}
