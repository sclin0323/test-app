package com.fubon.testapp.api.res;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feature {
	

	@JsonProperty("type")
	String type;
	
	@JsonProperty("properties")
	List<Property> properties;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	
}
