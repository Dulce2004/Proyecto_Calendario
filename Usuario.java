public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    // Constructor
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Getter para el nombre de usuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Setter para el nombre de usuario
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Getter para la contraseña
    public String getContrasena() {
        return contrasena;
    }

    // Setter para la contraseña
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método para verificar la contraseña
    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    // Puedes agregar otros métodos relacionados con el usuario si es necesario
}
