import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void marcarActividadComoCompletada(int indice) {
        if (indice >= 0 && indice < actividades.size()) {
            Actividad actividad = actividades.get(indice);
            actividad.marcarComoCompletada();
            System.out.println("Actividad marcada como completada.");
        } else {
            System.out.println("Índice de actividad inválido.");
        }
    }

    public void ejecutarMenu() {

        Calendario calendario = new Calendario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar actividad");
            System.out.println("2. Mostrar actividades");
            System.out.println("3. Eliminar actividad");
            System.out.println("4. Modificar actividad");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la fecha (dd/mm/yyyy): ");
                    String fecha = scanner.next();
                    System.out.print("Ingrese la hora (hh:mm): ");
                    String hora = scanner.next();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la descripción: ");
                    String descripcion = scanner.nextLine();
                    calendario.agregarActividad(fecha, hora, descripcion);
                    break;
                case 2:
                    calendario.mostrarActividades();
                    break;
                case 3:
                    System.out.print("Ingrese el número de actividad a eliminar: ");
                    int indiceEliminar = scanner.nextInt() - 1; // Restar 1 para coincidir con el índice de la lista
                    calendario.eliminarActividad(indiceEliminar);
                    break;
                case 4:
                    System.out.print("Ingrese el número de actividad a modificar: ");
                    int indiceModificar = scanner.nextInt() - 1; // Restar 1 para coincidir con el índice de la lista
                    System.out.print("Ingrese la nueva fecha (dd/mm/yyyy): ");
                    String nuevaFecha = scanner.next();
                    System.out.print("Ingrese la nueva hora (hh:mm): ");
                    String nuevaHora = scanner.next();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la nueva descripción: ");
                    String nuevaDescripcion = scanner.nextLine();
                    calendario.modificarActividad(indiceModificar, nuevaFecha, nuevaHora, nuevaDescripcion);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
