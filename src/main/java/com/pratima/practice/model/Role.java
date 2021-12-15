package com.pratima.practice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	@Id
	private int roleId;
	private String roleName;
	
	@ManyToOne
	@JsonIgnore
	private User user;
	
}
