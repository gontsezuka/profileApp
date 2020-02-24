package com.optiflex.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="optigroups")
public class GroupModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String groupname;
	
	@OneToMany(mappedBy="groupmodel")
	private Set<UserModel> usermodel;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public void setUsermodel(Set<UserModel> usermodel) {
		this.usermodel = usermodel;
	}
	
	
	
	
}
