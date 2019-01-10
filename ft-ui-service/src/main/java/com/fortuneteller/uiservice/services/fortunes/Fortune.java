package com.fortuneteller.uiservice.services.fortunes;

public class Fortune {
    private Long id;
    private String text;
    
	public Fortune() {
		super();
	}

	public Fortune(Long id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Fortune [id=" + id + ", text=" + text + "]";
	}
}
