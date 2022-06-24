package pojo;

public class Usuarios {
    private String tipo;
    private String correo;
    private String password;
    private String nombreUsuario;


    public Usuarios(){
    }

    public Usuarios (String tipo){
        this.tipo = tipo;
    }

    public Usuarios(String nombreUsuario, String password) {
        this.password = password;
        this.nombreUsuario = nombreUsuario;
    }

    public Usuarios(String nombreUsuario, String password, String tipo) {
        this(nombreUsuario,password);
        this.tipo = tipo;
    }

    public Usuarios(String nombreUsuario, String password, String tipo,String correo) {
        this(password,nombreUsuario,tipo);
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return  "NOMBRE DE USUARIO: " + nombreUsuario+ "\n"+ "CONTRASEÑA: " + password + "\n" + "TIPO: "+ tipo;
    }
}
