package com.thoughtworks.tdd;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author Dylan Wei
 * @date 2018-07-11 10:58
 */
public class FizzBuzz {

    public String sayNumber(int number) {
        if(String.valueOf(number).contains("3"))
            return "Fizz";

        StringBuffer stringBuffer = new StringBuffer();
        if(number%3==0){
            stringBuffer.append("Fizz");
        }
        if(number%5==0){
            stringBuffer.append("Buzz");
        }
        if(number%7==0){
            stringBuffer.append("Whizz");
        }
        return stringBuffer.length()==0?number + "":stringBuffer.toString();
    }
}
