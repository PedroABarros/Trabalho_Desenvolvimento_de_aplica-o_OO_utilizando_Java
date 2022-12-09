package src;

public class Funcionario extends Pessoa implements IUsuario{
    private Double salario;

    private Cargo nomeCargo;

    public Funcionario(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public Cargo getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(Cargo nomeCargo) {
        this.nomeCargo = nomeCargo;
    }


    @Override
    public Boolean autenticar() {
        return true;
    }
}
