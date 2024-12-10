package com.usoscontrolers.controles.service;

import java.util.List;

import com.usoscontrolers.controles.entity.Persona;

public interface PersonaService 
{
	public List<Persona> findAll();
	public Persona save(Persona persona);
	public Persona findById(Long id);
	public Persona reloadIngrediente(Persona persona);
	public void deleteById(Long id);
	public void deleteAll();
}
