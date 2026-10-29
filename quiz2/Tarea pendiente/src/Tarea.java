public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.prioridad = 2;
        this.completada = false;
    }

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        if (prioridad >= 1 && prioridad <= 3) {
            this.prioridad = prioridad;
        } else {
            this.prioridad = 2;
        }
        this.completada = false;
    }

    public String getDescripcion() { return descripcion; }
    public int getPrioridad() { return prioridad; }
    public boolean isCompletada() { return completada; }

    public void setPrioridad(int nuevaPrioridad) {
        if (nuevaPrioridad >= 1 && nuevaPrioridad <= 3) {
            this.prioridad = nuevaPrioridad;
        }
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    public void mostrarEstado() {
        String nivelPrioridad = (prioridad == 1) ? "Alta" : (prioridad == 2) ? "Media" : "Baja";
        String estado = completada ? "Completada" : "Pendiente";
        System.out.println("Tarea: " + descripcion + " Prioridad: " + nivelPrioridad + " Estado: " + estado);
    }
}
