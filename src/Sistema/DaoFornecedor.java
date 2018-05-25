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
public class DaoFornecedor {
    
   public List <Fornecedor> getLista(){
       return Dados.listaFornecedores;
   }
        Iterator iterator =Dados.listaFornecedores.iterator();
   
   public void SalvarFornecedor(Fornecedor obj){
       
      
           if(Dados.listaFornecedores.contains(obj)!= true){
              Dados.listaFornecedores.add(obj);
               System.out.println(" fornecedor nº:" +obj.getCodigo()+" adicionado com sucesso");
           }
           else
           {
               System.out.println("fornecedor nº:" +obj.getCodigo()+" Já existe");
           }
       }
   
   
public void ExcluirFornecedor(int codigo){
    
    
            Fornecedor f;
            f=Busca.buscarFornecedor(codigo);
            
            
        if(Dados.listaFornecedores.contains(f)){
            
            List <Compra> list =Busca.buscarCompraDeProdutosPorFornecedor(codigo);
            
            for(Compra x : list){
                
                if(Dados.listaCompras.contains(x)){
                    Dados.listaCompras.remove(x);
                }
            
            }
                Dados.listaFornecedores.remove(f);
                System.out.println("fornecedor nº:" +f.getCodigo()+" Removido com sucesso");
                
        }
        else
        {   
            System.out.println("Fornecedor nº: "+codigo+" nao existe! ");
        }
            
       
        }
        
    



public void EditarFornecedor(int codigo){
    
    Scanner scan = new Scanner(System.in);
    while(iterator.hasNext()){
        
        for(Fornecedor lista : Dados.listaFornecedores){
            
            if(lista.getCodigo()==codigo){
                
                           System.out.println("Digite o novo nome: ");
                           lista.setNome(scan.next());
                           
                           System.out.println("Digite o novo endereco: ");
                           lista.setEndereco(scan.nextLine());
                           lista.setEndereco(scan.nextLine());
                           
                           System.out.println("Digite o novo telefone: ");
                           lista.setTelefone(scan.nextLine());
                           
                           System.out.println("Digite o novo cnpj: ");
                           lista.setCnpj(scan.nextLine());
                           
                           System.out.println("Digite o novo contato");
                           lista.setContato(scan.nextLine());
                          break;
                           }
            else
            {
                System.out.println("fornecedor nº:" +lista.getCodigo()+" Não encontrado");
                break;
            }
            
            
        }
        
        break;
    }
    
}


}
