package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	public static Properties prop;

	public static String getProperty(String key) {
	
		try {
		
			prop = new Properties();
			prop.load(new FileInputStream(Constants.CREDENTIALS_FILEPATH));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}

}
