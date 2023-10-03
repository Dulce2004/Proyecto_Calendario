import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Actividad {
    private String nombre;
    private String fecha;

    public Actividad(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Actividad: " + nombre + " Fecha: " + fecha;
    }
}