import java.util.Scanner;

public class desafioCuenta {
    public static void main(String[] args) {
        //variables
        String nombre ="Tony Stark";
        String cuenta = "Corriente";
        double saldo = 159.99;
        int seleccion;
        Scanner scan = new Scanner(System.in);
        Boolean salir = false;
        System.out.println("""
                ---------------------------------------
                Datos de cuenta
                \n Nombre Cliente:"""+ nombre+ """
                \n Tipo de cuenta:"""+ cuenta+ """
                \n Saldo Disponible:"""+ saldo+"""
                """);
        while (salir == false){
            System.out.println("""
                ---------------------------------------
                Selecione la operacion deseada
                 1- Consulta de saldo
                 2- Retirar
                 3- Depositar
                 9- Salir
                
                """);
            try {
                seleccion = scan.nextInt();
                switch (seleccion){
                    case 1:
                        System.out.println("Su saldo es: "+saldo);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a retirar: ");
                        double retiro = scan.nextDouble();
                        if (saldo<retiro){
                            System.out.println("Saldo insuficiente");
                            break;
                        }else{
                            saldo = saldo-retiro;
                            System.out.println("Su saldo actualizado es: "+saldo);
                            break;
                        }
                    case 3:
                        System.out.println("Ingrese la cantidad a depositar: ");
                        double deposito = scan.nextDouble();
                        saldo = saldo+deposito;
                        System.out.println("Su saldo actualizado es: "+saldo);
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Selecione una opcion valida");
                }
            }catch (Exception e){
                System.out.println("Error inesperado");
                //necesito que vuelva a pedir una opcion
                break;
            }
        }
    }
}
