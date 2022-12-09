package src;

import java.util.ArrayList;
import java.util.Collection;

public class Conta {
    private String numero;

    private Double saldo = 0.00;


    public Collection<Credito> valorCredito = new ArrayList<Credito>();
    public Collection<Debito> valorDebito = new ArrayList<Debito>();

    public Conta(String numero){
        this.setNumero(numero);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double depositar(Double valor){
        this.saldo += valor;
        return saldo;
    }

    public Double sacar(Double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente!!!");
            return saldo;
        }

        this.saldo -= valor;
        return saldo;
    }

    public Object[] transferencia(Conta envia, Conta recebe, Double valor){
        if(valor > envia.getSaldo()){
            System.out.println("Saldo insuficiente!!!");
        }
        else{
            Double i = valor;
            i += recebe.getSaldo();
            recebe.setSaldo(i);

            envia.setSaldo(getSaldo() - valor);
        }
        Object[] y = {envia, recebe};
        return y;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
