import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println( "*******************************************************************************\n" +
                "          |                   |                  |                     |\n" +
                " _________|________________.=\"\"_;=.______________|_____________________|_______\n" +
                "|                   |  ,-\"_,=\"\"     `\"=.|                  |\n" +
                "|___________________|__\"=._o`\"-._        `\"=.______________|___________________\n" +
                "          |                `\"=._o`\"=._      _`\"=._                     |\n" +
                " _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______\n" +
                "|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |\n" +
                "|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\n" +
                "          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |\n" +
                " _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______\n" +
                "|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |\n" +
                "|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________\n" +
                "____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\n" +
                "/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_\n" +
                "____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\n" +
                "/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\n" +
                "____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____\n" +
                "/______/______/______/______/______/______/______/______/______/______/___/____\n" +
                "*******************************************************************************");
        System.out.println("Welcome tu Treasure Island!, Your mission is finding the treasur obs!");

        while(true){
            System.out.println("You're at a cross road. Where do you want to go? (Left or right)");
            String choice1 = scan.nextLine();
            choice1 =choice1.toLowerCase();
            switch (choice1){
                default:System.out.println("YOU DIED,somehow...");
                System.exit(0);
                case "right":System.out.println("Fall into a hole, GAME OVER!");
                    System.exit(0);
                case "left":System.out.println("'You\\'ve come to a lake. There is an island in the middle of the lake.Will you 'swim' or 'wait' for a boat?");
                String choice2=scan.nextLine();
                    choice2=choice2.toLowerCase();
                    switch (choice2){
                        default:System.out.println("YOU DIED,somehow...");
                        System.exit(0);
                        case "swim":System.out.println("You get attacked by an angry trout. Game Over.");
                        System.exit(0);
                        case "wait":System.out.println("You arrive at the island unharmed. There is a house with 3 doors. One red, one yellow and one blue. Which colour do you choose?");
                        String choice3 = scan.nextLine();
                        choice3=choice3.toLowerCase();
                        switch (choice3){
                            case "red":System.out.println("You burned,GAME OVER!");
                            System.exit(0);
                            case "blue":System.out.println("Eaten by beast,GAME OVER!");
                            System.exit(0);
                            case "yellow":System.out.print("You found the Treasure! Youuu Win!");
                            System.exit(0);
                            default:System.out.println("YOU DIED,somehow...");
                            System.exit(0);
                        }
                    }

            }

        }
    }


}
