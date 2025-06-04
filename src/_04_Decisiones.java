public class _04_Decisiones {

    public static void main(String[] args) {

        final int FECHA_DE_LANZAMIENTO = 1999;
        boolean incluidoEnELPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        // 🟦 Condicional simple con operador relacional
        if (FECHA_DE_LANZAMIENTO >= 2023) {
            System.out.println("Película del año");
        } else {
            System.out.println("Película retro que aún vale la pena ver");
        }

        // 🟩 Operadores lógicos - OR (||)
        // Basta con que UNA condición sea verdadera para que se ejecute el bloque
        if (incluidoEnELPlan || tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su contenido plus");
        } else {
            System.out.println("No puede disfrutar de este contenido, por favor actualice su plan");
        }

        // 🟥 Operadores lógicos - AND (&&)
        // AMBAS condiciones deben ser verdaderas
        if (incluidoEnELPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su contenido plus");
        } else {
            System.out.println("No puede disfrutar de este contenido, por favor actualice su plan");
        }
    }
}
