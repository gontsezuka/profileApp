package com.optiflex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optiflex.model.GroupModel;
import com.optiflex.repository.GroupRepository;

@Service
public class GroupService {

	@Autowired
	private GroupRepository groupRepository;
	
	public List<GroupModel> findAllGroups()
	{
		return groupRepository.findAll();
	}
	
	
	public Optional<GroupModel> findById(GroupModel groupModel)
	{
		return groupRepository.findById(groupModel.getId());
	}
	
	public String findGroupNameById(Integer groupId)
	{
		return groupRepository.findGroupNameById(groupId);
	}
	public GroupModel findGroupById(Integer groupId)
	{
		return groupRepository.findGroupById(groupId);
	}
}
