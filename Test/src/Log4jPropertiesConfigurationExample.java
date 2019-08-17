import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesConfigurationExample
{
    static Logger logger = Logger.getLogger(Log4jPropertiesConfigurationExample.class);
    
    public static void main(String[] args)
    {
    	String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure(log4jConfigFile);
 
        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
    }
}