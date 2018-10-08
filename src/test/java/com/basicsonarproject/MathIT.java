package com.basicsonarproject;

import org.junit.Assert;
import org.junit.Test;

public class MathIT {

    @Test
    public void mathAdunare(){
        com.basicsonarproject.Math calcul = new com.basicsonarproject.Math();
        Assert.assertTrue(calcul.sum(5, 5) == 10);
    }
}
