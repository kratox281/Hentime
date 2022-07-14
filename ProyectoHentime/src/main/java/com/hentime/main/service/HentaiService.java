package com.hentime.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hentime.main.model.Hentai;
import com.hentime.main.repo.IHentai;

@Service
public class HentaiService extends CRUD<Hentai, Integer>{
	
	@Autowired
	private IHentai repo;
	
	@Override
	protected JpaRepository<Hentai, Integer> getRepo() {
		
		return repo;
	}
	
	public Hentai findByName(Hentai h) {
		return repo.findByName(h.getHentaiName());
	}

}
