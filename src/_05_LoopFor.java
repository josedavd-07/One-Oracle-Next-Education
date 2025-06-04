import java.util.Scanner;

public class _05_LoopFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sumaNotas = 0;

        // Repetimos el proceso 3 veces
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa una nota para la película Matrix: ");
            double nota = entrada.nextDouble();
            sumaNotas += nota;  // Acumular las notas
        }

        double promedio = sumaNotas / 3;
        System.out.println("Promedio de notas: " + promedio);
    }

}
