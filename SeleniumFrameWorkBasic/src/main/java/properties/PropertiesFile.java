package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		getProperties();
		setProperties();
	}

	public static void getProperties() {

		try {
			Properties prop = new Properties();
			String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath + "\\src\\test\\resources\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println("Running on " + " " + browser);

		}

		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}
		

	}
	
	public static void setProperties() {

		try {
			Properties prop = new Properties();
			String projectPath = System.getProperty("user.dir");
			OutputStream output = new FileOutputStream(projectPath +"\\src\\test\\resources\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		}

		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}

	}

}
