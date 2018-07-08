package com.nim.move.store.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.nim.move.store.constants.Constants;

/**
 * Property loader class to load system properties
 * @Class Singleton
 * @author Indrajit
 *
 */
public class PropertyLoader {

	private static PropertyLoader loadProperties;

	private static Properties properties = new Properties();

	/**
	 * Private default constructor
	 */
	private PropertyLoader() {
		FileInputStream inputStream = null;
		try {
			properties.load(new FileReader(new File(Constants.PROPERTY_PATH)));
		} catch (IOException e) {
			System.err.println("Unable to load properties");
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.err.println("Unable to close stream");
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @return PropertyLoader object singleton
	 */
	public static PropertyLoader getPropertyInstance() {
		if (loadProperties == null) {
			loadProperties = new PropertyLoader();
		}
		return loadProperties;
	}

	/**
	 * @param key
	 * @return property key
	 */
	public String get(String key) {
		return (String) properties.get(key);
	}

	/**
	 * @param key
	 * @return property value
	 */
	public String getProperties(String key) {
		return properties.getProperty(key);
	}
}
