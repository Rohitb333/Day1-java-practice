package com.bridgelab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld
{
    private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message = "Hello, World";
        LOG.debug(message + " Will be Printed On Debug");
        LOG.info(message + "Will be Printed On info");
        LOG.warn(message + "Will be Printed On warn");
        LOG.error(message + "Will be Printed On error");
        LOG.fatal(message + "Will be Printed On fatal");
        LOG.info("Appending string: {}", message);
        System.out.println("Hello Rohit");
    }
}
