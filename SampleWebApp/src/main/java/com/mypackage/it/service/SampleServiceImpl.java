package com.mypackage.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypackage.it.repository.SampleRepository;

import model.User;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleRepository sampleRepository;
	
	@Override
	public User getUser() {
		User user = sampleRepository.getUser();
		if ("parthiban".equalsIgnoreCase(user.getFirstName())) {
			return user;
		} else {
			return null;
		}
	}

}
