package org.entrenamiento.ej2;

public class CuentaBancaria {
    private String titular;
    private Double saldo;

    public CuentaBancaria (String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar (Double monto){
        this.saldo += monto;
    }

    public void retirar (Double monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("El saldo restante de su cuenta es: " + this.saldo);
    }
}
