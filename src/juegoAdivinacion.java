import java.util.Random;
import java.util.Scanner;

public class juegoAdivinacion {
    public static void main(String[] args) {
        //variables
        int numeroRandom = new Random().nextInt(100);
        System.out.println(numeroRandom);
        Scanner teclado = new Scanner(System.in);
        int intentos = 3;
        while(intentos>0){
            System.out.println("adivina el numero :) ");
            int numeroUsuario = teclado.nextInt();
            if (numeroUsuario ==numeroRandom){
                System.out.println("Adivinaste :) ");
                intentos=0;
            }else{
                intentos--;
                System.out.println("Equivocado, te quedan "+intentos+" intentos");

            }
        }

    }
}
