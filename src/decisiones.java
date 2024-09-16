public class decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas actuales");
        }else{
            System.out.println("Peliculas retro");
        }

        if (incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("paso");
        }else{
            System.out.println("no disponible");
        }
    }
}
