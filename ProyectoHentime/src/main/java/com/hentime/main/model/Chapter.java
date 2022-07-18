package com.hentime.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="chapter")
public class Chapter {
	
	//-ATRIBUTOS-
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idChapter;
	
	@Column
	private String chapterName;
	
    @ManyToOne
    @JoinColumn(name = "id_hentai", nullable = false, foreignKey = @ForeignKey(name = "FK_hentai_chapter"))
	private Hentai hentai;

    //-CONSTRUCTOR-
    
	public Chapter() {}
	
	//-METODOS-

	@Override
	public String toString() {
		return "Chapter [idChapter=" + idChapter + ", chapterName=" + chapterName + "]";
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

	public Hentai getHentaiFather() {
		return hentai;
	}

	public void setHentaiFather(Hentai hentaiFather) {
		this.hentai = hentaiFather;
	}
	
	
}
