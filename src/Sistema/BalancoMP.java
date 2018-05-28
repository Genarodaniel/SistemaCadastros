/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author adm
 */

// Classe Balanco MP, usada para representar as vendas pelo meio de Pagamento
// é intanciada para gerar o relatorio de vendas por Meio de Pagamento, tem seu próprio arrayList na Classe Dados.

public class BalancoMP {
    private String meioPagamento;
    private List <Venda> vendas;

    public BalancoMP(String meioPagamento, List<Venda> vendas) {
        this.meioPagamento = meioPagamento;
        this.vendas = vendas;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "" + "\r\n###################### "+meioPagamento +" ######################\r\n"  + 
                "\r\n###################### vendas ######################\r\n" + vendas ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.meioPagamento);
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
        final BalancoMP other = (BalancoMP) obj;
        if (!(this.meioPagamento.equalsIgnoreCase(other.meioPagamento))) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
