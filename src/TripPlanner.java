import javafx.css.StyleableStringProperty;
import sun.nio.ch.sctp.SctpNet;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class TripPlanner {
    public static void main (String[] args) {
        greeting();
        travelTimeAndBudget();
        timeDifference();
        cityArea();
    }
    public static void greeting () {
        /* Variable definition */
        String name = "";
        String city = "";
        Scanner input = new Scanner(System.in);
        /* Welcome message and user data acquisition */
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        city = input.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");
        System.out.println("********");
        System.out.println("");
    }
    public static void travelTimeAndBudget () {
        /* Variable definition */
        int duration = 0;
        int hours = 0;
        int minutes = 0;
        int money = 0;
        double moneyDay = 0;
        String concurrency = "";
        double rate = 1;
        double rateConverted = 1;
        double rateConvertedDay = 1;
        /* Acquire travel info */
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        duration = input.nextInt();
        System.out.print("What is their total budget for the trip in USD? ");
        money = input.nextInt();
        System.out.print("What is the currency symbol for their destination? For example, the us dollar’s is USD, the "
                + "euro’s is EU etc… ");
        concurrency = input.next();
        System.out.print("How many " + concurrency + " are there in 1 USD? ");
        rate = input.nextDouble();
        System.out.println("");
        /* Calculate data */
        hours = duration * 24;
        minutes = hours * 60;
        System.out.println("If your are traveling for " + duration + " days, that is the same as " + hours +
                " hours or " + minutes + " minutes");
        double moneyD = money;
        double durationD = duration;
        moneyDay = moneyD / durationD;
        System.out.println("If your are going to spend $" + money + " USD, that means per day you can spend up to $"
                + moneyDay + " USD");
        rateConverted = money * rate;
        rateConvertedDay = rateConverted / duration;
        System.out.println("Your total budget in " + concurrency + " is " + rateConverted + " " + concurrency + ", " +
                "wich per day is " + rateConvertedDay + " " + concurrency);
        System.out.println("********");
        System.out.println("");
    }
    public static void timeDifference () {
        int diffHours = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the difference, in hours, between your home and your destination? ");
        diffHours = input.nextInt();
        System.out.println("The difference is " + diffHours);
        System.out.println("********");
        System.out.println("");
    }
    public static void cityArea () {
        /*TBDW*/
    }
}
