package com.optiflex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.optiflex.model.GroupModel;

@Repository
public interface GroupRepository extends JpaRepository<GroupModel, Integer> {

	@Query(value="SELECT groupname FROM optigroups opg WHERE opg.id = ?1",nativeQuery=true)
	public String findGroupNameById(Integer groupid);
	
	@Query(value="SELECT * FROM optigroups opg WHERE opg.id = ?1",nativeQuery=true)
	public GroupModel findGroupById(Integer groupid);
}
