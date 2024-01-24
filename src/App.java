import java.util.Random;
import java.util.Scanner;

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
            Random rand = new Random();
            switch (karaktär) {
                case 1:
                    System.out.println("Du har valt karaktären light");
                    Thread.sleep(1000);
                    System.out.println("Liv = 400 hp");
                    Thread.sleep(1000);
                    System.out.println("Attack = 6/10");
                    Thread.sleep(1000);
                    System.out.println("+Perk: Större träffchans!");
                    break;
                
                case 2:
                    System.out.println("Du har valt karaktären medium");
                    Thread.sleep(1000);
                    System.out.println("Liv = 600 hp");
                    Thread.sleep(1000);
                    System.out.println("Attack = 7/10");
                    break;

                case 3:
                    System.out.println("Du har valt karaktären heavy");
                    Thread.sleep(1000);
                    System.out.println("Liv = 800 hp");
                    Thread.sleep(1000);
                    System.out.println("Attack = 4/10");
                    break;
            
                default:
                    System.out.println("Välj karaktär 1, 2 eller 3");
                    break;
            }
            int player_dmg = 5;
            //dmg står för damage, skada
            int player_hp = 500;
            Thread.sleep(1500);
            System.out.println("Karaktären du har valt måste såklart få ett vapen också!");
            Thread.sleep(1000);
            System.out.println("Vapen du kan välja mellan är:");
            Thread.sleep(1000);
            System.out.println("1. Svärd");
            System.out.println("2. Spjut");
            System.out.println("Ditt val");
            int vapen = tb.nextInt();
            switch (vapen) {
                case 1:
                    System.out.println("Du valde Svärdet");
                    Thread.sleep(1000);
                    System.out.println("Attack: +1");
                    Thread.sleep(1000);
                    System.out.println("Träffchans: +1");
                    break;

                case 2:
                    System.out.println("Du valde Spjutet");
                    Thread.sleep(1000);
                    System.out.println("Attack: +3");
                    Thread.sleep(1000);
                    System.out.println("Träffchans: -1");
            
                default:
                    System.out.println("Välj vapen 1 eller 2");
                    break;
            }
            System.out.println("Bra jobbat! Du har nu byggt din karaktär! Såhär blev den:");
            Thread.sleep(1500);
            if (karaktär == 1 && (vapen == 1)) {
                System.out.println("Light Swordsman");
                Thread.sleep(1000);
                System.out.println("Liv = 400 hp");
                Thread.sleep(1000);
                System.out.println("Attack: 7/10");
                Thread.sleep(1000);
                System.out.println("Träffchans: 8/10");
                player_dmg = 400;
                player_hp = 400;
            }
            else if (karaktär == 1 && (vapen == 2)){
                System.out.println("Light Spearman");
                Thread.sleep(1000);
                System.out.println("Liv: 400 hp");
                Thread.sleep(1000);
                System.out.println("Attack: 9/10");
                Thread.sleep(1000);
                System.out.println("Träffchans: 6/10");
                player_dmg=9;
                player_hp=400;
            }
            else if (karaktär == 2 && (vapen == 1)){
                System.out.println("Medium Swordsman");
                Thread.sleep(1000);
                System.out.println("Liv: 600 hp");
                Thread.sleep(1000);
                System.out.println("Attack: 8/10");
                Thread.sleep(1000);
                System.out.println("Träffchans: 6/10");
                player_dmg =8;
                player_hp=600;
            }
            else if (karaktär == 2 && (vapen == 2)){
                System.out.println("Medium Spearman");
                Thread.sleep(1000);
                System.out.println("Liv: 600 hp");
                Thread.sleep(1000);
                System.out.println("Attack: 10/10");
                Thread.sleep(1000);
                System.out.println("Träffchans: 4/10");
                player_dmg =10;
                player_hp=600;
            }
            else if (karaktär == 3 && (vapen == 1)){
                System.out.println("Heavy Swordsman");
                Thread.sleep(1000);
                System.out.println("Liv: 800 hp");
                Thread.sleep(1000);
                System.out.println("Attack: 5/10");
                Thread.sleep(1000);
                System.out.println("Träffchans: 6/10");
                player_dmg =5;
                player_hp=800;
            }
            else{
                System.out.println("Heavy Spearman");
                Thread.sleep(1000);
                System.out.println("Liv: 800 hp");
                Thread.sleep(1000);
                System.out.println("Attack: 7/10");
                Thread.sleep(1000);
                System.out.println("Träffchans: 4/10");
                player_dmg =7;
                player_hp=800;
            }
            Thread.sleep(3000);
            System.out.println("Nu är det dags att presentera din motståndare!");
            Thread.sleep(1000);
            System.out.println("MINION");
            Thread.sleep(1000);
            System.out.println("Liv: 600 hp");
            Thread.sleep(1000);
            System.out.println("Attack: 6/10");
            Thread.sleep(1000);
            System.out.println("Träffchans: 5/10");
            int minion_hp=600;
            int minion_dmg=6;
            System.out.println("ARE YA READY KIDS!!!");
            Thread.sleep(1000);
            System.out.println("3");
            Thread.sleep(100);
            System.out.println("2");
            Thread.sleep(100);
            System.out.println("1");
            Thread.sleep(100);
            System.out.println("--------------------");
            System.out.println("------FIGHTING------");
            System.out.println("--------------------");


            System.out.println("Vill du fortsätta spela? Ja/Nej");
            spela = tb.nextLine();
        }
            
    }
}
