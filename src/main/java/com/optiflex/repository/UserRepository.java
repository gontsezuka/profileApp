package com.optiflex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.optiflex.model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

	@Query(value="SELECT * FROM optiusers op WHERE op.email = ?1",nativeQuery=true)
	public UserModel findUserByEmail(String email);
	
	@Query(value="SELECT * FROM optiusers op WHERE op.groupmodel_id = ?1",nativeQuery=true)
	public List<UserModel> findAllUsersByGroupId(Integer groupid);
	
	@Query(value="SELECT * FROM optiusers op WHERE op.id = ?1", nativeQuery=true)
	public UserModel findUserById(Integer userid);
}
