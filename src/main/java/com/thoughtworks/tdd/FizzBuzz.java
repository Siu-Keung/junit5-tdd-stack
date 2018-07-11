package com.thoughtworks.tdd;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author Dylan Wei
 * @date 2018-07-11 10:58
 */
public class FizzBuzz {

    public String getSayNumber(int number) {
        StringBuffer stringBuffer = new StringBuffer();
        if(number%3==0){
            stringBuffer.append("");
        }
        return stringBuffer.append(number).toString();
    }
}
