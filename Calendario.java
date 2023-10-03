import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Actividad> actividades = new ArrayList<>();

    public void agregarActividad(String nombre, String fecha) {
        Actividad actividad = new Actividad(nombre, fecha);
        actividades.add(actividad);
    }

    public void mostrarActividades() {
        for (Actividad actividad : actividades) {
            System.out.println(actividad);
        }
    }

    public void modificarActividad(String nombreViejo, String nuevaFecha) {
        for (Actividad actividad : actividades) {
            if (actividad.getNombre().equals(nombreViejo)) {
                actividad.setFecha(nuevaFecha);
                System.out.println("Actividad modificada.");
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }

    public void eliminarActividad(String nombre) {
        for (Actividad actividad : actividades) {
            if (actividad.getNombre().equals(nombre)) {
                actividades.remove(actividad);
                System.out.println("Actividad eliminada.");
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }
}