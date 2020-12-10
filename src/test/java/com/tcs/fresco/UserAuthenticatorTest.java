package com.tcs.fresco;


/* Write static mocks for Assert and Mockito classes. -Q1 */

import static org.junit.Assert.*;
//Write import statements for Mockito classes.

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserAuthenticatorTest {


	UserAuthenticator authenticator = new UserAuthenticator();
	public static UserAuthenticatorInterface authenticatorMock;


	@BeforeClass
	public static void setUp() {
      /* Create mock object using static mock configuration  -Q2 */
      //Write your code here
        
	}

	@Before
	public void setUpAuthenticator() {
		authenticator.setUserAuthenticator(authenticatorMock);
	}

	  /*Complete the test case with the expected exception -Q3 */

      // Write your code here
	public void testAuthenticate_InvalidCredentials() throws FailedToAuthenticateException {

		String username = "User1";
		String password = "wrong password";
		String errorMessage = "Invalid credentials .Authentication Failed";
		
        /*Throw exception using doThrow...when configuration - Q4*/
        // Write your code here
        
		authenticator.authenticateUser(username, password);

	}

	@Test
	public void testAuthenticate_ValidCredentials() throws FailedToAuthenticateException {

		String username = "User1";
		String password = "Password";
	    /*Configure Returning True with when...thenReturn configuration on mock Object - Q5*/
        //Write your code here
		assertTrue(authenticator.authenticateUser(username, password));

	}

	@Test(expected=FailedToAuthenticateException.class)
	public void testAuthenticate_EmptyCredentials() throws FailedToAuthenticateException {

		String username = "";
		String password = "";
        String errorMessage= "Credentials cannot be empty";
        /*Configure Throwing exception using when...thenThrow configuration on mock Object - Q6*/	
        //Write your code here
        authenticator.authenticateUser(username, password);

	}
}
