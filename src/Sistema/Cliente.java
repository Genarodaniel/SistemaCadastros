/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.io.*;

/**
 *
 * @author adm
 */
public class Cliente implements Serializable {
   private  int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String tipo;

    public Cliente(int codigo, String nome, String endereco, String telefone, String Tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipo = Tipo;
    }

    public Cliente() {
    }

    public int getCodigo() {
        return codigo;
    
    }

    public void setCodigo(int codigo) {
     this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
        return hash;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }*/
    
    

    @Override
    public boolean equals(Object obj) {
        
        if(this.getCodigo()!=((Cliente)obj).getCodigo()){
         return false;
     }
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if (this.getClass() != obj.getClass()) {
            return true;
        }
        
          return true;
    }

    
    @Override
    public String toString() {
        return   "" + codigo + ";" + nome + ";" + endereco + ";" + telefone + ";" + tipo + ';';
    }

    
    
    
    
    
    
}
