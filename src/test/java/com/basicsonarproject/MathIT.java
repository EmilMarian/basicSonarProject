package com.basicsonarproject;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class MathIT {

    @Test
    public void mathAdunare(){
        Math calcul = new Math();
        Assert.assertTrue(calcul.sum(5, 5) == 10);
    }
}
