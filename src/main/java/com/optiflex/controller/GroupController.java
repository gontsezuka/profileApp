package com.optiflex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.optiflex.enums.App;
import com.optiflex.enums.Views;
import com.optiflex.model.UserModel;
import com.optiflex.service.GroupService;
import com.optiflex.service.UserService;

@Controller
public class GroupController {

	private String message ="";
	@Autowired
	private UserService userService;
	
	@Autowired
	private GroupService groupService;
	
	@GetMapping("/list/{LOGGEDINUSERID}/{GROUPID}")
	public ModelAndView listAllUsersInGroup(@PathVariable("LOGGEDINUSERID") String LOGGEDINUSERID,@PathVariable("GROUPID") String GROUPID)
	{
		int LOGGEDINUSER = Integer.parseInt(LOGGEDINUSERID);
		int GROUP = Integer.parseInt(GROUPID);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(Views.LIST.toString());
		/**
		 * GET LOGGED IN USER DETAILS
		 */
		UserModel user = userService.findUserByID(LOGGEDINUSER);
		mav.addObject(App.USER.toString(), user);
		/**
		 * GET ALL USERS IN GROUP
		 */
		List<UserModel> users = userService.findAllUsersByGroupId(GROUP);
		if(users.isEmpty())
		{
			mav.addObject(App.MESSAGE.toString(), "NO MEMEBERS");
			return mav;
		}
		
		mav.addObject(App.MESSAGE.toString(), "");
		mav.addObject(App.ALLUSERS.toString(), users);
		return mav;
	}
}
