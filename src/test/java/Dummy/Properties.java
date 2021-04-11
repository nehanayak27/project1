package Dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Properties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		String x=System.getenv("java_home");
		System.out.println(x);
		
		
		
	}

}
