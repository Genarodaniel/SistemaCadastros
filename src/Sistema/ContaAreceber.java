/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.List;

/**
 *
 * @author adm
 */
public class ContaAreceber extends Venda {
    private Integer id;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private String meioPagamento;
    private double valoraPagar;
    
    @Override
    public Cliente getCliente() {
        
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String getMeioPagamento() {
        return meioPagamento;
    }

    @Override
    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    @Override
    public double getValoraPagar() {
        return produto.getPrecoVenda()*getQuantidade();
    }

    @Override
    public void setValoraPagar(Double valoraPagar) {
        this.valoraPagar = valoraPagar;
    }
    
   
      @Override
    public String toString() {
        return  "##########Dados de contas a pagar Por  Cliente ################" +
                "\r\n                         Codigo do Cliente: "+getCliente().getCodigo()+"\r\n"
                + "                         Total A pagar  : "+valoraPagar+";"+"\r\n "
                + "################################ Fim ############################# \r\n\r\n";
    
    } 
    
    
}
