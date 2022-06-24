package pojo;

import javax.swing.*;

public class Operador extends Usuarios {

    public Operador()
    {
        super();
    }

    public Operador(String nombreUsuario, String password) {
        super(nombreUsuario, password,"Operador");
    }

    public Operador(String nombreUsuario, String password, String tipo) {
        super(nombreUsuario, password, tipo);
    }

    public Operador(String nombreUsuario, String password, String tipo, String correo) {
        super(nombreUsuario, password, tipo, correo);
    }
}
