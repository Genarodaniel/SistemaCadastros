/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author adm
 */
public class Fornecedor extends PessoaJuridica  {
    private String contato;

    public Fornecedor(int codigo, String nome, String endereco, String telefone, String cnpj,String contato,String tipo,int ie) {
        super(codigo, nome, endereco, telefone, cnpj,tipo,ie);
        this.contato = contato;
    }

    public Fornecedor() {
    }
    

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

  @Override
    public String toString() {
        return  "############################### Dados do Fornecedor #############################" +
                "\r\n                         Codigo do Fornecedor: "+getCodigo()+"\r\n                         "
                + "Nome:"+
                getNome()+ ";" +"\r\n                         Endereco:"+ getEndereco() + ";" +
                " \r\n                         Telefone: "+ getTelefone() + ";" +
                "\r\n                         CNPJ : "+getCnpj() + ";"+"\r\n           "
                + "             "
                + " Pessoa de Contato : "+getContato()+";"+"\r\n "
                + "################################ Fim ############################# \r\n\r\n";
    
    }
    

  
}
