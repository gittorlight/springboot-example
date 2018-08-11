package com.github.torlight.sbex;

import java.io.Serializable;

public class TEntityDO implements Serializable {

	/** */
	private static final long serialVersionUID = -5722867389965414588L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TEntityDO(String name) {
		super();
		this.name = name;
	}
	
	

}
