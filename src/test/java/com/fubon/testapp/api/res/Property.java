package com.fubon.testapp.api.res;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {
	
	@JsonProperty("id")
	String id;
	
	@JsonProperty("name")
	String name;
	
	@JsonProperty("phone")
	String phone;
	
	@JsonProperty("address")
	String address;
	
	@JsonProperty("mask_adult")
	Integer maskAdult;
	
	@JsonProperty("mask_child")
	Integer maskChild;
	
	@JsonProperty("updated")
	String updated;
	
	@JsonProperty("available")
	String available;
	
	@JsonProperty("note")
	String note;
	
	@JsonProperty("customNote")
	String customNote;	
	
	@JsonProperty("website")
	String website;
	
	@JsonProperty("county")
	String county;
	
	@JsonProperty("town")
	String town;
	
	@JsonProperty("cunli")
	String cunli;
	
	@JsonProperty("service_periods")
	String servicePeriods;
	
	@JsonProperty("service_note")
	String serviceNote;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMaskAdult() {
		return maskAdult;
	}

	public void setMaskAdult(Integer maskAdult) {
		this.maskAdult = maskAdult;
	}

	public Integer getMaskChild() {
		return maskChild;
	}

	public void setMaskChild(Integer maskChild) {
		this.maskChild = maskChild;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCustomNote() {
		return customNote;
	}

	public void setCustomNote(String customNote) {
		this.customNote = customNote;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCunli() {
		return cunli;
	}

	public void setCunli(String cunli) {
		this.cunli = cunli;
	}

	public String getServicePeriods() {
		return servicePeriods;
	}

	public void setServicePeriods(String servicePeriods) {
		this.servicePeriods = servicePeriods;
	}

	public String getServiceNote() {
		return serviceNote;
	}

	public void setServiceNote(String serviceNote) {
		this.serviceNote = serviceNote;
	}

	
	
}
