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

import com.hentime.main.exception.ChapterNotFoundException;

import com.hentime.main.model.Chapter;
import com.hentime.main.service.ChapterService;


@RestController
@RequestMapping("/chapters")
public class ChapterController {
	
	@Autowired
	private ChapterService service;
	

	@GetMapping("{id}")
	public Chapter findById(@PathVariable("id") Integer id) throws Exception {	
		System.out.println(service.findById(id).toString());
		return service.findById(id);
	}
	
	@GetMapping
	public List<Chapter> listAll() throws Exception{
		return service.list();
		
	}
	
	@PostMapping
	public Chapter save(@RequestBody Chapter c) throws Exception {
		service.save(c);
		return service.findByName(c);
	}
	
	@PutMapping
	public Chapter update(@RequestBody Chapter c) throws Exception{
		service.update(c);
		return service.findById(c.getIdChapter());
	}
	
	@DeleteMapping("{id}")
	public boolean delete(@PathVariable("id") Integer id) throws Exception{
		if (service.findById(id) == null) {
			throw new ChapterNotFoundException("ID NO ENCONTRADO " + id);
		}
		return service.delete(id);
	}
}
