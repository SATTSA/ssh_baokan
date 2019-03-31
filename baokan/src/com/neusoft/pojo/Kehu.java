package com.neusoft.pojo;

import java.util.Date;

/**
 * Kehu entity. @author MyEclipse Persistence Tools
 */

public class Kehu implements java.io.Serializable {

	// Fields

	private Integer kid;
	private String kname;
	private String ksex;
	private Integer kconnect;
	private Date kbook;

	// Constructors

	/** default constructor */
	public Kehu() {
	}

	/** full constructor */
	public Kehu(String kname, String ksex, Integer kconnect, Date kbook) {
		this.kname = kname;
		this.ksex = ksex;
		this.kconnect = kconnect;
		this.kbook = kbook;
	}

	// Property accessors

	public Integer getKid() {
		return this.kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getKname() {
		return this.kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String getKsex() {
		return this.ksex;
	}

	public void setKsex(String ksex) {
		this.ksex = ksex;
	}

	public Integer getKconnect() {
		return this.kconnect;
	}

	public void setKconnect(Integer kconnect) {
		this.kconnect = kconnect;
	}

	public Date getKbook() {
		return this.kbook;
	}

	public void setKbook(Date kbook) {
		this.kbook = kbook;
	}

}