package cuentas;
public class CCuenta {


	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * @param nom El nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }	
    
    /* @return El saldo actual de la cuenta
     * 
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**Ingresa una cantidad en la cuenta
    *
    *@param cantidad Es la cantidad a ingresar en la cuenta.
    *@throws Exception si la cantidad es negativa
    */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    

    /**Retira una cantidad de la cuenta
     * 
     * @ param cantidad a retirar de la cuenta
     * @throws Exception Si la cantidad es negativa o saldo insuficiente lanza la excepción
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** 
     * 
     * @return Obitiene el tipo de interés de la cuenta
     */
    
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés es el tipo de interés que se desea establecer
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	
	/** @return Saldo de la cuenta
	 * 
	 */
	private double getSaldo() {
		return saldo;
	}

	/**@param saldo El saldo que se establece en la cuenta
	 * 
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** @return el número de cuenta
	 * 
	 */
	private String getCuenta() {
		return cuenta;
	}

	/** @param cuenta El número de cuenta que se establece
	 * 
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	

	/** @return El nombre del titular de la cuenta
	 * 
	 */
	private String getNombre() {
		return nombre;
	}

	/** @param nombre El nombre del titular que se establece
	 * 
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
