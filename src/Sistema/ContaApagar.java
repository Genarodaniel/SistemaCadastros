/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author adm
 */
public class ContaApagar extends Compra {
    private int notaFiscal;
    private Produto produto;
    private String data;
    private Fornecedor fornecedor;
    private int quantidade;
    private double totalApagar;
    
    @Override
    public List <Produto> getLista(){
        return Dados.listaProdutos;
    }

    public ContaApagar(int notaFiscal, Produto produto, String data, Fornecedor fornecedor, int quantidade, double totalApagar) {
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.data = data;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.totalApagar = totalApagar;
    }
    
      

    @Override
    public int getNotaFiscal() {
        return notaFiscal;
    }

    @Override
    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public double getTotalApagar() {
        return totalApagar;
    }

    @Override
    public void setTotalApagar(double totalApagar) {
        this.totalApagar =totalApagar;
    }

    @Override
    public Produto getProduto() {
        return produto;
    }

    @Override
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor =fornecedor;
    }

    public ContaApagar() {
      
    }



    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
   
   
    
      @Override
    public String toString() {
        return  "##########Dados de contas a pagar Por fornecedor Cliente ################" +
                "\r\n                         Codigo do Fornecedor: "+getFornecedor().getCodigo()+"\r\n"
                + "                         Total A pagar  : "+totalApagar+";"+"\r\n "
                + "################################ Fim ############################# \r\n\r\n";
    
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
        final ContaApagar other = (ContaApagar) obj;
        if (this.notaFiscal != other.notaFiscal) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
