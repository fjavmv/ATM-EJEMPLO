package views;

import java.util.Scanner;

public class UiOperador extends Menu{
    @Override
    public int menuOperaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cargar efectivo------(1)");
        System.out.println("Ejecutar corte del día--------(2)");
        System.out.println("Configurar denominaciones--------(3)");
        System.out.println("Selecciona una opción ");
        return scanner.nextInt();
    }
    @Override
    public void operaciones(int op)
    {
        switch (op){
            case 1:
                System.out.printf("Cargar efectivo");
                break;
            case 2:
                System.out.printf("Ejecutar corte del día");
                break;
            case 3:
                System.out.printf("Configurar denominaciones");
                break;
            default:
                break;
        }
    }
}
