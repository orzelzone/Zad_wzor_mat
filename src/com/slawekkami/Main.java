package com.slawekkami;

 import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //Aplikacja  rozwi�zuj�ca  dzia�anie matematyczne kewadrat sumy trzech sk�adnik�w
        //(a+b+c)^2 = a^2+B^2+c^2+2(ab+ac+bc)
        double a;
        double b;
        double c;
        double wynik;
        Wej we =new Wej();//obiekt clasy wejscia danych double
        String imie; //w nim zapiszemy swoje imie
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
        System.out.println("Podaj swoje imi�:");
        imie = odczyt.nextLine();
        System.out.println("Witaj " + imie); //wy�wietlamy powitanie
        System.out.println("Podaj liczb� a");
            a= we.weDouble();
        System.out.println("Podaj liczb� b");
            b= we.weDouble();
        System.out.println("Podaj liczb� c");
            c= we.weDouble();
        System.out.println( "wprowadi�e� liczb� "+ a +" ; "+ b + " ; "+c);
        wynik= a*a+b*b+c*c+2*(a*b+a*c+b*c);
        System.out.println("wynik dzia�ania " + wynik);
       // System.out.println(weDouble());



    }
}
