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
        Boolean plec;
        Wej we =new Wej();//obiekt clasy wejscia danych
        String imie; //zmienna w kt�rej zapiszemy  imie
        System.out.println("Podaj swoje imi�:");
        imie =  we.weString();   //odczyt.nextLine();
        System.out.println("Witaj " + imie); //wy�wietlamy powitanie
        plec = imie.endsWith("a");
        if(plec==true)
        {
            System.out.println("Jeste� kobiet�");
        }
        else
        {
            System.out.println("Jeste� m�czyzn�");
        }
        do {
            System.out.println("Podaj liczb� a");
            a = we.weDouble();
        }
        while (a==0);
        do {
            System.out.println("Podaj liczb� b");
            b = we.weDouble();
        }
        while (b==0);
        do {
            System.out.println("Podaj liczb� c");
            c = we.weDouble();
        }
        while (a==0);
        System.out.println( "wprowadi�e� liczb� "+ a +" ; "+ b + " ; "+c);
        wynik = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + 2 * (a * b + a * c + b * c);
        System.out.println("wynik dzia�ania " + wynik);
       // System.out.println(weDouble());



    }
}
