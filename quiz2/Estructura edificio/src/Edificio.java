import java.util.ArrayList;
import java.util.List;

class Apartamento {
    private int numero;
    private int numeroHabitaciones;

    public Apartamento(int numero, int numeroHabitaciones) {
        this.numero = numero;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumero() { return numero; }
    public int getNumeroHabitaciones() { return numeroHabitaciones; }
}

public class Edificio {
    private String direccion;
    private List<Apartamento> apartamentos;
    private int limiteApartamentos;

    public Edificio(String direccion, int limiteApartamentos) {
        this.direccion = direccion;
        this.limiteApartamentos = limiteApartamentos;
        this.apartamentos = new ArrayList<>();
    }

    public void crearYAñadirApartamento(int numero, int numeroHabitaciones) {
        if (apartamentos.size() < limiteApartamentos) {
            Apartamento nuevoApto = new Apartamento(numero, numeroHabitaciones);
            apartamentos.add(nuevoApto);
            System.out.println("Apartamento " + numero + " añadido al edificio");
        } else {
            System.out.println("Ya se alcanzó el límite de apartamentos");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Edificio ubicado en: " + direccion);
        System.out.println("Total de apartamentos: " + apartamentos.size() + "/" + limiteApartamentos);
        for (Apartamento apto : apartamentos) {
            System.out.println(" - Apto #" + apto.getNumero() + " (" + apto.getNumeroHabitaciones() + " habs)");
        }
    }

    public Apartamento encontrarApartamento(int numero) {
        for (Apartamento apto : apartamentos) {
            if (apto.getNumero() == numero) {
                return apto;
            }
        }
        return null;
    }
}
