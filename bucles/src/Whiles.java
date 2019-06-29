import java.util.Scanner;

public class Whiles {
    public static void main (String[] args) {
        String stopper = "play";
        Scanner input = new Scanner(System.in);
        while (stopper.startsWith("p")){
            System.out.println("chupame la minga dominga");
            stopper = input.nextLine();
        }
    }
}
