import java.util.Scanner;

public class _06_LoopWhile {

    public static void main(String[] args) {

        // Get input from the user using the Scanner class in Java
        Scanner inputUser = new Scanner(System.in);

        //members variables
        double points = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        //While crate a loop that will run 3 times , repeating the proces three times
        while (points != -1) {

            System.out.print("Por favor escribe la nota que le darias a al pelicula Matrix: ");
            points = inputUser.nextDouble();

            if (points != -1) {
                mediaEvaluaciones += points;
                totalEvaluaciones++;
            }
        }
        //Show the user the average of the evaluations
        System.out.println("La media de  las evaluacionesde la  pelicula Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}
