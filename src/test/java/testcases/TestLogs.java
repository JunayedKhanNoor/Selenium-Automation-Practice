package testcases;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class TestLogs {
	public static Logger log =Logger.getLogger(TestLogs.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("Hello");
		log.error("Error");
		System.out.println("Hello Log4j");
		
		

	}

}
