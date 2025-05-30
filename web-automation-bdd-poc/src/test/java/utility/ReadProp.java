package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static String getPropData(String propToBeRead) throws IOException
	{
		String path = System.getProperty("user.dir") +"\\src\\test\\resources\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(propToBeRead);
		
//		System.out.println(value);
		
		return value;
	}
}
