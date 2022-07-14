package com.hentime.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Chapter")
public class Chapter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idChapter;
	
	@Column
	private String chapterName;
	
	@Column
	private String hentaiFather;
	
	public Chapter() {
		super();
	}

	public Integer getIdChapter() {
		return idChapter;
	}

	public void setIdChapter(Integer idChapter) {
		this.idChapter = idChapter;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getHentaiFather() {
		return hentaiFather;
	}

	public void setHentaiFather(String hentaiFather) {
		this.hentaiFather = hentaiFather;
	}

	@Override
	public String toString() {
		return "Chapter [idChapter=" + idChapter + ", chapterName=" + chapterName + ", hentaiFather=" + hentaiFather
				+ "]";
	}
	
	
}
