package class49_configReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class ReadPropertyFile 
{
	// Java can read and write properties file using Property class
		// You dont need any external lib for properties file
		
		// Step 1- Load the config file
	
	@Test
	public void readConfig() throws IOException
	{
		File src = new File("./Config/Config.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(src);
		prop.load(fis);
		System.out.println(prop.getProperty("Pragna"));
		System.out.println(prop.getProperty("URL"));
		
	}
}
