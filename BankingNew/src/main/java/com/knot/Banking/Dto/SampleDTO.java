package com.knot.Banking.Dto;

import java.io.Serializable;

public class SampleDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8442245243109506278L;


	private String name;
	
	private String age;
	
	private String names;

	public SampleDTO() {
		super();
	}

	public SampleDTO(String name, String age, String names) {
		super();
		this.name = name;
		this.age = age;
		this.names = names;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

}
