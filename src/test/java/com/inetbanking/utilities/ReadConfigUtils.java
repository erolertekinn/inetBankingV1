package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigUtils {
	Properties prop;

	public ReadConfigUtils() {

		File src = new File("./configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=prop.getProperty("userID");
	return username;
	}
	
	public String getPassword()
	{
	String password=prop.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=prop.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=prop.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=prop.getProperty("firefoxpath");
	return firefoxpath;
	}

}
