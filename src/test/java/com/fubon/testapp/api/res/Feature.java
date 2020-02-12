package com.fubon.testapp.api.res;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Feature implements Serializable{
	

	@JsonProperty("type")
	String type;
	
	@JsonProperty("properties")
	Properties properties;
	
	@JsonProperty("geometry")
	Geometry geometry;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	
	

	
}
