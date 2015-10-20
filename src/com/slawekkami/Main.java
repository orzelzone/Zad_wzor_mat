package com.slawekkami;




public class Main {

    public static void main(String[] args) {
        // write your code here
        //Aplikacja  rozwi¹zuj¹ca  dzia³anie matematyczne kewadrat sumy trzech sk³adników
        //(a+b+c)^2 = a^2+B^2+c^2+2(ab+ac+bc)
        double a;
        double b;
        double c;
        double wynik;
        Boolean plec;
        Wej we =new Wej();//obiekt clasy wejscia danych
        String imie; //zmienna w której zapiszemy  imie
        System.out.println("Podaj swoje imiê:");
        imie =  we.weString();   //odczyt.nextLine();
        System.out.println("Witaj " + imie); //wyœwietlamy powitanie
        plec = imie.endsWith("a"); // okreœlenie p³ci u¿ytkownika programu
       /* if(plec==true)
        {
            System.out.println("Jesteœ kobiet¹");
        }
        else
        {
            System.out.println("Jesteœ mê¿czyzn¹");
        }*/
        do {
            System.out.println("Podaj liczbê a");
            a = we.weDouble(plec);
        }
        while (a==0);
        do {
            System.out.println("Podaj liczbê b");
            b = we.weDouble(plec);
        }
        while (b==0);
        do {
            System.out.println("Podaj liczbê c");
            c = we.weDouble(plec);
        }
        while (c==0);

        if(plec)
        {
            System.out.println("Wprowadzilas liczby  a=" + a + " ; b=" + b + " ; c= " + c);
        }
        else
        {
            System.out.println("Wprowadziles liczby  a=" + a + " ; b=" + b + " ; c= " + c);
        }

        wynik = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + 2 * (a * b + a * c + b * c);
        System.out.println("Wynik dzialania postaci (a+b+c)^2 = a^2+B^2+c^2+2(ab+ac+bc)= " + wynik);
       // System.out.println(weDouble());



    }
}
