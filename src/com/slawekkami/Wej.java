package com.slawekkami;

//import java.io.BufferedReader;
//import java.io.IOException;
import java.io.*;
import java.util.*;

/**
 * Created by S�awomir on 2015-10-18.
 */
public class Wej //clasa wejscia danych double z klawiatury
{

    static InputStreamReader wejscie = new InputStreamReader(System.in);
    static BufferedReader bufor = new BufferedReader(wejscie);
    StringTokenizer bon;

    double weDouble()//
    {
        try
        {
            bon = new StringTokenizer(bufor.readLine());
            return new Double(bon.nextToken()).doubleValue();
        } catch (IOException e)
        {
            System.err.println("Blad IO	double	" + e);
            return 0.0;
        } catch (NumberFormatException e)  //gdy wprowadzone dane nie s� liczb�
        {
            System.err.println("Wprowadzi�e� z�e znaki	" + e);
            return 0;
        }
    }
}