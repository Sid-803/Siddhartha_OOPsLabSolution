package itSupport.service;
import itSupport.classes_main.*;
import java.security.SecureRandom;

//Class CredentialService with 1 derived declaration. which declares class Employee as datatype.
//Class CredentialService with a parametrised constructor. It accepts 1 argument.
//Class CredentialService with three methods. 
//Method1 - generateEmailAddress is used to provide email address from user defined inputs.
//Method2 - generatedPassword for specified length(Hard coded as 10)
//Method3 - showCredentials for candidate based on output of method1 and method 2 and user defined inputs.

public class CredentialService {
	private static Employee newemp;

	public CredentialService(Employee newemp) {
		CredentialService.newemp = newemp;
	}

	public static String generateEmailAddress(String s1,  String s2) {
		s1 = newemp.getFirstName();
		s2 = newemp.getLastName();
		String s3 = newemp.getDepartment();
		String s4 = Employee.compname;
		String s5 = s1 + s2 + "@" + s3 + "." + s4 + "." + "com";
		String s6 = s5.toLowerCase();
		return s6;
	}	
	public static String generatePassword(int length) {
		final String chars = "ABCDEFGHIJKLMNOPQRTSUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder strs = new StringBuilder();
		for(int i = 0; i<length; i++) {
			int randomIndex = random.nextInt(chars.length());
			strs.append(chars.charAt(randomIndex));
			}
		return strs.toString();
	}
	public String showCredentials(int s) {
		String s1 = newemp.getFirstName();
		String s2 = newemp.getLastName();
		System.out.println("Dear "+ s1 + " your generated credentials are as follows:-");
		System.out.println("Email --> " + CredentialService.generateEmailAddress(s1, s2));
		System.out.println("Password --> " + CredentialService.generatePassword(s));
		String s3 = "This password is auto generated. Please change it for later use.";
		return s3;
	}
 
}



