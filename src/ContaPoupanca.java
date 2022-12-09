package src;

public class ContaPoupanca extends Conta{
    private Double rentabilidadeMensal;



    public ContaPoupanca(String numero) {
        super(numero);
    }

    public Double imprimirSaldo(ContaPoupanca conta){
        Double saldoTotal = conta.getSaldo();
        for (Debito e: valorDebito){
            saldoTotal -= e.getValor();
        }
        for (Credito e: valorCredito){
            saldoTotal += e.getValor();
        }
        return saldoTotal;
    }
}
