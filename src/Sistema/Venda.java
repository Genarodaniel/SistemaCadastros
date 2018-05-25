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
public class Venda implements Serializable {
  
    private Integer id;
    private Cliente cliente;
    private String data;
    private Produto produto;
    private int quantidade;
    private String meioPagamento;
    private double valoraPagar;

    public Venda() {
        
    }

    public Cliente getCliente() {
        
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
        
    }
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

 
   

    public void setData(String data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public double getValoraPagar() {
        return produto.getPrecoVenda()*getQuantidade();
    }

    public void setValoraPagar(Double valoraPagar) {
        this.valoraPagar = valoraPagar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final Venda other = (Venda) obj;
        return Objects.equals(this.id, other.id);
    }

    

    @Override
    public String toString() {
         
        return "############################### Nova Venda #############################" +
                "\r\n                         Id da venda: "+getId()+"\r\n                         "
                + "Codigo cliente:"+
                getCliente().getCodigo() + ";" +"\r\n                         Data:"+ getData() + ";" +
                " \r\n                         Codigo do produto: "+ getProduto().getCodigo() + ";" +"\r\n"
                + "                         Quantidade: "+ getQuantidade() + ";" +
                "\r\n                         Meio de Pagamento : "+getMeioPagamento() + ";"+"\r\n           "
                + "             "
                + " Valor a pagar : "+getValoraPagar()+";"+"\r\n "
                + "################################ Fim da Venda ############################# \r\n\r\n";
    
    }
    
}
    
    
    

