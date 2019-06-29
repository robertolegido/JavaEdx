import java.util.*;

public class OddsOrEvensGame {
    public static void main (String[] args) {
        pickOddsOrEvens();
        playGame();
    }
    public static void pickOddsOrEvens () {
        String name = "";
        String gameSelector = "";
        Scanner input = new Scanner(System.in);
        int i = 0; // index
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name?: ");
        name = input.nextLine();
        System.out.print("Hi name, which do you choose? (O)dds or (E)vens?: ");
        gameSelector = input.nextLine();
        if (gameSelector.equalsIgnoreCase("O") || gameSelector.equalsIgnoreCase("Odds")) {
            System.out.println("" + name + "You have choosen Odds, the computer will be Evens");
        }
        else if (gameSelector.equalsIgnoreCase("e") || gameSelector.equalsIgnoreCase("evens")) {
            System.out.println("" + name + "have choosen Evens, the computer will be Odds");
        }
        else {
            System.out.println("Que te focken");
        }
        for (i=1; i<20; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void playGame () {
        Scanner input = new Scanner(System.in);
        int fingerGamer = 0;
        int fingerComputer = 0;
        int fingerSuma = 0;
        System.out.print("How many “fingers” do you put out?: ");
        fingerGamer = input.nextInt();
        Random rand = new Random();
        fingerComputer = rand.nextInt(6);
        System.out.println("Computer will play with " + fingerComputer + " fingers");
        fingerSuma = fingerComputer + fingerGamer;
        if (fingerSuma % 2 == 0) {
            System.out.println("Result is Even");
        }
        else {
            System.out.println("Resultado is Odds");
        }
        for (i=1; i<20; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}

