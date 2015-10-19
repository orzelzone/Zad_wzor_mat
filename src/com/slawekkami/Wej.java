package com.slawekkami;

import java.io.*;
import java.util.*;

/**
 * Created by S³awomir on 2015-10-18.
 */
public class Wej //clasa wejscia danych double z klawiatury
{

    static InputStreamReader wejscie = new InputStreamReader(System.in);
    static BufferedReader bufor = new BufferedReader(wejscie);
    StringTokenizer bon;

    double weDouble(Boolean bool )//
    {
        try
        {
            bon = new StringTokenizer(bufor.readLine());
            return new Double(bon.nextToken()).doubleValue();
        } catch (IOException e)
        {
           // System.err.println("Blad IO	double	" + e);
            return 0;
        } catch (NumberFormatException e)  //gdy wprowadzone dane nie s¹ liczb¹
        {
           if(bool==true)
               System.err.println("Wprowadzilas zle znaki. WPROWADZI JESZCZE RAZ");// przyda³o dy siê rozpoznawanie p³ci
            else
               System.err.println("Wprowadziles  zle znaki. WPROWADZI JESZCZE RAZ");
            return 0;
        }
    }
    String weString()
    { try
    { return bufor.readLine(); }
    catch (IOException e)
    { System.err.println("Blad IO String");
        return ""; }
    }
}