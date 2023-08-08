public class Usuario {
    private String correo;
    private String telefono;
    private String dni;
    private Cuenta cuenta;
    Usuario(Integer numeroCuenta,Integer pin,String correo ,TipoCuenta tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        this.pin=pin;
        this.correo=correo;
        this.tipoCuenta=tipoCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    public crearCuenta(String numeroCuenta,String pin,TipoCuenta tipoCuenta){
        return cuenta;
    }
}
