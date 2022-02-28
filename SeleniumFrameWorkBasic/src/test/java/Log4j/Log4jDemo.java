package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger = LogManager.getFormatterLogger(Log4jDemo.class);

	public static void main(String[] args) {

		//System.out.println("this is first line");
		//It only prints the error message and the fatal message because there is not configuration file defined

		logger.info("This is info message");
		logger.error("This is an error message");
		logger.warn("This is a warning");
		logger.fatal("This is a fatal error");

	}

}
