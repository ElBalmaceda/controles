package com.usoscontrolers.controles.entity;

import jakarta.persistence.*;

import lombok.*;


@Entity
@Table(name="Persona")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int edad;
}
