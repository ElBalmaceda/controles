package com.usoscontrolers.controles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.usoscontrolers.controles.entity.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{

}
