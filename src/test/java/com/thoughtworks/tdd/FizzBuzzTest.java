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
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("1");
    }

    @Test
    public void should_get__Fizz_when_given_three(){
        //given
        int number = 3;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("Fizz");
    }

    @Test
    public void should_get__Buzz_when_given_five(){
        //given
        int number = 5;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("Buzz");
    }

    @Test
    public void should_get__Whizz_when_given_seven(){
        //given
        int number = 7;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("Whizz");
    }

    @Test
    public void should_get__FizzBuzz_when_given_15(){
        //given
        int number = 15;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("FizzBuzz");
    }
    @Test
    public void should_get__FizzWhizz_when_given_21(){
        //given
        int number = 21;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("FizzWhizz");
    }
    @Test
    public void should_get__BuzzWhizz_when_given_35(){
        //given
        int number = 35;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("BuzzWhizz");
    }
    @Test
    public void should_get__FizzBuzzWhizz_when_given_357(){
        //given
        int number = 105;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String str = fizzBuzz.sayNumber(number);
        //then
        assertThat(str).isEqualTo("FizzBuzzWhizz");
    }
}
