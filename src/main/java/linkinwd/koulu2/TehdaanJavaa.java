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
    Double luku1;
    Double luku2;
    
    public static boolean onkoNumero(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    Double plussaus() {
        Double summa = luku1 + luku2;
        return summa;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Tervetuloa maailman yksinkertaisimpaan laskuriin");
        System.out.println("Tämä ei osaa kuin laskea yhteen kaksi valitsemaasi numeroa");
        System.out.println("Tosin vois myös valita jakaa, kertoa tai minus laskun");
        System.out.println("**********************");
        
        
        while(true){
        System.out.println("Anna ensimmäinen luku!: ");
        String vastaus = input.nextLine();
        var palautus = onkoNumero(vastaus);
            System.out.println(palautus);
        }
     /*   
        System.out.println("Anna toinen luku!: ");
        String luku2 = input.nextLine();
        
        System.out.println("Miten haluaisit toimia luvun kanssa?");
        System.out.println("A:Ynnätä?");
        System.out.println("B:Minustaa?");
        System.out.println("C:Kertoa?");
        System.out.println("D:Jakaa?");
        // Seuraavassa muutetaan vahingossa saatu isokirjain pieneksi
        String metodi = input.nextLine().toLowerCase();
        
        while(true) {
            if(metodi.equals("a")) {
                System.out.println("a");
                TehdaanJavaa YhteenLasku = new TehdaanJavaa();
                var tulos = YhteenLasku.plussaus();
                System.out.println(tulos);
                break;
            }
            if(metodi.equals("b")) {
                System.out.println("b");
            }
            if(metodi.equals("c")) {
                System.out.println("c");
            }
            if (metodi.equals("d")) {
                System.out.println("d");
            }
        }
        
          */  
    }
}
