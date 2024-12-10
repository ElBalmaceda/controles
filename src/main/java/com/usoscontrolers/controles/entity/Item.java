package com.usoscontrolers.controles.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int numero;
}
