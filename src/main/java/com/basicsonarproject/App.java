package com.basicsonarproject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger;
    public static void main( String[] args )
    {
        com.basicsonarproject.Math calcul = new com.basicsonarproject.Math();
        float a = 5;
        float b = 5;
        float sumAb = calcul.sum(a,b);
        logger.log(Level.FINE,"Sum=  {0}", sumAb);
    }
}
