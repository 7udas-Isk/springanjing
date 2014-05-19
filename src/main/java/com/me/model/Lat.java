package com.me.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_lat")
public class Lat {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id")
	private Integer id;
	
	@Column(name = "nilai")
	private String nilai;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNilai() {
		return nilai;
	}

	public void setNilai(String nilai) {
		this.nilai = nilai;
	}
}
