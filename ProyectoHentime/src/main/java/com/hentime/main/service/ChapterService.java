package com.hentime.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hentime.main.model.Chapter;
import com.hentime.main.repo.IChapter;

@Service
public class ChapterService extends CRUD<Chapter,Integer>{
	
	@Autowired
	private IChapter repo;
	
	@Override
	protected JpaRepository<Chapter, Integer> getRepo() {

		return repo;
	}
	
	public Chapter findByName(Chapter c) {
		return repo.findByName(c.getChapterName());
	}
	

}
