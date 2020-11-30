/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkinwd.koulu2;

/**
 *
 * @author yaram
 */
import java.util.Scanner;

public class TehdaanJavaa {
   
    
    
    //tämä metodi tarkistaa stringin joka annettu.
    //ensiksi katotaan jos on tyhjä, silloin palautetaan False.
    public static boolean onkoNumero(String strNum) {
    if (strNum == null) {
        return false;
    }
    //tässä muutetaan stringi doubleks, ja jos ei tuu doublea tulee errori
    //ja vastaus on taas false
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        double luku1 = 0;
         double luku2 = 0;
        
        System.out.println("Tervetuloa maailman yksinkertaisimpaan laskuriin");
        System.out.println("Tämä ei osaa kuin laskea yhteen kaksi valitsemaasi numeroa");
        System.out.println("Tosin vois myös valita jakaa, kertoa tai minus laskun");
        System.out.println("**********************");
        
        
        while(true){
        System.out.println("Anna ensimmäinen luku!: ");
        String vastaus = input.nextLine();
        var palautus = onkoNumero(vastaus);
        //Jos palautus oli true, eli kyseessä oli luku, muutetaan
        //Stringi doubleksi
        if(palautus == true) {
            luku1 = Double.parseDouble(vastaus);
            break;
        }
            System.out.println("Et antanut oikeaa numeroa");
        }
        
        while(true) {
        System.out.println("Anna toinen luku!: ");
        String vastaus = input.nextLine();
        var palautus = onkoNumero(vastaus);
        if(palautus == true) {
            luku2 = Double.parseDouble(vastaus);
            break;
        }
            System.out.println("Et antanut oikeaa numeroa");
        }
        
        
        System.out.println("Miten haluaisit toimia luvun kanssa?");
        System.out.println("A:Ynnätä?");
        System.out.println("B:Minustaa?");
        System.out.println("C:Kertoa?");
        System.out.println("D:Jakaa?");
        // Seuraavassa muutetaan vahingossa saatu isokirjain pieneksi
        String metodi = input.nextLine().toLowerCase();
        
        while(true) {
            if(metodi.equals("a")) {
                double summa = luku1 + luku2;
                System.out.println("Yhteenlaskun tulos on: " + summa);
                break;
            }
            if(metodi.equals("b")) {
                double summa = luku1 - luku2;
                System.out.println("Yhteenlaskun tulos on: " + summa);
                break;
            }
            if(metodi.equals("c")) {
                double summa = luku1 * luku2;
                System.out.println("Yhteenlaskun tulos on: " + summa);
                break;
            }
            if (metodi.equals("d")) {
                double summa = luku1 / luku2;
                System.out.println("Yhteenlaskun tulos on: " + summa);
                break;
            }
        }
        
           
    }
}
