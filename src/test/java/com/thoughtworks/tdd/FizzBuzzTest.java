package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.fest.assertions.api.Assertions.assertThat;
/**
 * @author Dylan Wei
 * @date 2018-07-11 10:55
 */
public class FizzBuzzTest {
    @Test
    public void should_get_number_one_when_given_one(){
        //given
        int number = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.getSayNumber(number);
        //then
        assertThat(str).isEqualTo("1");
    }
}
