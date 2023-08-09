package com.contactmanager.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	@Column(unique = true)
	private String email;
	private String password;
	private String role;
	private boolean enabled;
	@Column(length = 500)
	private String about;
	private String imageUrl;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contact> contacts=new ArrayList<Contact>();
	 
}
