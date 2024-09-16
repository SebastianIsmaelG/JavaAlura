import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Nota de la pelicula 1");
            nota = teclado.nextDouble();

            mediaEvaluaciones = mediaEvaluaciones+nota;

        }

        System.out.println("La media de evaluaciones de la pelicula es "+mediaEvaluaciones/3);


    }
}
