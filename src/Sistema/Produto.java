/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.Serializable;

/**
 *
 * @author adm
 */
public class Produto implements Serializable {
    private int codigo;
    private int estoqueMinimo;
    private int quantidadeEstoque;
    private int percentualLucro;
    private double custo;
    private String desc;
    private double precoVenda;

    public Produto(int codigo,String desc, int estoqueMinimo, int quantidadeEstoque,double custo, int percentualLucro) {
        this.codigo = codigo;
        this.estoqueMinimo = estoqueMinimo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.percentualLucro = percentualLucro;
        this.custo = custo;
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto() {
    }
    

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(int percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
// calculo esta sendo feito aqui e retornado direto pelo get;
    public double getPrecoVenda() {
        return getCusto()+getCusto()*getPercentualLucro()/100;
    }

    void setPrecoVenda(double precoVenda) {
        this.precoVenda= precoVenda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.codigo;
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
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    // To string serve para mostrar os atributos da classe com get Nomedoatributo() 
    @Override
    public String toString() {
        return "############################### Dados do Produto #############################" +
                "\r\n                         Codigo do fornecedor: "+getCodigo()+"\r\n                         "
                + "Descrição:"+
                getDesc()+ ";" +"\r\n                         Estoque minimo:"+ getEstoqueMinimo() + ";" +
                " \n                         Quantidade em estoque: "+ getQuantidadeEstoque() + ";" +"\r\n"
                + "                         Custo: "+ getCusto() + ";" +
                "\r\n                         Percentual de Lucro : "+getPercentualLucro() + ";"+"\r\n           "
                + "             "
                + " Preco de venda  : "+getPrecoVenda()+";"+"\r\n "
                + "################################ Fim ############################# \r\n\r\n";
    }
    
    
                
     
    
    
    

    
}
