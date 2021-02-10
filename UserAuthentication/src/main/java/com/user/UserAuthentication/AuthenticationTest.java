package com.user.UserAuthentication;


import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationTest {
	Logger theLogger = LoggerFactory.getLogger(AuthenticationTest.class);
	
	@Autowired
	AuthenticationEntity authEntity;
	
	@Autowired
	AuthenticationRepo authRepo;
	
	@BeforeEach
	public void beforeEachTest() {
		theLogger.info("Starting Test");
	}
	
	@Test
	public void findID() {
		assertNotNull(authRepo.findById(authEntity.getUserID()));
	}
	
	@AfterEach
	public void afterEachTest() {
		theLogger.info("Test Passed");
	}
	
	

}
