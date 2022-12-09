package src;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario{
    private Boolean vip;

    public Collection<Endereco> listaEndereco = new ArrayList<Endereco>();

    public Collection<Conta> listaConta = new ArrayList<Conta>();

    public Cliente(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
    }


    //-----------------------------------------------------------------//

    public void imprimirEndereco(Cliente endereco){
        Collection<Endereco> enderecos = endereco.listaEndereco;
        for (Endereco i: enderecos){
            System.out.println(endereco.getNome());
            System.out.println("Endereço: " + i.getLogradouro() + " - " + i.getCidade());
        }
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}


