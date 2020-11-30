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
    //Sillä valitoidaan että on annettu numero ja ohjelma ei kaadu vaikka annettaisiin kirjain.
    //metodia kutsutaan kummallakin kertaa sen jälkeen, kun on pyydetty käyttäjältä numeroa.
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
        
       //annetaan pääluupille nimi, että pystytään lopussa murtautumaan kerralla kahdesta loopista.
        paaluuppi: while(true) {    
       
        //muuttujat nollataan loopin sisällä, mikäli joku haluaa laskea uudestaan. 
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
        //Stringi doubleksi ja poitutaan loopista.
        if(palautus == true) {
            luku1 = Double.parseDouble(vastaus);
            break;
        }
            //tämä tulee, jos numero ei ollut numero ja looppi jatkuu.
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
        
        
       //Taas kaksi looppia, joista ulompi pitää purkaa, jos oikein.
       //Eli valitse oikea vastaus metodi, tai sinulta kysytään uudestaan.
            OUTER:
            while (true) {
                System.out.println("Miten haluaisit toimia lukujen kanssa?");
                System.out.println("A:Ynnätä?");
                System.out.println("B:Minustaa?");
                System.out.println("C:Kertoa?");
                System.out.println("D:Jakaa?");
                String metodi = input.nextLine().toLowerCase();
                //Tässä tehdään laskutoimitukset.
                switch (metodi) {
                    case "a":
                        {
                            double summa = luku1 + luku2;
                            System.out.println("Yhteenlaskun tulos on: " + summa);
                            break OUTER;
                        }
                    case "b":
                        {
                            double summa = luku1 - luku2;
                            System.out.println("Yhteenlaskun tulos on: " + summa);
                            break OUTER;
                        }
                    case "c":
                        {
                            double summa = luku1 * luku2;
                            System.out.println("Yhteenlaskun tulos on: " + summa);
                            break OUTER;
                        }
                    case "d":
                        {
                            double summa = luku1 / luku2;
                            System.out.println("Yhteenlaskun tulos on: " + summa);
                            break OUTER;
                        }
                    default:
                        break;
                }
                System.out.println("Lukusi ovat " +luku1 + " ja " +luku2);
                System.out.println("Anna oikea kirjain millä lasken ne yhteen, äsköinen ei ollut valittavissa");
            }
            //tämä on pääluuppia ja lopussa kysytään, haluatko laskea uudestaan.
            while(true) {
            System.out.println("haluaisitko laskea uudestaan?(k/e)");
            // varmistetaan taas että voidaan vastaanottaa myös isoja kirjaimia
            String lopetus = input.nextLine().toLowerCase();
            //lopettaa vain tämän kysymysloopin ja palaa pääluupin alkuun, kaikki alkaa alusta.
            if(lopetus.equals("k")) {
                break;
            }
            else if(!lopetus.equals("e") && !lopetus.equals("k")) {
                System.out.println("Käytäppäs oikeita kirjaimia");
                
            } //kahden loopin purku, pääluupin nimellä, jos haluaa lopettaa.
            else if(lopetus.equals("e")) {
                break paaluuppi;
            }
            }
            
            }
         
    }
}
