import java.util.Scanner;

public class EjercicioCasting {
    public static void main (String[] args){
        double valor = 0;
        Scanner caca = new Scanner(System.in);
        System.out.println("Enseñame la pasta: ");
        valor = caca.nextDouble();
        System.out.println("La pasta es: " + valor);

    }
}
