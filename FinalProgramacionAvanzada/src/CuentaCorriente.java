public class CuentaCorriente extends Cuenta{
    private Integer numeroCuenta;
    private TipoCuenta tipoCuenta;
    private Integer pin;
    private Double saldo;
    private Usuario usuario;
    CuentaCorriente(Integer numeroCuenta,TipoCuenta tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        this.tipoCuenta=TipoCuenta;
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
}
