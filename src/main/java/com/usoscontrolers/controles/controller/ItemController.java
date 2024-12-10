package com.usoscontrolers.controles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.usoscontrolers.controles.entity.Item;
import com.usoscontrolers.controles.service.ItemServiceImpl;

@Controller
public class ItemController 
{
	@Autowired
	private ItemServiceImpl itemService;
	
	@GetMapping("/itemlista")
	public String saveItems(Model model) 
	{
		Item item1=new Item();
		Item item2=new Item();
		Item item3=new Item();
		//123
		item1.setNombre("Item1");
		item1.setNumero(123);
		itemService.save(item1);
		//456
		item2.setNombre("Item2");
		item2.setNumero(456);
		itemService.save(item2);
		//789
		item3.setNombre("Item3");
		item3.setNumero(789);
		itemService.save(item3);

		return "redirect:/index";
	}
	@GetMapping("/item/eliminar/todo")
	public String deleteAll(Model model) 
	{
		
		itemService.deleteAll();
		return "redirect:/index?botonDeshabilitado=true";
	}
	@PostMapping("/itemseleccion")
	public String findSelected(@RequestParam("item") String itemSeleccion, Model model) 
	{
		model.addAttribute("itemSel",itemSeleccion);
		return "itemSel";
	}
	@GetMapping("/marcarop1")
	public String marcarOp1(Model model) {
        // Supongamos que la opción seleccionada es 'opcion2'
        model.addAttribute("opcionSeleccionada", "opcion1");
        
        return "index";
    }
	@GetMapping("/desmarcar")
	public String desmarcarTodo(Model model) 
	{
		model.addAttribute("opcionSeleccionada","0");
		model.addAttribute("checkSeleccionado","0");
		return "index";
	}
	@GetMapping("/marcarcheck")
	public String marcarCheck(Model model) 
	{
		model.addAttribute("checkSeleccionado","selecChek1");
		return "index";
	}
	
}
