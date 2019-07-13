package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberTest {

    @Test
    public  void should_return_Fizz_when_input_3() {
        //given 3
        int number1 = 3;
        //when
        Game game1 = new Game();
        // then Fizz
        String output1 = game1.getNumber(number1);
        assertThat(output1, is("Fizz"));
    }
    public  void should_return_Buzz_when_input_5() {
            int number2 = 5;
            //when
            Game game2 = new Game();

            // then Fizz
            String output2 = game2.getNumber(number2);
            assertThat(output2, is("Buzz"));
        }
    public  void should_return_Whizz_when_input_7(){
        int number3 = 7;
        //when
        Game game3 = new Game();

        // then Fizz
        String output3= game3.getNumber(number3);
        assertThat(output3, is("Whizz"));
    }
    public  void should_return_Whizz_when_input_15(){
        int number4 = 15;
        //when
        Game game4 = new Game();

        // then Fizz
        String output4= game4.getNumber(number4);
        assertThat(output4, is("FizzBuzz"));
    }
    public  void should_return_Whizz_when_input_21(){
        int number5 = 21;
        //when
        Game game5 = new Game();

        // then Fizz
        String output5= game5.getNumber(number5);
        assertThat(output5, is("FizzWhizz"));
    }
    public  void should_return_Whizz_when_input_35(){
        int number6 = 35;
        //when
        Game game6 = new Game();

        // then Fizz
        String output6= game6.getNumber(number6);
        assertThat(output6, is("BuzzWhizz"));
    }
    public  void should_return_Whizz_when_input_105(){
        int number7 = 105;
        //when
        Game game7 = new Game();

        // then Fizz
        String output7= game7.getNumber(number7);
        assertThat(output7, is("FizzBuzzWhizz"));
    }
    public  void should_return_Whizz_when_input_2(){
        int number8 = 2;
        //when
        Game game8 = new Game();

        // then Fizz
        String output8= game8.getNumber(number8);
        assertThat(output8, is(number8));
    }
    public  void should_return_Whizz_when_input_13(){
        int number9 = 13;
        //when
        Game game9 = new Game();

        // then Fizz
        String output9= game9.getNumber(number9);
        assertThat(output9, is(13));
    }
}
