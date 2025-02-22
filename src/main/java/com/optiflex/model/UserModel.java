package com.optiflex.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="optiusers")
public class UserModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String username;
	private String surname;
	private String nickname;
	private String role;
	private String pass;
	private String email;
	
	@ManyToOne
	@JoinColumn
	private GroupModel groupmodel;
	
	public UserModel()
	{
		
	}
	
	public UserModel(String username,String surname,String nickname,String role,String pass,String email,GroupModel groupModel)
	{
		this.username=username;
		this.surname=surname;
		this.nickname= nickname;
		this.role=role;
		this.pass=pass;
		this.email=email;
		this.groupmodel=groupModel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public GroupModel getGroupmodel() {
		return groupmodel;
	}
	public void setGroupmodel(GroupModel groupmodel) {
		this.groupmodel = groupmodel;
	}
	
	
}
