package com.artillect.peacefulutilities.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile){
		Configuration configuration = new Configuration(configFile);
	}
}
