import login.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de usuario: ");
        String userName = scanner.next();
        System.out.println("Contraseña: ");
        String passUser = scanner.next();
        Login.iniciars(userName,passUser);
    }
}