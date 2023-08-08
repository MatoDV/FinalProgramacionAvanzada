public abstract class Cuenta extends Usuario implements Transaccion{
    private Integer numeroCuenta;
    private String tipoCuenta;
    private Integer pin;
    private Double saldo;
    private Usuario usuario;
    Cuenta(Integer numeroCuenta,TipoCuenta tipoCuenta,Integer pin,Double saldo,Usuario usuario){
        this.numeroCuenta=numeroCuenta;
        this.tipoCuenta=TipoCuenta;
        this.pin=pin;
        this.saldo=saldo;
        this.usuario=Usuario;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public Integer getPin() {
        return pin;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}