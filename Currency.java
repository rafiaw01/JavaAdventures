package CurrencyConverter;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Name");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        System.out.println(Name  +  "  Awesome");

        Double USD = 3.678 ;
        Double EUR = 1.065 ;

        double currency;
        currency = USD * EUR ;
        System.out.println("The Conversion is  "  + currency);



    }
}
