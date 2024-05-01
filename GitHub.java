import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {
        ArrayList<String> letras = new ArrayList<>(Arrays.asList("L", "E", "A", "N", "D", "R", "O"));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ver cadena");
            System.out.println("2. Mover letra");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                for (String letra : letras) {
                    System.out.print(letra);
                }
                System.out.println();
            } else if (opcion == 2) {
                System.out.print("Introduce la posición de la letra a mover: ");
                int posicion1 = scanner.nextInt();
                System.out.print("Introduce la nueva posición: ");
                int posicion2 = scanner.nextInt();

                if (posicion1 < 0 || posicion1 >= letras.size() || posicion2 < 0 || posicion2 >= letras.size()) {
                    System.out.println("Posiciones no válidas.");
                } else {
                    String letra = letras.remove(posicion1);
                    letras.add(posicion2, letra);
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}

