package com.pro.Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;

	public ConfigDataProvider() {

		File src = new File("./Configuration/Config.Properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			prop = new Properties();

			prop.load(fis);
		} catch (Exception e) {

			System.out.println("Unable to read config file>>" + e.getMessage());

		}

	}

	
	public String getBrowser() {

		return prop.getProperty("browser");

	}

	public String getUrl() {

		return prop.getProperty("url");

	}

}
