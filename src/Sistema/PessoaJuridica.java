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
public class PessoaJuridica extends Cliente implements Serializable{
    private String cnpj;
    private int ie;

    public PessoaJuridica(int codigo, String nome, String endereco, String telefone, String tipo,String cnpj,int ie) {
        super(codigo, nome, endereco, telefone, tipo);
        this.cnpj = cnpj;
        this.ie = ie;
        
    }

    public PessoaJuridica() {
       
    }

   
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getIe() {
        return ie;
    }

    public void setIe(int ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return  "############################### Dados do Cliente #############################" +
                "\r\n                         Codigo do Cliente: "+getCodigo()+"\r\n                         "
                + "Nome:"+
                getNome()+ ";" +"\r\n                         Endereco:"+ getEndereco() + ";" +
                " \r\n                         Telefone: "+ getTelefone() + ";" +"\r\n"
                + "                         Tipo Cliente : "+ getTipo() + ";      ------------  "
                + " J : PessoaJuridica | F : PessoaFisica" +
                "\r\n                         CNPJ : "+getCnpj() + ";"+"\r\n           "
                + "             "
                + " Inscrição estadual : "+getIe()+";"+"\r\n "
                + "################################ Fim ############################# \r\n\r\n";
    
    } 
    
    
    
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cnpj);
        return hash;
    }

  
    
    
}
