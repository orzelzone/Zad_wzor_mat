package com.slawekkami;

 import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //Aplikacja  rozwi¹zuj¹ca  dzia³anie matematyczne kewadrat sumy trzech sk³adników
        //(a+b+c)^2 = a^2+B^2+c^2+2(ab+ac+bc)
        double a;
        double b;
        double c;
        double wynik;
        Wej we =new Wej();//obiekt clasy wejscia danych double
        String imie; //w nim zapiszemy swoje imie
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
        System.out.println("Podaj swoje imiê:");
        imie = odczyt.nextLine();
        System.out.println("Witaj " + imie); //wyœwietlamy powitanie
        System.out.println("Podaj liczbê a");
            a= we.weDouble();
        System.out.println("Podaj liczbê b");
            b= we.weDouble();
        System.out.println("Podaj liczbê c");
            c= we.weDouble();
        System.out.println( "wprowadi³eœ liczbê "+ a +" ; "+ b + " ; "+c);
        wynik= a*a+b*b+c*c+2*(a*b+a*c+b*c);
        System.out.println("wynik dzia³ania " + wynik);
       // System.out.println(weDouble());



    }
}
