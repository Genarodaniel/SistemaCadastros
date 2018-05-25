/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adm
 */
public class PessoaFisica extends Cliente  implements Serializable {
    private String cpf;

    public PessoaFisica(int codigo, String nome, String endereco, String telefone, String tipo,String cpf) {
        super(codigo, nome, endereco, telefone, tipo);
        this.cpf = cpf;
    }

    
    public PessoaFisica() {
       
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "############################### Dados do Cliente #############################" +
                "\r\n                         Codigo do Cliente: "+getCodigo()+"\r\n                         "
                + "Nome:"+
                getNome()+ ";" +"\r\n                         Endereco:"+ getEndereco() + ";" +
                " \r\n                         Telefone: "+ getTelefone() + ";" +"\r\n"
                + "                         Tipo Cliente : "+ getTipo() + ";      ------------   J : PessoaJuridica | F : PessoaFisica" +
                "\r\n                         CPF : "+getCpf() + ";"+"\r\n"
                + "################################ Fim ############################# \r\n\r\n";
    
    } 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        return hash;
    }


  
    
    
}
