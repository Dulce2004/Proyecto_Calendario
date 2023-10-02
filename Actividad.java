public class Actividad {
    private String nombre;
    private String descripcion;
    private String diaSemana;

    // Constructor
    public Actividad(String nombre, String descripcion, String diaSemana) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.diaSemana = diaSemana;
    }

    // Getter para el nombre de la actividad
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre de la actividad
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la descripción de la actividad
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para la descripción de la actividad
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para el día de la semana
    public String getDiaSemana() {
        return diaSemana;
    }

    // Setter para el día de la semana
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    // Puedes agregar otros métodos relacionados con la actividad si es necesario
}
