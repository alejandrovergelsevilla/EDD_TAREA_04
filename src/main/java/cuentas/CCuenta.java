package cuentas;

/**
 * Descripcion. Clase que contiene todos los datos necesarios para operar con una cuenta
 * @author Alejandro Vergel Sevilla
 */
public class CCuenta {
    
    //Atributos 
    
    /**
     * Nombre del titular de la cuenta, de tipo String
     */
    private String nombre;
    /**
     * Número de cuenta, de tipo String
     */
    private String cuenta;
    /**
     * Saldo que posee la cuenta, de tipo double
     */
    private double saldo;
    /**
     * Tipo de interés, de tipo double
     */
    private double tipoInterés;
    

    /**
     * Descripcion. Constructor vacío, sin inicializar valores.
     */
    public CCuenta()
    {
    }

    /**
     * Descripcion. Con este otro constructor podremos introducir todos los siguientes parámetros.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Descripcion. Método que muestra el estado de la cuenta.
     * @return el valor de getSaldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Descripcion. Método que permite ingresar dinero en la cuenta. Además,
     * controla que sea un número positivo. En caso contrario, lanza una excepción.
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Descripcion. Método que permite sacar dinero. Realiza la misma función que el método
     * anterior pero a la inversa.
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**Descripcion. Método que muestra el nombre del titular de la cuenta.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Descripcion. Método que permite establecer el nombre del titular de la cuenta.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Descripcion. Método que muestra el número de cuenta.
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Descripcion. Método que permite establecer el número de la cuenta.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Descripcion. Método que muestra el saldo de la cuenta.
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Descripcion. Método que permite establecer el saldo de la cuenta.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** 
     * Descripcion. Método que muestra el tipo de interés.
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
        
    }

    /**
     * Descripcion. Método que permite establecer el tipo de interés.
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
