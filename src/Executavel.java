package src;

public class Executavel {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("3213213", "Rua Castelo", "325", "apto.403", "Juiz de Fora", "MG");
        Endereco e2 = new Endereco("7328178", "Rua Torre", "725", "apt.1001", "São Paulo", "SP");
        Endereco e3 = new Endereco("7687986", "Rua Bastial", "611", "apto.7006", "Rio de Janeiro", "RJ");
        Cliente c1 = new Cliente("Roberto Carlos", "123.456.324-188", "9346547894");

        c1.listaEndereco.add(e1);
        c1.listaEndereco.add(e2);
        c1.listaEndereco.add(e3);

        //-----------------------------------------

        Funcionario f1 = new Funcionario("Frederico Antunes", "444.333.222-11", "3213213212");
        Cargo cg1 = new Cargo("Gerente");

        f1.setNomeCargo(cg1);

        //-----------------------------------------

        Funcionario f2 = new Funcionario("Guilherme Batista", "111.222.333-44", "8768768867");
        Cargo cg2 = new Cargo("Atendente");

        f2.setNomeCargo(cg2);

        //-----------------------------------------

        ContaCorrente cc1 = new ContaCorrente("777");
        ContaCorrente cc2 = new ContaCorrente("708");


        c1.listaConta.add(cc1);
        cc1.depositar(300.00);
        cc1.sacar(50.00);
        cc2.depositar(1000.00);

        //-----------------------------------------

        c1.imprimirEndereco(c1);

        System.out.println("Saldo Conta Corrente " + cc1.getNumero()+ " - " + cc1.imprimirSaldo(cc1));

        //-----------------------------------------

        ContaPoupanca cp1 = new ContaPoupanca("0800");

        c1.listaConta.add(cp1);
        cp1.depositar(1000.00);

        //-----------------------------------------

        cc2.transferencia(cc2, cp1, 500.00);

        System.out.println("Tranferecia da Conta: " + cc2.getNumero() + " -> Saldo da conta: " + cc2.imprimirSaldo(cc2));
        System.out.println("Para a Conta " + cp1.getNumero() + " -> Saldo da conta: " + cp1.imprimirSaldo(cp1));

    }
}
