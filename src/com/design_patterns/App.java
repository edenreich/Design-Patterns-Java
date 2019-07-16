package com.design_patterns;

import com.design_patterns.factory.OS;
import com.design_patterns.factory.OSFactory;


public class App
{    
    public static void main(String[] args) throws Exception 
    {
        // Factory
        OSFactory osFactory = new OSFactory();

        if (args.length == 1) {
            OS osInput = osFactory.getInstance(args[0]);
            System.out.printf("User's chosen OS: %s\n",  osInput.spec());
        }

        OS android = osFactory.getInstance("Android");
        OS IOS = osFactory.getInstance("IOS");
        OS windows = osFactory.getInstance("Windows");

        System.out.println(android.spec());
        System.out.println(IOS.spec());
        System.out.println(windows.spec());
    }
}