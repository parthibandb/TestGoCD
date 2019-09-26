package com.mypackage.it.repository;

import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class SampleRepositoryImpl implements SampleRepository {

	@Override
	public User getUser() {
		User user = new User();
		user.setFirstName("parthiban");
		user.setLastName("dhasaradhan");
		user.setRole("Sr. Assoicate - Software Engineer");
		return user;
	}

}
