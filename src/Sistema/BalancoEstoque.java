/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.Objects;

/**
 *
 * @author adm
 */
public class BalancoEstoque  {
    
    private Produto produto;
    private int estoqueAtual;
    private int estoqueMinimo1;
    

    public BalancoEstoque(Produto produto,int estoqueAtual,int estoqueMinimo1) {
        
        this.estoqueAtual=estoqueAtual;
        this.estoqueMinimo1=estoqueMinimo1;
        this.produto=produto;
    }

    public BalancoEstoque() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public int getEstoqueMinimo1() {
        return estoqueMinimo1;
    }

    public void setEstoqueMinimo1(int estoqueMinimo1) {
        this.estoqueMinimo1 = estoqueMinimo1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.produto);
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
        final BalancoEstoque other = (BalancoEstoque) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "\r\n ###################  Estoque por produto ################### \r\n" 
                + "                      produto=" + produto.getCodigo() +
                "\r\n"+ "                      estoqueAtual=" + estoqueAtual +"\r\n"+ 
                "                      estoqueMinimo=" + estoqueMinimo1+ "\r\n "
                + "###################       Fim       ###################\r\n\r\n";
    }
                    
    
    
    
    
    
    
    
}