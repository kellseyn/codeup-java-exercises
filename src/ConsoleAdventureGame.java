import java.util.Scanner;

public class ConsoleAdventureGame {


    public static void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\nWelcome new adventurer,\nare you ready to embark?\n[Y/N]\n~~~~~~~~~~~~~~~~~~~~~~~~");
        String ready = scanner.next();
           if(ready.equalsIgnoreCase("N")){
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
               endGame();
           } else {
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\nExcellent! \nWhat be your name \noh brave one?\n~~~~~~~~~~~~~~~~~~~~~~~~");
               String name = scanner.next();
               System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~%n%s you say? %nA fitting name for an adventurer.%n~~~~~~~~~~~~~~~~~~~~~~~~%n", name);
               System.out.printf("Well %s, %nwe're on the hunt for a river monster! %nHave ye ever seen one before?%n[Y/N]%n~~~~~~~~~~~~~~~~~~~~~~~~%n",name);
               String knowledge = scanner.next();
                    if (knowledge.equalsIgnoreCase("N")){
                        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~%nI guess you can't come along after all%n~~~~~~~~~~~~~~~~~~~~~~~~%n");
                        endGame();
                    } else {
                        firstQuest();
                    }


           }
    }

    public static void firstQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~%nYassss, finally someone who has experience with the foul beast %nAll of our previous attempts were cut short due to arrows... %nwatch your knees...%n~~~~~~~~~~~~~~~~~~~~~~~~%n");
        System.out.printf("You venture forth?%n~~~~~~~~~~~~~~~~~~~~~~~~%n");
        System.out.printf("All of a sudden there's a bandit! %nHe's startled the whole crew %nWhat are you going to do? %n[FIGHT, FLEE]%n");
            String firstFight = scanner.next();
            if (firstFight.equalsIgnoreCase("flee")){
                System.out.println("Whatawimp!");
                endGame();
            } else {
                banditStats();
                yourStats();
                System.out.printf("What do you do next? %n[PUNCH, POTION");
                    String firstHit = scanner.next();
                    if (firstHit.equalsIgnoreCase("punch")){
                        System.out.printf("The punch landed! It did 4 dmg");
                    }
            }
    }


    public static void banditStats() {
        System.out.printf("^^^^^^^^^^^^^^^^%n" +
                "^ Bandit Stats ^%n" +
                "^ HP: 11       ^%n" +
                "^ ATK: 6       ^%n" +
                "^ DEF: 3       ^%n" +
                "vvvvvvvvvvvvvvvv%n"
        );
    }
    public static void yourStats() {
        System.out.printf("^^^^^^^^^^^^^^^^%n" +
                "^ Your Stats   ^%n" +
                "^ HP: 20       ^%n" +
                "^ ATK: 4       ^%n" +
                "^ DEF: 5       ^%n" +
                "vvvvvvvvvvvvvvvv%n"
        );
    }


    public static void endGame() {
        System.out.println("Welp, the game is over");

    }

    public static void main(String[] args) {
        newGame();
    }
}
