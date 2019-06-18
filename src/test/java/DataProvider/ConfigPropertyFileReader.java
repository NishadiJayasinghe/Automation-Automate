package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigPropertyFileReader {
  
	private static String propertyFile = "./configs/Configuration.properties";

    public static String getPropertyValue(String property) {
        Properties prop = new Properties();
        InputStream input = null;
        String value = null;
        try {
            input = new FileInputStream(propertyFile);
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            value = prop.getProperty(property);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }


    /*public static void setPropertyValue(String property, String value) {
        try {
            FileInputStream in = new FileInputStream(propertyFile);
            Properties props = new Properties();
            props.load(in);
            in.close();
            FileOutputStream out = new FileOutputStream(propertyFile);
            props.setProperty(property, value);
            props.store(out, null);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*/

	
}
