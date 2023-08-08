public interface Transaccion {
    Cuenta login(String numeroCuenta ,String pin);
    void depositar(Double monto);
    void transferir(Double monto);
    void retirar(Double monto);
}
