package registro;

import pojo.Cliente;
import pojo.Operador;
import pojo.Usuarios;

import java.util.ArrayList;

public class RegistroUser {

    public static ArrayList<Usuarios> registrarUsuarios()
    {
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        usuarios.add(new Operador("Maria","1222"));
        usuarios.add(new Cliente("Jose","1223"));
        usuarios.add(new Cliente("Antonio","1227"));
        usuarios.add(new Cliente("Perla","12229"));

        return usuarios;
    }

}
