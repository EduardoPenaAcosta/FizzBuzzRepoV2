package kata.example;

public class Number {

    public Number() {
    }

    /*
    * Se pone primero si es divisible entre ambos para que compruebe
    * primero eso, si no devolverá los otros resultados.
    */

    public String obtainMultipleBy(int number){

        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";

        if(number % 3 == 0) return "Fizz";

        if(number % 5 == 0) return "Buzz";

        return Integer.toString(number);
    }
}
