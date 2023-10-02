import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuario {
    private String nombreUsuario;
    private String login;
    private String password;
    private ArrayList<String> historial_password;

    // Constructor
    public Usuario(String nombreUsuario, String login, Strign password,
            ArrayList<String> historial_passwors) {
        this.nombreUsuario = nombreUsuario;
        this.login = login;
        this.password = password;
        this.historial_passwors = historial_password;
    }

    // Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Strign getPassword() {
        return password;
    }

    public void setPassword(Strign password) {
        this.password = password;
    }

    public ArrayList<String> getHistorial_passwors() {
        return historial_passwors;
    }

    public void setHistorial_passwors(ArrayList<String> historial_passwors) {
        this.historial_passwors = historial_passwors;
    }

    @Override
    public String toString() {
        return "Usuario [nombreUsuario=" + nombreUsuario + ", login=" + login
                + ", password=" + password + ", historial_passwors=" + historial_passwors + "]";
    }

    public boolean modificar_password(String password, String nueva_password) {
        if (validar(password) && !historial_password.contains(nueva_password)) {
            // contraseña valida y nueva contraseña NO esta CONTENIDA en el historial
            // Admitimos el cambio de contraseña
            this.password = nueva_password;
            // Actualizamos historial
            historial_password.add(nueva_password);
            return true;
        } else
            return false;

    }

    public boolean validar(String password) {
        try {
            if (this.password.equalsIgnoreCase(password)) {
                System.out.println("las contraseñas coinciden");
                return true;
            } else {
                System.out.println("Las contraseñas no coinciden");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return false;
    }

}
