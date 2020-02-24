package com.optiflex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.optiflex.enums.App;
import com.optiflex.enums.Views;
import com.optiflex.model.UserModel;
import com.optiflex.service.GroupService;
import com.optiflex.service.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private GroupService groupService;
	
	private String userAvailable="no";
	
	
	@GetMapping("/registration")
	public ModelAndView getRegistrationView()
	{
		ModelAndView mav = new ModelAndView();
		//mav.addObject(App.USER.toString(), new UserModel());
		mav.addObject(App.ALLGROUPS.toString(), groupService.findAllGroups());
		mav.setViewName(Views.REGISTRATION.toString());
		return mav;
	}
	
	
	
	/**
	@PostMapping("/registeruser")
	public ModelAndView registerUser(@ModelAttribute UserModel userModel, BindingResult bind)
	{
		
		 * HERE WE ARE REGISTERING A USER
		 * The user object will come from frontend,then we will test if exist
		 * if the user doesnt exist we save them in database.
		 
		ModelAndView mav = new ModelAndView();
		if(userService.isUserAvailable(userModel)==true)
		{
			mav.addObject(userAvailable, "yes");
			mav.setViewName(Views.REGISTRATION.toString());
			return mav;
		}
		
		UserModel user = userService.saveUser(userModel);
		mav.addObject(App.USER.toString(), user);
		mav.setViewName(Views.LOGIN.toString());
		return mav;
	}	

	**/
	@PostMapping("/registeruser")
	public ModelAndView registerUser(@RequestParam("username")String username,@RequestParam("surname")String surname,@RequestParam("pass")String
			pass,@RequestParam("role") String role,@RequestParam("email") String email, @RequestParam("groups") Integer groupId,@RequestParam("nickname")String nickname)
	{
		/**
		 * HERE WE ARE REGISTERING A USER
		 * The user object will come from frontend,then we will test if exist
		 * if the user doesnt exist we save them in database.
		 */
		ModelAndView mav = new ModelAndView();
		UserModel userModel = new UserModel(username,surname,nickname,role,pass,email,groupService.findGroupById(groupId));
		
		UserModel user = userService.saveUser(userModel);
		/**if(userService.isUserAvailable(user)==true)
		{
			mav.addObject(userAvailable, "yes");
			mav.setViewName(Views.REGISTRATION.toString());
			return mav;
		}
		**/
		
		mav.addObject(App.USER.toString(), user);
		mav.setViewName(Views.LOGIN.toString());
		return mav;
	}	
	
	@GetMapping("/login")
	public ModelAndView getLoginView()
	{
		/**
		 * HERE WE ARE RETURN THE LOGIN VIEW TO THE USER IF THEY CLICK login
		 * 
		 */
		ModelAndView mav = new ModelAndView();
		mav.setViewName(Views.LOGIN.toString());
		return mav;
	}
	
	
	@PostMapping("/loginuser")
	public ModelAndView loginuser(@RequestParam("email") String email,@RequestParam("password") String password)
	{
		/**
		 * Here we are getting the user's data for login purpose
		 * then checking if the user exist and if the email & password are correct
		 */
		ModelAndView mav = new ModelAndView();
		
		if(userService.checkIfValuesArePresent(password, email)==false)
		{
			mav.setViewName(Views.LOGIN.toString());
			return mav;
		}
		UserModel user = userService.findUserByEmail(email);
		
		if(userService.isUserAvailable(user)==false)
		{
			mav.setViewName(Views.LOGIN.toString());
			return mav;
		}
		
		if(userService.checkIfPasswordIsCorrect(user)==false)
		{
			mav.setViewName(Views.LOGIN.toString());
			return mav;
		}
		
		mav.addObject(App.ALLGROUPS.toString(), groupService.findAllGroups());
		mav.addObject(App.USER.toString(), user);
		mav.setViewName(Views.HOME.toString());
		return mav;
	}
	
	/**
	 * NEED TO ADD UPDATE USER
	 */
	
	@GetMapping("/person/{LOGGEDINUSERID}/{USERID}")
	public ModelAndView getListedPersonDetails(@PathVariable("LOGGEDINUSERID")String LOGGEDINUSERID,@PathVariable("USERID") String USERID)
	{
		Integer LOGGEDINUSER = Integer.parseInt(LOGGEDINUSERID);
		Integer USER = Integer.parseInt(USERID);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(Views.PERSON.toString());
		/**
		 * GET LOGGED IN USER DETAILS
		 */
		UserModel user = userService.findUserByID(LOGGEDINUSER);
		UserModel person = userService.findUserByID(USER);
		String groupname= groupService.findGroupNameById(person.getGroupmodel().getId());
		
		
		mav.addObject(App.GROUPNAME.toString(),groupname);
		mav.addObject(App.USER.toString(), user);
		mav.addObject(App.LISTEDPERSON.toString(), person);
		return mav;
	}
	
	@GetMapping("/logout/{LOGGEDINUSERID}")
	public ModelAndView logout(@PathVariable("LOGGEDINUSERID") String LOGGEDINUSERID)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName(Views.LOGIN.toString());
		return mav;
	}
	
	
	@GetMapping("/home/{LOGGEDINUSERID}")
	public ModelAndView goHome(@PathVariable("LOGGEDINUSERID") String LOGGEDINUSERID)
	{
		Integer LOGGEDINUSER = Integer.parseInt(LOGGEDINUSERID);
		UserModel user = userService.findUserByID(LOGGEDINUSER);
		ModelAndView mav = new ModelAndView();
		mav.addObject(App.USER.toString(), user);
		mav.setViewName(Views.HOME.toString());
		return mav;
	}
}
