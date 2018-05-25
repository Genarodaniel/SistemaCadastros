/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class DaoProduto {
    
    public List <Produto> getLista(){
        return Dados.listaProdutos;
    }
    
    // METODO PARA PERCORRER A LISTA 
    
    Iterator iterator = Dados.listaProdutos.iterator();
    
    public void SalvarProduto(Produto obj){
        
        if(Dados.listaProdutos.contains(obj)!=true){
                    Dados.listaProdutos.add(obj);
                    System.out.println("Produto nº: "+obj.getCodigo()+" adicionado");
                 
                }
                else
                {
                    System.out.println("Produto ja existe");
                   
                }
                    
            }
    public void ExcluirProduto(int codigo){
        
        Produto p;
        p= Busca.buscarProduto(codigo);
        
        if(Dados.listaProdutos.contains(p)){
            
            List <Venda> list= Busca.buscarVendaDeProdutosPorCodigo(codigo);
            
                for(Venda e : list){
                    Dados.listaVendas.remove(e);
                    System.out.println("Venda nº: "+e.getId()+" Removida com sucesso(Produto removido)!");
                }
                List <Compra> list1 =Busca.buscarCompraDeProdutosPorCodigo(codigo);
                
                for(Compra x : list1){
                    
                    Dados.listaCompras.remove(x);
                    System.out.println("Compra nf nº: "+ x.getNotaFiscal()+" Removida com sucesso(Produto removido)!");
                }
            
            
            Dados.listaProdutos.remove(p);
            System.out.println("Produto nº: "+p.getCodigo()+"Removido com sucesso");
        }
        else
        {
            System.out.println("Produto nº: "+codigo+" Não encontrado");
        }
      
    }
    public void EditarProduto(int codigo){
                
      // Scanner recebe cocmo parametro system.in = teclado // arquivo = ponteiro do arquivo criado em file  
                Scanner scan = new Scanner(System.in);
                
           
                while(iterator.hasNext()){
            
            for(Produto lista : Dados.listaProdutos)
            {
                lista.setPrecoVenda(lista.getCusto()+lista.getCusto()*lista.getPercentualLucro()/100);
              
                if(lista.getCodigo()==  codigo){
       
                    System.out.println("Digite a descricao ");
                    lista.setDesc(scan.nextLine());
                    
                     System.out.println("Digite o estoque minimo ");
                    lista.setQuantidadeEstoque(scan.nextInt());
                    
                     System.out.println("Digite o estoque atual ");
                     lista.setEstoqueMinimo(scan.nextInt());
                    
                     System.out.println("Digite o valor de custo ");
                    lista.setCusto(scan.nextDouble());
                    
                     System.out.println("Digite o percentual de lucro ");
                    lista.setPercentualLucro(scan.nextInt());
                    
                    break;
                
            }
        }
            break;
                }
    
            }
}
