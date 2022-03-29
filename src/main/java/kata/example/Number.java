package kata.example;

public class Number {

    int number;

    public Number(int number) {
        this.number = number;
    }

    /*
    * Se pone primero si es divisible entre ambos para que compruebe
    * primero eso, si no devolverá los otros resultados.
    */

    public String obtainMultipleBy(int number){

        String numberUsado = Integer.toString(number);
        String resultado = number_has_3_or_5_in_it(numberUsado);

        if (number <= 0){
            resultado = "You can't type a 0 or negative number";
            return resultado;
        }
        if (number % 3 == 0) return resultado = number_has_3_or_5_in_it(resultado);

        if( number % 5 == 0) return resultado = number_has_3_or_5_in_it(resultado);

        if(number % 3 == 0 && number % 5 == 0) return resultado = "FizzBuzz";

        return resultado;
    }

    public String number_has_3_or_5_in_it(String number){
        String messageReturn = "";

        if(number.contains("3")){
            messageReturn = "A number is fizz if is divisible by 3 or if it has a 3 in it";
        }
        if(number.contains("5")){
            messageReturn = "A number is buzz if is divisible by 5 or if it has a 5 in it";
        }
        if(!number.contains("5") && !number.contains("3")){
            messageReturn = number;
        }

        return messageReturn;
    }
}
