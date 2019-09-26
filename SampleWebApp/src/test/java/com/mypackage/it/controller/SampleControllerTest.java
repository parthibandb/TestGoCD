package com.mypackage.it.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;
import com.mypackage.it.service.SampleService;

import model.User;

@RunWith(SpringRunner.class)
@WebMvcTest(com.mypackage.it.controller.SampleController.class)
public class SampleControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SampleService sampleService;
	
	@Test
	public void testMethod1() throws Exception {
		mockMvc.perform(get("/test1")).andExpect(status().isOk());
	}
	
	@Test
	public void testMethod2() throws Exception {
		User user = new User();
		user.setFirstName("parthiban");
		user.setLastName("dhasaradhan");
		user.setRole("Sr. Associate - s/w Engg.");
		mockMvc.perform(post("/test2").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE).content(new Gson().toJson(user))).andExpect(status().isOk());
	}
	
}
