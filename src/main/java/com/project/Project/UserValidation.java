package com.project.Project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=/S+$).{8,}$";
	private static Pattern pattern;
	private static Matcher matcher;

	public void EmailValidator() {
		pattern = Pattern.compile(EMAIL_REGEX);
	}

	/**
	 * This method validates the input email address with EMAIL_REGEX pattern
	 * 
	 * @param email
	 * @return boolean
	 */
	public static boolean validateEmail(String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public void PasswordValidator() {
		pattern = Pattern.compile(PASSWORD_REGEX);
	}

	/**
	 * This method validates the input password with PASSWORD_REGEX pattern
	 * 
	 * @param password
	 * @return boolean
	 */
	public static boolean validatePassword(String password) {
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
