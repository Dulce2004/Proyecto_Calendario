class Actividad {
    private String fecha;
    private String hora;
    private String descripcion;

    public Actividad(String fecha, String hora, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + hora + ", Descripción: " + descripcion;
    }
}
