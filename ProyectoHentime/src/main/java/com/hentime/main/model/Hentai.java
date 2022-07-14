package com.hentime.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Hentai")
public class Hentai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHentai;
	
	@Column
	private String hentaiName;
	
	@Column
	private Integer chapterNumber;
	
	@Column
	private Boolean finished;

	public Hentai() {
		super();

	}

	public Integer getIdHentai() {
		return idHentai;
	}

	public void setIdHentai(Integer idHentai) {
		this.idHentai = idHentai;
	}

	public String getHentaiName() {
		return hentaiName;
	}

	public void setHentaiName(String hentaiName) {
		this.hentaiName = hentaiName;
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Hentai [idHentai=" + idHentai + ", hentaiName=" + hentaiName + ", chapterNumber=" + chapterNumber
				+ ", finished=" + finished + "]";
	}
	
	
	
}
