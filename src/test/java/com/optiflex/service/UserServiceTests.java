package com.optiflex.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.optiflex.model.UserModel;
import com.optiflex.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class UserServiceTests {

	@InjectMocks
	private UserService userService;
	@Mock
	private UserRepository userRepository;
	
	
	@Test
	public void getAllUsersTest()
	{
		when(userRepository.findAll()).thenReturn(Stream.of(new UserModel(),new UserModel()).collect(Collectors.toList()));
		assertEquals(2,userService.getAllUsers().size());
	}
}
