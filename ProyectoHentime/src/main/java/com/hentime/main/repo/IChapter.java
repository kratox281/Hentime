package com.hentime.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hentime.main.model.Chapter;


public interface IChapter extends JpaRepository<Chapter, Integer>{
	
	  @Query(value = "Select * FROM hentai WHERE chapter_name = :chapter_name ",nativeQuery=true)
	 	Chapter findByName(@Param("chapter_name")String chapter_name);
	
}
