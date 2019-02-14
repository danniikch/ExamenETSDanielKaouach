/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccuenta;

public class Cuenta1 {

    /**
     * @return the cuen1
     */
    public String getCuen1() {
        return cuen1;
    }

    /**
     * @param cuen1 the cuen1 to set
     */
    public void setCuen1(String cuen1) {
        this.cuen1 = cuen1;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String apodo;
    private String cuen1;
    private double saldo;
    private double tipoInterés;


    public Cuenta1(){
    }

    public Cuenta1(String nom, String cue, double sal, double tipo)  {
        apodo =nom;
        cuen1=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        setApodo(nom);
    }

    public String obtenerNombre()
    {
        return getApodo();
    }


    public double estado()
    {
        return getSaldo();
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        return getCuen1();
    }


    public String getApodo() {
        return apodo;
    }


    public void setApodo(String apodo) {
        this.apodo = apodo;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
  
        
 
       public static void main(String[] args) {
        Cuenta1 miCuenta;
        double saldoActual;

        miCuenta = new Cuenta1("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(miCuenta);
    }

    public static void operativa_cuenta(Cuenta1 miCuenta) {
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }   
}
