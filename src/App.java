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
            boolean loop1 = true;
            while (loop1) {          
                switch (karaktär) {
                    case 1:
                        System.out.println("Du har valt karaktären light");
                        Thread.sleep(1000);
                        System.out.println("Liv = 400 hp");
                        Thread.sleep(1000);
                        System.out.println("Attack = 6/10");
                        Thread.sleep(1000);
                        System.out.println("+Perk: Större träffchans!");
                        loop1 = false;
                        break;
                    
                    case 2:
                        System.out.println("Du har valt karaktären medium");
                        Thread.sleep(1000);
                        System.out.println("Liv = 600 hp");
                        Thread.sleep(1000);
                        System.out.println("Attack = 7/10");
                        loop1 = false;
                        break;

                    case 3:
                        System.out.println("Du har valt karaktären heavy");
                        Thread.sleep(1000);
                        System.out.println("Liv = 800 hp");
                        Thread.sleep(1000);
                        System.out.println("Attack = 4/10");
                        loop1 = false;
                        break;
                
                    default:
                        System.out.println("Välj karaktär 1, 2 eller 3");
                        karaktär = tb.nextInt();
                        break;
                }
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
            boolean svärd = false;
            boolean spjut = false;
            boolean loop2 = true;
            while (loop2) {
                switch (vapen) {
                    case 1:
                        System.out.println("Du valde Svärdet");
                        Thread.sleep(1000);
                        System.out.println("Attack: +1");
                        Thread.sleep(1000);
                        System.out.println("Träffchans: +1");
                        svärd = true;
                        spjut = false;
                        loop2 = false;
                        break;

                    case 2:
                        System.out.println("Du valde Spjutet");
                        Thread.sleep(1000);
                        System.out.println("Attack: +3");
                        Thread.sleep(1000);
                        System.out.println("Träffchans: -1");
                        spjut = true;
                        svärd = false;
                        loop2 = false;
                        break;
                
                    default:
                        System.out.println("Välj vapen 1 eller 2");
                        vapen = tb.nextInt();
                        break;
        
                }   
            }
            System.out.println("Bra jobbat! Du har nu byggt din karaktär! Såhär blev den:");
            Thread.sleep(1500);
            if (karaktär == 1 && (svärd ==true)) {
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
            else if (karaktär == 1 && (spjut == true)){
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
            else if (karaktär == 2 && (svärd==true)){
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
            else if (karaktär == 2 && (spjut==true)){
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
            else if (karaktär == 3 && (svärd==true)){
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
            else if (karaktär == 3 && (spjut==true)) {
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
            Thread.sleep(200);
            System.out.println("2");
            Thread.sleep(200);
            System.out.println("1");
            Thread.sleep(200);
            System.out.println("--------------------");
            System.out.println("------FIGHTING------");
            System.out.println("--------------------");

            System.out.println("Du har första draget. Vilken attack vill du välja?");
            Thread.sleep(1000);
            tb.nextLine();

            while (player_hp >0 && minion_hp >0) {
                System.out.println("Quick Attack");
                System.out.println("Heavy attack");
                String attack = tb.nextLine();
                if (karaktär == 1 && (svärd ==true)) {
                    if (attack.equalsIgnoreCase("Quick") || attack.equalsIgnoreCase("quick attack")) {
                        minion_hp = minion_hp-quick_light_sword();
                        Thread.sleep(1000);
                    }
                    else if (attack.equalsIgnoreCase("Heavy") || attack.equalsIgnoreCase("heavy attack")) {
                        minion_hp = minion_hp-heavy_light_sword();
                        Thread.sleep(1000);
                    }
                    else{
                        System.out.println("Skriv quick eller heavy.");
                        attack = tb.nextLine();
                    }
                }
                else if (karaktär == 1 && (spjut==true)){
                    if (attack.equalsIgnoreCase("Quick") || attack.equalsIgnoreCase("quick attack")) {
                        minion_hp = minion_hp-quick_light_spear();
                        Thread.sleep(1000);
                    }
                    else if (attack.equalsIgnoreCase("Heavy") || attack.equalsIgnoreCase("heavy attack")) {
                        minion_hp = minion_hp-heavy_light_spear();
                        Thread.sleep(1000);
                    }
                    else{
                        System.out.println("Skriv quick eller heavy.");
                        attack = tb.nextLine();
                    }
                }
                else if (karaktär == 2 && (svärd==true)){
                    if (attack.equalsIgnoreCase("Quick") || attack.equalsIgnoreCase("quick attack")) {
                        minion_hp = minion_hp-quick_medium_sword();
                        Thread.sleep(1000);
                    }
                    else if (attack.equalsIgnoreCase("Heavy") || attack.equalsIgnoreCase("heavy attack")) {
                        minion_hp = minion_hp-heavy_medium_sword();
                        Thread.sleep(1000);
                    }
                    else{
                        System.out.println("Skriv quick eller heavy.");
                        attack = tb.nextLine();
                    }
                }
                else if (karaktär == 2 && (spjut==true)) {
                    if (attack.equalsIgnoreCase("Quick") || attack.equalsIgnoreCase("quick attack")) {
                        minion_hp = minion_hp-quick_medium_spear();
                        Thread.sleep(1000);
                    }
                    else if (attack.equalsIgnoreCase("Heavy") || attack.equalsIgnoreCase("heavy attack")) {
                        minion_hp = minion_hp-heavy_medium_spear();
                        Thread.sleep(1000);
                    }
                    else{
                        System.out.println("Skriv quick eller heavy.");
                        attack = tb.nextLine();
                    }
                }
                else if (karaktär == 3 && (svärd==true)) {
                    if (attack.equalsIgnoreCase("Quick") || attack.equalsIgnoreCase("quick attack")) {
                        minion_hp = minion_hp-quick_heavy_sword();
                        Thread.sleep(1000);
                    }
                    else if (attack.equalsIgnoreCase("Heavy") || attack.equalsIgnoreCase("heavy attack")) {
                        minion_hp = minion_hp-heavy_haevy_sword();
                        Thread.sleep(1000);
                    }
                    else{
                        System.out.println("Skriv quick eller heavy.");
                        attack = tb.nextLine();
                    }
                }
                else if (karaktär == 3 && (spjut==true)) {
                    if (attack.equalsIgnoreCase("Quick") || attack.equalsIgnoreCase("quick attack")) {
                        minion_hp = minion_hp-quick_heavy_spear();
                        Thread.sleep(1000);
                    }
                    else if (attack.equalsIgnoreCase("Heavy") || attack.equalsIgnoreCase("heavy attack")) {
                        minion_hp = minion_hp-heavy_heavy_spear();
                        Thread.sleep(1000);
                    }
                    else{
                        System.out.println("Skriv quick eller heavy.");
                        attack = tb.nextLine();
                    }
                }
                if (minion_hp > 0 && (player_hp > 0)) {
                    player_hp=player_hp-minion_attack();
                    System.out.println("Minions hp är nu "+minion_hp);
                    Thread.sleep(1000);
                    System.out.println("Ditt hp är nu "+player_hp);
                    Thread.sleep(1000);
                    System.out.println("Din tur.");
                    Thread.sleep(1000);
                }
                else if (minion_hp <=0) {
                    System.out.println("Minions hp är nu 0");
                    Thread.sleep(1000);
                    System.out.println("Ditt hp är nu "+player_hp);
                    Thread.sleep(1000);
                }
                else{
                    System.out.println("Minions hp är nu "+minion_hp);
                    Thread.sleep(1000);
                    System.out.println("Ditt hp är nu 0");
                    Thread.sleep(1000);
                }
            }
            if (minion_hp <= 0) {
                System.out.println("Du vann! Bra jobbat!");
            }
            else if (player_hp <= 0) {
                System.out.println("Du förlorade... ");
            }
            System.out.println("Vill du fortsätta spela? Ja/Nej");
            spela = tb.nextLine();
        }
    }
    static int quick_light_sword(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 7;
        if (rand_hit >= 1 && (rand_hit <=7)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
        
    }
    static int heavy_light_sword(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 7;
        if (rand_hit >= 1 && (rand_hit <=6)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 7) {
            int dmg = attack*8;
            System.out.println("Du gjorde en critical hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int quick_light_spear(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 9;
        if (rand_hit >= 1 && (rand_hit <=6)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int heavy_light_spear(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 9;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*7;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 6) {
            int dmg = attack*9;
            System.out.println("Du gjorde en critical hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int quick_medium_sword(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 8;
        if (rand_hit >= 1 && (rand_hit <=6)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int heavy_medium_sword(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 7;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*7;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 6) {
            int dmg = attack *9;
            System.out.println("Du gjorde en critical hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int quick_medium_spear(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 10;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int heavy_medium_spear(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 10;
        if (rand_hit >= 1 && (rand_hit <=4)) {
            int dmg = attack*7;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 5) {
            int dmg = attack*9;
            System.out.println("Du gjorde en criticla hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int quick_heavy_sword(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 5;
        if (rand_hit >= 1 && (rand_hit <=6)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int heavy_haevy_sword(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 10;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*7;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 6) {
            int dmg = attack*9;
            System.out.println("Du gjorde en critical hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int quick_heavy_spear(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 7;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*5;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int heavy_heavy_spear(){
        Random spelare_rand = new Random();
        int rand_hit = spelare_rand.nextInt(10);
        int attack = 10;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*7;
            System.out.println("Du träffade! attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 6) {
            int dmg = attack*9;
            System.out.println("Du gjorde en critical hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("DU missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
    static int minion_attack() {
        Random minion_rand = new Random();
        int rand_hit = minion_rand.nextInt(10);
        int attack = 6;
        if (rand_hit >= 1 && (rand_hit <=5)) {
            int dmg = attack*6;
            System.out.println("MINION träffade! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else if (rand_hit == 6) {
            int dmg = attack*9;
            System.out.println("MINION gjorde en critical hit! Attacken gjorde "+dmg+" skada!");
            return dmg;
        }
        else{
            System.out.println("Minion missade. Attacken gjorde 0 skada.");
            return 0;
        }
    }
}
