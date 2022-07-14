package com.hentime.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hentime.main.model.Hentai;


public interface IHentai extends JpaRepository<Hentai, Integer>{
	
    @Query(value = "Select * FROM hentai WHERE hentai_name = :hentai_name ",nativeQuery=true)
 	Hentai findByName(@Param("hentai_name")String hentai_name);
}
