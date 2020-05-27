package Utils;

import java.util.*;  
import java.io.*;  
public class Propertyfile { 
	


public static String  prop( String data) throws IOException {
	   FileReader reader=new FileReader("data.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	    
	    String value =p.getProperty(data);
	    
		return value;       
}


}
