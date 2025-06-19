import java.util.Scanner;

public class _01_ParImpar {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        //miembros variables
        int num1,num2;


        //Entrada de usuario
        System.out.print("Ingrese un numero: ");
        num1 = inputUser.nextInt();

        //Salida de usuario
        if (num1 % 2 == 0) {
            System.out.printf("El numero %d es par\n", num1);
        } else {
            System.out.printf("El numero %d es impar\n", num1);
        }

        //Entrada de usuario
        System.out.print("Ingrese otro numero: ");
        num2 = inputUser.nextInt();

        //Salida de usuario
        if (num2 % 2 == 0) {
            System.out.printf("El numero %d es par\n", num2);
        } else {
            System.out.printf("El numero %d es impar\n", num2);
        }


    }
}
