import java.util.Scanner;

public class _06_LoopWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sumaNotas = 0;
        int contador = 0;
        double nota = 0;

        System.out.println("Ingresa notas para la película Matrix. Escribe -1 para terminar.");

        while (nota != -1) {
            System.out.print("Nota: ");
            nota = entrada.nextDouble();

            if (nota != -1) {
                sumaNotas += nota;
                contador++;
            }
        }

        if (contador > 0) {
            double promedio = sumaNotas / contador;
            System.out.println("Promedio de notas: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
