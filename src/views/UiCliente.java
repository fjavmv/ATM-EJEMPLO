package views;

import java.util.Scanner;

public class UiCliente extends Menu{

    @Override
    public int menuOperaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Retirar efectivo------(1)");
        System.out.println("Consulta saldo--------(2)");
        System.out.println("Imprimir saldo--------(3)");
        System.out.println("Selecciona una opción ");
        return scanner.nextInt();
    }

    @Override
    public void operaciones(int op)
    {
        switch (op){
            case 1:
                System.out.printf("Retirar efectivo");
                break;
            case 2:
                System.out.printf("Consulta saldo");
                break;
            case 3:
                System.out.printf("Imprimir saldo");
                break;
            default:
                break;
        }
    }
}
