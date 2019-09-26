package com.mypackage.it.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class SampleRepositoryImplTest {

	@InjectMocks
	private SampleRepositoryImpl sampleRepositoryImpl;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getUserTest() {
		assertNotNull(sampleRepositoryImpl.getUser());
	}
	
}
