package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //#1- Create Properties class object
    private static Properties properties = new Properties();


    static {

        //#2- Open the file in JVM Memory and pass the path of the file
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3- Load the opened file into the Properties object.
            properties.load(file);

            //closing the file in JVM Memory
            file.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    //#4- Use the object to read from the configuration.properties file
    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);

    }

}
