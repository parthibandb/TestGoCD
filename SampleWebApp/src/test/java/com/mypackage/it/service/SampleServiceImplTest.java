package com.mypackage.it.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.mypackage.it.repository.SampleRepository;

import model.User;

public class SampleServiceImplTest {

	@InjectMocks
	private SampleServiceImpl sampleServiceImpl;
	
	@Mock
	private SampleRepository sampleRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getUserTest_invalidFirstName() {
		User user = new User();
		user.setFirstName("not_parthiban");
		user.setLastName("no necessary to set considering the logic");
		user.setRole("no necessary to set considering the logic");
		Mockito.when(sampleRepository.getUser()).thenReturn(user);
		assertNull(sampleServiceImpl.getUser());
	}
	
	@Test
	public void getUserTest_validFirstName() {
		User user = new User();
		user.setFirstName("parthiban");
		user.setLastName("no necessary to set considering the logic");
		user.setRole("no necessary to set considering the logic");
		Mockito.when(sampleRepository.getUser()).thenReturn(user);
		assertNotNull(sampleServiceImpl.getUser());
	}
}
