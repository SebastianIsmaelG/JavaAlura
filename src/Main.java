public class Main {
    public static void main(String[] args) {
        //System.out.println("runing");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;

        //System.out.println(media);
        String incluido;
        if (incluidoEnElPlan == true){
            incluido = "Esta pelicula esta incluida junto con la subscripcion";
        }else {
            incluido = "Esta pelicula no esta incluida junto con la subscripcion";
        }
        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en :
                """ + fechaDeLanzamiento + """ 
                \n
                """ +incluido;

        System.out.println(sinopsis);

        int clasificacion = (int)(media/ 2); //convertir media a tipo de dato int


    }
}