package kata.example;

public class Number {

    int number;

    public Number(int number) {
        this.number = number;
    }

    public String obtainMultipleBy(int number){

        String numberUsado = Integer.toString(number);
        String resultado = number_has_3_or_5_in_it(numberUsado,numberUsado);

        if (number <= 0) return "You can't type a 0 or negative number";

        if (number % 3 == 0) return number_has_3_or_5_in_it(resultado, "3");

        if( number % 5 == 0) return number_has_3_or_5_in_it(resultado,"5");

        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";

        return resultado;
    }

    public String number_has_3_or_5_in_it(String number, String numerContain){
        String messageReturn = "";

        if(number.contains(numerContain)) return "A number is fizz if is divisible by " + numerContain +
                " or if it has a "+ numerContain +" in it";

        if(!number.contains("5") && !number.contains("3")) return number;

        return messageReturn;
    }
}
