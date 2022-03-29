package kata.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {


    Number number = new Number(3);

    @Test
    public void when_is_multiple_by_3(){
        assertEquals("Fizz", number.obtainMultipleBy(number.number));
    }

    @Test
    public void when_is_multiple_by_5(){
        assertEquals("Buzz", number.obtainMultipleBy(number.number));
    }

    @Test
    public void when_is_multiple_by_3_and_5(){
        assertEquals("FizzBuzz", number.obtainMultipleBy(number.number));
    }

    @Test
    public void when_is_multiple_by_3_or_contains_3_in_it(){
        assertEquals("A number is fizz if is divisible by 3 or if it has a 3 in it",
                    number.obtainMultipleBy(number.number));
    }
    @Test
    public void when_is_multiple_by_5_or_contains_5_in_it(){
        assertEquals("A number is fizz if is divisible by 5 or if it has a 5 in it",
                number.obtainMultipleBy(number.number));
    }

}
