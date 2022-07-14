package com.hentime.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hentime.main.exception.HentaiNotFoundException;

import com.hentime.main.model.Hentai;
import com.hentime.main.service.HentaiService;

@RestController
@RequestMapping("/hentais")
public class HentaiController {

	@Autowired
	private HentaiService service;
	
	@GetMapping("{id}")
	public Hentai findById(@PathVariable("id") Integer id) throws Exception {	
		System.out.println(service.findById(id).toString());
		return service.findById(id);
	}
	
	@GetMapping
	public List<Hentai> listAll() throws Exception{
		return service.list();
		
	}
	
	@PostMapping
	public Hentai save(@RequestBody Hentai h) throws Exception {
		service.save(h);
		return service.findByName(h);
	}
	
	@PutMapping
	public Hentai update(@RequestBody Hentai h) throws Exception{
		service.update(h);
		return service.findById(h.getIdHentai());
	}
	
	@DeleteMapping("{id}")
	public boolean delete(@PathVariable("id") Integer id) throws Exception{
		if (service.findById(id) == null) {
			throw new HentaiNotFoundException("ID NO ENCONTRADO " + id);
		}
		return service.delete(id);
	}
}
