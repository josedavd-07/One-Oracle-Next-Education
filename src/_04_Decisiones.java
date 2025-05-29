public class _04_Decisiones {

    public static void main(String[] args) {

        final int FECHA_DE_LANZAMIENTO = 1999;
        boolean incluidoEnELPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //Operadores relacionales
        if (FECHA_DE_LANZAMIENTO >= 2023) {
            System.out.println("Pelicula del año");
        }
        else{
            System.out.println("Pelicula retro que aun vale la pena ver");
        }


        //Operadores Logicos - operator OR - una almenos verdadera o las dos verdaras y su valor sera true
        if (incluidoEnELPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute de su contenido plus");
        }
        else {
            System.out.println("No puede disfrutar de este contenido, por favor actulize su plan");
        }


        //Operadores Logicos - operator AND -  todas deos deben ser vrrdaderas o sino su valor en false
        if (incluidoEnELPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su contenido plus");
        }
        else {
            System.out.println("No puede disfrutar de este contenido, por favor actulize su plan");
        }

    }
}
