public class Coche {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double velocidadActual;
    private boolean motorEncendido;

    public Coche(String marca, String modelo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.velocidadActual = 0.0;
        this.motorEncendido = false;
    }

    public Coche(String marca, String modelo) {
        this(marca, modelo, 2026);
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAñoFabricacion() { return añoFabricacion; }
    public double getVelocidadActual() { return velocidadActual; }
    public boolean isMotorEncendido() { return motorEncendido; }

    public void encenderMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
        }
    }

    public void apagarMotor() {
        if (motorEncendido && velocidadActual == 0) {
            motorEncendido = false;
        } else {
            System.out.println("No se puede apagar pq el coche debe estar detenido");
        }
    }

    public void acelerar(double incremento) {
        if (motorEncendido && incremento > 0) {
            velocidadActual += incremento;
        }
    }

    public void frenar(double disminucion) {
        if (motorEncendido && disminucion > 0) {
            velocidadActual -= disminucion;
            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
        }
    }

    public void mostrarEstado() {
        System.out.println("Coche: " + marca + " " + modelo + " (" + añoFabricacion + ")");
        System.out.println("Motor: " + (motorEncendido ? "Encendido" : "Apagado") + " Velocidad: " + velocidadActual + " km");
    }
}
