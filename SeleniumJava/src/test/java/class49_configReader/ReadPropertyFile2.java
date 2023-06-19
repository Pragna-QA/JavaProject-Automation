package class49_configReader;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
import dataProvider.ConfigReader;

public class ReadPropertyFile2 
{
	// Java can read and write properties file using Property class
		// You dont need any external lib for properties file
		
		// Step 1- Load the config file

	public void readConfig()
	{
		System.out.println(ConfigReader.getProperty("stagingURL"));
	}
}
