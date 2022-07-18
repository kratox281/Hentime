
package com.hentime.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="hentai")
public class Hentai {

	//-ATRIBUTOS-
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHentai;
	
	@Column
	private String hentaiName;
	
	@OneToMany(mappedBy = "hentai", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Chapter> chapter;
	
	@Column
	private Boolean finished;

	//-CONSTRUCTOR-
	
	public Hentai() {}

	//-METODOS-

	@Override
	public String toString() {
		return "Hentai [idHentai=" + idHentai + ", hentaiName=" + hentaiName + ", chapterList=" + chapter
				+ ", finished=" + finished + "]";
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

	public List<Chapter> getChapterList() {
		return chapter;
	}

	public void setChapterList(List<Chapter> chapterList) {
		this.chapter = chapterList;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

}