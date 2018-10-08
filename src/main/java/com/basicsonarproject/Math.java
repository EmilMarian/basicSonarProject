package com.basicsonarproject;

public class Math {

    float a = 5;
    float b = 5;

    Math(){
        System.out.println( sum(a,b));
    }

    public float sum(float x, float y){
        return x + y;
    }
}
