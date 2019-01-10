package com.fortuneteller.tellerservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="FORTUNES")
@Entity
public class Fortune implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
	@Column(name="id")
	private Integer Id;
    
	@Column(name="text", nullable = false)
    private String text;
	
	public Fortune() {
		super();
	}

	public Fortune(Integer id, String text) {
		super();
		
		Id = id;
		this.text = text;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Fortune [Id=" + Id + ", text=" + text + "]";
	}
	
}
