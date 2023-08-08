public class CajaAhorro extends Cuenta{
    private Integer numeroCuenta;
    private TipoCuenta tipoCuenta;
    private Integer pin;
    private Double saldo;
    private Usuario usuario;
    CajaAhorro(Integer numeroCuenta,TipoCuenta tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        this.tipoCuenta=tipoCuenta;
    }

    @Override
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    @Override
    public Integer getPin() {
        return pin;
    }

    @Override
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public Cuenta login(String numeroCuenta, String pin) {
        return null;
    }

    @Override
    public void depositar(Double monto) {

    }

    @Override
    public void transferir(Double monto) {

    }

    @Override
    public void retirar(Double monto) {

    }
}
