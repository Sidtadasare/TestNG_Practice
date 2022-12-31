package PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
	
	public static Properties prop;
	 
public static String readproperty(String key) {
		
		File file=new File("C:\\Users\\shrad\\eclipse-workspace\\TestNG_Practice\\src\\PropertyFile\\config.properties");
		FileInputStream fis;
		prop =new Properties();
		
		try {
			fis=new FileInputStream(file);
			 prop.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	
		
		String value=prop.getProperty(key);
		
		return value;
			
		
	}

}
