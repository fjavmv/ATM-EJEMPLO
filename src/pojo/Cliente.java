package pojo;

public class Cliente extends Usuarios {

    public Cliente() {
        super();
    }
    public Cliente(String nombreUsuario, String password) {
        super(nombreUsuario, password,"Cliente");
    }

    public Cliente(String nombreUsuario, String password, String tipo) {
        super(nombreUsuario, password, tipo);
    }

    public Cliente(String nombreUsuario, String password, String tipo, String correo) {
        super(nombreUsuario, password, tipo, correo);
    }

}