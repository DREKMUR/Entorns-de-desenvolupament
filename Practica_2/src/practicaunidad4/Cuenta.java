/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad4;

/**
 * Esta es la clase principal de la practica, donde se encuentran
 * casitodas las funciones.
 *
 * @author Derek Murillo
 */
public class Cuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor para crear una nueva instancia de Cuenta con todos sus datos.
     *
     * @param nombre El nombre del titular de la cuenta.
     * @param cuenta El número de cuenta.
     * @param salario El saldo inicial.
     * @param tipoInteres El tipo de interés que se aplicará a la cuenta.
     */
    public Cuenta (String nombre, String cuenta, double salario, double tipoInteres)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = salario;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o cambia el nombre del titular de la cuenta.
     *
     * @param nombre El nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece o cambia el número de cuenta.
     *
     * @param cuenta El nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo disponible en la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece o cambia el saldo de la cuenta.
     * Este método se usa internamente en ingresar/retirar, o si se necesita
     * establecer un nuevo saldo directamente.
     *
     * @param saldo El nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés actual de la cuenta.
     *
     * @return El tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece o cambia el tipo de interés de la cuenta.
     *
     * @param tipoInteres El nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Ingresa el dinero dinero en el banco.
     *
     * @param cantidad La cantidad de dinero a ingresar. Debe ser un valor positivo.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        
        setSaldo(saldo + cantidad);
    }

    /**
     * Retira dinero del banco.
     *
     * @param cantidad La cantidad de dinero a retirar. Debe ser un valor positivo.
     * @throws Exception Si la cantidad a retirar es negativa o si no hay suficiente saldo.
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0) {
            throw new Exception ("No se puede retirar una cantidad negativa");
        }
        
        if (getSaldo() < cantidad) {
            throw new Exception ("No se hay suficiente saldo");
        }
        
        setSaldo(saldo - cantidad);
    }
}