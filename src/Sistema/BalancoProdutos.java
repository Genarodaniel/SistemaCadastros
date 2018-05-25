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
public class BalancoProdutos {
    private Produto produto;
    private List<Venda> list;
    private double lucro;

    public BalancoProdutos() {
      
    }
    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Venda> getList() {
        return list;
    }

    public void setList(List<Venda> list) {
        this.list = list;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    @Override
    public String toString() {
        return "" + "##################  produto nº " + produto.getCodigo()+" ################## \r\n\r\n" +
                "################## Vendas   ################## \r\n\r\n" + list + " ################## lucro = " + lucro + "################## \r\n\r\n";
    }
    
    
    
}
