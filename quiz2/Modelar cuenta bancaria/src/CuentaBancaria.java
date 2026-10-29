public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public String getNombreTitular() { return nombreTitular; }
    public double getSaldo() { return saldo; }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Monto inválido o saldo insuficiente");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Cuenta: " + numeroCuenta + " Titular: " + nombreTitular + " Saldo: $" + saldo);
    }
}
