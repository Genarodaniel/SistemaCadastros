/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author adm
 */

// Classe compra representa as compras de produtos dos fornecedores 
//


public class Compra implements Serializable {
    private int notaFiscal;
    private Produto produto;
    private String data;
    private Fornecedor fornecedor;
    private int quantidade;
    private double totalApagar;
    
    
  

    public Compra(int notaFiscal, Produto produto, String data, Fornecedor fornecedor, int quantidade, double totalApagar) {
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.data = data;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.totalApagar = totalApagar;
       
    }
    
      

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotalApagar() {
        return produto.getCusto()*getQuantidade();
    }

    public void setTotalApagar(double totalApagar) {
        this.totalApagar =totalApagar;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor =fornecedor;
    }

   
    public Compra() {
      
    }



    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
   
    @Override
    public String toString() {
        return  "############################### Nova Compra #############################" +
                "\r\n                         Nota Fiscal: "+notaFiscal+"\r\n                         "
                + "Codigo do Fornecedor:"+
                getFornecedor().getCodigo() + ";" +"\r\n                         Data: "+ data + ";" +
                " \r\n                         Codigo do produto: "+ produto.getCodigo() + ";" +"\r\n"
                + "                         Quantidade: "+ quantidade + ";" +
                "\r\n                         Total A Pagar : "+getTotalApagar()+ ";"+"\r\n"
                
                + "################################ Fim da Compra ############################# \r\n\r\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.notaFiscal;
        return hash;
    }

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
        final Compra other = (Compra) obj;
        if (this.notaFiscal != other.notaFiscal) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
