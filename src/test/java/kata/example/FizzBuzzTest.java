package kata.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {


    Number num = new Number();

    @Test
    public void when_is_multiple_by_3(){
        assertEquals("Fizz", num.obtainMultipleBy(3));
    }

    @Test
    public void when_is_multiple_by_5(){
        assertEquals("Buzz", num.obtainMultipleBy(5));
    }

    @Test
    public void when_is_multiple_by_3_and_5(){
        assertEquals("FizzBuzz", num.obtainMultipleBy(15));
    }

    @Test
    public void when_is_multiple_by_3_or_contains_3_in_it(){
        assertEquals("A number is fizz if is divisible by 3 or if it has a 3 in it",
                    num.obtainMultipleBy(3));
    }

}
