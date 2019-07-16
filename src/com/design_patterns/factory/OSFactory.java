package com.design_patterns.factory;


public class OSFactory
{
    public OS getInstance(String type)
    {
        // Based on the dynamic string type passed we create the object.
        if (type.equals("Android")) {
            return new Android();
        } else if (type.equals("IOS")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}