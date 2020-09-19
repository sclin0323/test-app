package com.fubon.testapp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="ROLE")
public class Role {
	
	@Id
	@Column(name="ROLE_ID")
	private String roleId;
	
	@Column(name="NAME")
	private String name;

	
}
