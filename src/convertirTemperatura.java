import java.util.Scanner;

public class convertirTemperatura {
    public static void main (String[] args){
        Scanner lectura = new Scanner (System.in);//objeto de la clase escaner importada

        System.out.println("Ingrese la temperatura en Celcius a convertir: ");
        int celcius = Integer.parseInt(lectura.next());
        double farenheit = (celcius * 1.8)+32;
        int FarenheitConvertido = (int) farenheit;
        System.out.println("Los "+celcius+" grados celcius que ingreso equivalen a "+FarenheitConvertido + " grados Farenheit");

    }
}
