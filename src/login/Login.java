package login;

import pojo.Usuarios;
import registro.RegistroUser;
import views.UiCliente;
import views.UiOperador;

import java.util.Scanner;

public class Login {

     public static void iniciars(String nUser, String passUser)
     {
         for (Usuarios us: RegistroUser.registrarUsuarios())
         {
              if (us.getNombreUsuario().equals(nUser) && us.getPassword().equals(passUser))
              {
                   Scanner scanner = new Scanner(System.in);
                   switch (us.getTipo())
                   {
                        case "Operador":
                             System.out.println("Iniciaste sesión con: %s \n" + us);
                             UiOperador uiOperador = new UiOperador();
                             uiOperador.operaciones(uiOperador.menuOperaciones());
                             break;
                        case "Cliente":
                             System.out.printf("Iniciaste sesión con: %s\n", us);
                             UiCliente uiCliente = new UiCliente();
                             uiCliente.operaciones(uiCliente.menuOperaciones());
                             break;
                        default:
                             break;
                   }
              }
          }
     }
}
