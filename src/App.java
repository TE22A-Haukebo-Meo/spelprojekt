import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        String spela = "ja";
        while (spela.equalsIgnoreCase("ja")) {
            System.out.println("Tjenamors gamer!");
            Thread.sleep(2000);
            System.out.println("Välj en av följande karaktärer för att starta spelet");
            System.out.println("1. Light");
            System.out.println("2. Medium");
            System.out.println("3. Heavy");
            System.out.println("Ditt val: (siffra)");
            int karaktär = tb.nextInt();
            switch (karaktär) {
                case 1:
                    System.out.println("Du har valt karaktären light");
                    Thread.sleep(1000);
                    System.out.println("Liv = 400 hp");
                    Thread.sleep(1000);
                    System.out.println("Attack = 6/10");
                    Thread.sleep(1000);
                    System.out.println("+Perk: Större träffchans!");
                    int light_hp = 400;
                    int light_dmg = 6;
                    //dmg står för damage, skada
                    break;
                
                case 2:
                    System.out.println("Du har valt karaktären medium");
                    Thread.sleep(1000);
                    System.out.println("Liv = 600 hp");
                    Thread.sleep(1000);
                    System.out.println("Attack = 7/10");
                    int medium_hp = 600;
                    int meduim_dmg = 7;
                    break;

                case 3:
                    System.out.println("Du har valt karaktären heavy");
                    Thread.sleep(1000);
                    System.out.println("Liv = 800 hp");
                    Thread.sleep(1000);
                    System.out.println("Attack = 4/10");
                    int heavy_hp = 800;
                    int heavy_dmg = 4/10;
                    break;
            
                default:
                    System.out.println("Välj karaktär 1, 2 eller 3");
                    break;
            }
            
            }
        }
            
    }
}
