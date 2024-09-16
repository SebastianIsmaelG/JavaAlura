import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula");
        String pelicula = teclado.nextLine();
        System.out.println("Ingrese la fecha de lanzamiento");
        int fecha = teclado.nextInt();
        System.out.println("Ingrese nota de la pelicula");
        double nota = teclado.nextDouble();


    }
}
