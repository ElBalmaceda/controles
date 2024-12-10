package com.usoscontrolers.controles.service;

import java.util.List;

import com.usoscontrolers.controles.entity.Item;



public interface ItemService 
{
	public List<Item> findAll();
	public Item save(Item item);
	public Item findById(Long id);
	public Item reloadIngrediente(Item item);
	public void deleteById(Long id);
	public void deleteAll();
}
