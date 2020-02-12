package com.fubon.testapp.api.res;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class PharmacieRes implements Serializable{

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("features")
	List<Feature> features;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	
	
	
}
