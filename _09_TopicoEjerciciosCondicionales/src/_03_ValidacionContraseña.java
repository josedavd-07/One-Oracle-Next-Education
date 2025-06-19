import java.util.Scanner;

public class _03_ValidacionContraseña {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String UserPassword = "123456";
        String UserPasswordConfirm;

        // Entrada de usuario
        System.out.print("Ingrese su contraseña: ");
        UserPasswordConfirm = inputUser.nextLine();

        inputUser.close();

        if (UserPasswordConfirm.equals(UserPassword)) {
            System.out.println(">> Acceso concedido.");
        }
        else {
            System.out.println(">> Acceso denegado. Contraseña incorrecta.");
        }

    }
}
