/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.*;




/**
 *
 * @author adm
 */

public class DaoCliente {
    
    public List <Cliente> getLista(){
        return Dados.listaClientes;
    }
            Iterator iterator = Dados.listaClientes.iterator(); 
            
        public void salvarCliente(Cliente obj){
      
            if(Dados.listaClientes.contains(obj)!= true)
            {
                Dados.listaClientes.add(obj);
                System.out.println("Cliente nº"+obj.getCodigo()+" adicionado");
            }
            else {
                System.out.println("Cliente nº"+obj.getCodigo()+" Ja existe");
            }
        }

   
       
        public void excluirCliente(int codigo){
            
           Cliente c1 ;
           c1=(Busca.buscarCliente(codigo));
           
                       if(Dados.listaClientes.contains(c1)){ 
                            
                        List<Venda> list =Busca.buscarVendaDeProdutosPorCliente(codigo);
                        
                        list.forEach((p) -> {
                            if(Dados.listaVendas.contains(p)){
                                Dados.listaVendas.remove(p);
                            } 
                            
                            
               });
                        Dados.listaClientes.remove(c1);
                        System.out.println("Cliente nº:"+codigo+" Removido com sucesso");
                            
                           
                       }
                       else
                       {
                           System.out.println("Cliente nº:"+codigo+"Nao encontrado");
                       }
                             
           }
           
        
        public void alteraCliente(int codigo){
      
            
                
               while(iterator.hasNext()){
                   Scanner scan = new Scanner(System.in);
                   
                   for(Cliente lista : Dados.listaClientes)
                   
                       while(iterator.hasNext()){
                       if(codigo == lista.getCodigo())
                       {
                          
                           System.out.println("Digite o novo nome: ");
                           lista.setNome(scan.next());
                           
                           System.out.println("Digite o novo endereco: ");
                           
                           lista.setEndereco(scan.nextLine());
                           lista.setEndereco(scan.nextLine());
                           
                           System.out.println("Digite o novo telefone: ");
                           lista.setTelefone(scan.nextLine());
                           
                           
                           if(lista instanceof PessoaJuridica){
                           System.out.println("Digite o novo cnpj: ");
                           ((PessoaJuridica) lista).setCnpj(scan.nextLine());
                           
                           System.out.println("Digite a nova ie: ");
                           ((PessoaJuridica) lista).setIe(scan.nextInt());
                           }
                           else
                               if(lista instanceof PessoaFisica)
                           {
                               System.out.println("Digite o novo cpf: ");
                               ((PessoaFisica) lista).setCpf(scan.nextLine());
                           }
                          
                           break;
                       }
                       else
                       {
                           System.out.println("cliente nº: "+codigo+" nao encontrado");
                           break;
                       }
                   }
                   break;
                } 
        }

}