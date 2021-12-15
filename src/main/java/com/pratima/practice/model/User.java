package com.pratima.practice.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String role;
	private boolean enabled;
	
@OneToMany(mappedBy = "user")
private List<Role> roleId;

}
