package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class SwiggiMavenRestaruantProjectApplication {

	public static String GLOBAL_USER_NAME = "";

	public static boolean GLOBAL_USER_PASSWORD;

	public static String GLOBAL_USER_First_NAME = "";
	public static String Login = "Login";

	public static Integer UserID = 0;
    
	public static String Login_Valadation = "Your cart page is empty, please select some items?";

	public static String LoginPageValidation = "";
	
	public static String searchdishname="";
	
	public static String searchByrestaurantName="";
	
	public static String Allavailabelrestaurnts="All Availabel Restaurants";
	
	public static String vegItems="";
	
	public static String getVegItems() {
		return vegItems;
	}

	public static void setVegItems(String vegItems) {
		SwiggiMavenRestaruantProjectApplication.vegItems = vegItems;
	}

	public static String getAllavailabelrestaurnts() {
		return Allavailabelrestaurnts;
	}

	public static void setAllavailabelrestaurnts(String allavailabelrestaurnts) {
		Allavailabelrestaurnts = allavailabelrestaurnts;
	}

	public static String getSearchByrestaurantName() {
		return searchByrestaurantName;
	}

	public static void setSearchByrestaurantName(String searchByrestaurantName) {
		SwiggiMavenRestaruantProjectApplication.searchByrestaurantName = searchByrestaurantName;
	}

	public static String getSearchdishname() {
		return searchdishname;
	}

	public static void setSearchdishname(String searchdishname) {
		SwiggiMavenRestaruantProjectApplication.searchdishname = searchdishname;
	}

	public static Long restaurantid;
	

	public static Long getRestaurantid() {
		return restaurantid;
	}

	public static void setRestaurantid(Long restaurantid) {
		SwiggiMavenRestaruantProjectApplication.restaurantid = restaurantid;
	}

	public static String getLoginPageValidation() {
		return LoginPageValidation;
	}

	public static void setLoginPageValidation(String loginPageValidation) {
		LoginPageValidation = loginPageValidation;
	}

	public static String getLogin_Valadation() {
		return Login_Valadation;
	}

	public static void setLogin_Valadation(String login_Valadation) {
		Login_Valadation = login_Valadation;
	}

	public static Integer getUserID() {
		return UserID;
	}

	public static void setUserID(Integer userID) {
		UserID = userID;
	}

	public static String getGLOBAL_USER_NAME() {
		return GLOBAL_USER_NAME;
	}

	public static void setGLOBAL_USER_NAME(String gLOBAL_USER_NAME) {
		GLOBAL_USER_NAME = gLOBAL_USER_NAME;
	}

	public static boolean isGLOBAL_USER_PASSWORD() {
		return GLOBAL_USER_PASSWORD;
	}

	public static void setGLOBAL_USER_PASSWORD(boolean gLOBAL_USER_PASSWORD) {
		GLOBAL_USER_PASSWORD = gLOBAL_USER_PASSWORD;
	}

	public static String getGLOBAL_USER_First_NAME() {
		return GLOBAL_USER_First_NAME;
	}

	public static void setGLOBAL_USER_First_NAME(String gLOBAL_USER_First_NAME) {
		GLOBAL_USER_First_NAME = gLOBAL_USER_First_NAME;
	}

	public static String getLogin() {
		return Login;
	}

	public static void setLogin(String login) {
		Login = login;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SwiggiMavenRestaruantProjectApplication.class, args);

		System.out.println("this is my project");

	}
	
}
