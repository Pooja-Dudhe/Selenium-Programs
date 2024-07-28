package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertiesFile {
public static void main(String[] args) throws IOException {
	//File f = new File("C:\\Users\\User\\eclipse-workspace\\Automation\\testData\\demoWebShop.properties");//absolute path
	File f = new File(".\\testData\\demoWebShop.properties");//relative path
	FileInputStream fis = new FileInputStream(f);//here we can pass url,
	//create object for File class is not manadatory in that case
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	System.out.println(url);
	System.out.println(prop.getProperty("email"));
	System.out.println(prop.getProperty("password"));
	
}
}
