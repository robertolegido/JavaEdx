/* Importamos la utilidad de Scanner para poder recoger la entrada por pantalla */
import java.util.Scanner;

public class EntradaCaracteres {
    public static void main (String[] args){
        String name = ""; // Inicializamos una variable para almacenar nombre
        String apellidos= "";
        Integer edad = 0;
        Scanner input = new Scanner(System.in); // Se define una nueva variable de tipo Scanner y se inicializa
        System.out.println("Esto es una linea de bienvenida");
        System.out.println("Introduce un nombre: ");
        name = input.next(); // para adquirir la primera palabra
        //name = input.nextLine(); // para adquirir todas las palabras hasta el retorno de carro
        System.out.println("Bienvenido Mr: " + name);
        System.out.println("Introducir la edad: ");
        edad = input.nextInt();
        System.out.println("Edad : " + edad);
    }
}