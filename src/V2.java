import java.util.Scanner;

public class V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}
