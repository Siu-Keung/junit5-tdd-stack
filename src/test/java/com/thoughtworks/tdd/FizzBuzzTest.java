package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
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
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("1"));
    }

    @Test
    public void should_get__Fizz_when_given_three(){
        //given
        int number = 3;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("Fizz"));
    }

    @Test
    public void should_get__Buzz_when_given_five(){
        //given
        int number = 5;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("Buzz"));
    }

    @Test
    public void should_get__Whizz_when_given_seven(){
        //given
        int number = 7;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("Whizz"));
    }

    @Test
    public void should_get__FizzBuzz_when_given_15(){
        //given
        int number = 15;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("FizzBuzz"));
    }
    @Test
    public void should_get__FizzWhizz_when_given_21(){
        //given
        int number = 21;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("FizzWhizz"));
    }
    @Test
    public void should_get__FizzBuzzWhizz_when_given_105(){
        //given
        int number = 105;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_get_Fizz_when_given_35(){
        //given
        int number = 35;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        String expected = "Fizz";
        assertThat(str, is(expected));
    }
}
