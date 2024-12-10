package com.usoscontrolers.controles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoscontrolers.controles.entity.Item;
import com.usoscontrolers.controles.repository.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemRepository itemRepo;
	@Override
	public List<Item> findAll() {
		return itemRepo.findAll();
	}

	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

	@Override
	public Item findById(Long id) {
		// TODO Auto-generated method stub
		return itemRepo.findById(id).get();
	}

	@Override
	public Item reloadIngrediente(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(null);
	}

	@Override
	public void deleteById(Long id) {
		itemRepo.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		itemRepo.deleteAll();
		
	}

}
