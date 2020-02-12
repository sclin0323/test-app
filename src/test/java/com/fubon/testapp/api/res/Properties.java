package com.fubon.testapp.api.res;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Properties implements Serializable{
	
	@JsonProperty("id")
	String id;
	
//	@JsonProperty("name")
//	String name;
//	
//	@JsonProperty("phone")
//	String phone;
//	
//	@JsonProperty("address")
//	String address;
//	
//	@JsonProperty("mask_adult")
//	Integer maskAdult;
//	
//	@JsonProperty("mask_child")
//	Integer maskChild;
	
//	@JsonProperty("updated")
//	String updated;
	
//	@JsonProperty("available")
//	String available;
	
//	@JsonProperty("note")
//	String note;
//	
//	@JsonProperty("customNote")
//	String customNote;	
	
//	@JsonProperty("website")
//	String website;
//	
//	@JsonProperty("county")
//	String county;
//	
//	@JsonProperty("town")
//	String town;
//	
//	@JsonProperty("cunli")
//	String cunli;
	
//	@JsonProperty("service_periods")
//	String servicePeriods;
//	
//	@JsonProperty("service_note")
//	String serviceNote;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	
}
