import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Crear Perfil");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre de usuario: ");
                    String nombreUsuario = scanner.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contrasena = scanner.next();
                    boolean sesionIniciada = usuario.iniciarSesion(nombreUsuario, contrasena);
                    if (sesionIniciada) {
                        System.out.println("Sesión iniciada con éxito.");
                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos.");
                    }

                    while (true) {
                        System.out.println("\nMenú:");
                        System.out.println("1. Agregar actividad");
                        System.out.println("2. Mostrar actividades");
                        System.out.println("3. Modificar actividad");
                        System.out.println("4. Eliminar actividad");
                        System.out.println("5. Salir");
                        System.out.print("Selecciona una opción: ");
                        int opcion2 = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea

                        switch (opcion2) {
                            case 1:
                                System.out.print("Nombre de la actividad: ");
                                String nombre = scanner.nextLine();
                                System.out.print("Fecha de la actividad: ");
                                String fecha = scanner.nextLine();
                                calendario.agregarActividad(nombre, fecha);
                                break;
                            case 2:
                                System.out.println("Actividades:");
                                calendario.mostrarActividades();
                                break;
                            case 3:
                                System.out.print("Nombre de la actividad a modificar: ");
                                String nombreViejo = scanner.nextLine();
                                System.out.print("Nueva fecha: ");
                                String nuevaFecha = scanner.nextLine();
                                calendario.modificarActividad(nombreViejo, nuevaFecha);
                                break;
                            case 4:
                                System.out.print("Nombre de la actividad a eliminar: ");
                                String nombreEliminar = scanner.nextLine();
                                calendario.eliminarActividad(nombreEliminar);
                                break;
                            case 5:
                                System.out.println("Saliendo del programa.");
                                System.exit(0);
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }

                    break;
                case 2:
                    System.out.print("Ingrese su nombre de usuario: ");
                    nombreUsuario = scanner.next();
                    System.out.print("Ingrese su contraseña: ");
                    contrasena = scanner.next();
                    usuario.crearPerfil(nombreUsuario, contrasena);
                    System.out.println("Perfil creado con éxito.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
