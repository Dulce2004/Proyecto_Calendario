import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Actividad> actividades;

    public Calendario() {
        actividades = new ArrayList<>();
    }

    public void agregarActividad(String fecha, String hora, String descripcion) {
        Actividad actividad = new Actividad(fecha, hora, descripcion);
        actividades.add(actividad);
    }

    public void mostrarActividades() {
        System.out.println("Actividades en el calendario:");
        for (int i = 0; i < actividades.size(); i++) {
            System.out.println((i + 1) + ". " + actividades.get(i));
        }
    }

    public void eliminarActividad(int indice) {
        if (indice >= 0 && indice < actividades.size()) {
            actividades.remove(indice);
            System.out.println("Actividad eliminada correctamente.");
        } else {
            System.out.println("Índice de actividad inválido.");
        }
    }

    public void modificarActividad(int indice, String nuevaFecha, String nuevaHora, String nuevaDescripcion) {
        if (indice >= 0 && indice < actividades.size()) {
            Actividad actividad = actividades.get(indice);
            actividad.setFecha(nuevaFecha);
            actividad.setHora(nuevaHora);
            actividad.setDescripcion(nuevaDescripcion);
            System.out.println("Actividad modificada correctamente.");
        } else {
            System.out.println("Índice de actividad inválido.");
        }
    }

}