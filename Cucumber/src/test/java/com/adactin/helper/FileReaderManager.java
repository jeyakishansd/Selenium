package com.adactin.helper;

import java.io.IOException;

import com.configuration.property.ConfigurationReader;

public class FileReaderManager {
private FileReaderManager() {
		
	}

	public  static FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getcrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}


}
