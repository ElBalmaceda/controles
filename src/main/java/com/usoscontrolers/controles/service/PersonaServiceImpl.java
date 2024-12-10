package com.usoscontrolers.controles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoscontrolers.controles.entity.Persona;
import com.usoscontrolers.controles.repository.PersonaRepository;
@Service
public class PersonaServiceImpl implements PersonaService
{
	
	@Autowired
	private PersonaRepository personaRepo;
	
	@Override
	public List<Persona> findAll() 
	{
		return personaRepo.findAll();
	}
	@Override
	public Persona save(Persona persona) 
	{
		return personaRepo.save(persona);
	}

	@Override
	public Persona findById(Long id) 
	{
		return personaRepo.findById(id).get();
	}

	@Override
	public Persona reloadIngrediente(Persona persona) 
	{
		return personaRepo.save(persona);
	}

	@Override
	public void deleteById(Long id) 
	{
		personaRepo.deleteById(id);
	}
	@Override
	public void deleteAll() {
		personaRepo.deleteAll();
		
	}
	
}
