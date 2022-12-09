package src;

public class ContaCorrente extends Conta{
    private Double limite = 0.00;


    public ContaCorrente(String numero) {
        super(numero);
    }


    public Double imprimirSaldo(ContaCorrente conta){
        Double saldoTotal = conta.getSaldo();
        for (Debito e: valorDebito){
            saldoTotal -= e.getValor();
        }
        for (Credito e: valorCredito){
            saldoTotal += e.getValor();
        }
        return saldoTotal + limite;
    }





}
