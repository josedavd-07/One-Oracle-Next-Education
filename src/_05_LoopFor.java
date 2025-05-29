import java.util.Scanner;

public class _05_LoopFor {

    public static void main(String[] args) {

        // Get input from the user using the Scanner class in Java
        Scanner inputUser = new Scanner(System.in);

        //members variables
        double points = 0;
        double mediaEvaluaciones = 0;

        //For crate a loop that will run 3 times , repeating the proces three times
        for (int i = 0; i < 3; i++) {

            System.out.print("Por favor escribe la nota que le darias a al pelicula Matrix: ");
            points = inputUser.nextDouble();

            // Calculate the average of the evaluations and  watch the movie whit media evaluations
//            mediaEvaluaciones = mediaEvaluaciones + points;
            mediaEvaluaciones += points;

            //Show the user the average of the evaluations

        }
        System.out.println("La media de  las evaluacionde al pelicula Matrix es: " + mediaEvaluaciones/3);


    }

}
