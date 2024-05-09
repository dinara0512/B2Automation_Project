package com.loop.test.day9_configu_driver;

import com.loop.test.utilities.ConfigurationReader;

public class T0_test_config {
    public static void main(String[] args) {
        System.out.println(ConfigurationReader.getProperty("env"));
    }
}
