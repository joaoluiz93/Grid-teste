/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacao;



/**
 *
 * @author joaol
 */
public class Validadores {
    
    
     public String removeMaskCPF(String cpf){
        return cpf.replaceAll("[.-]","");
    }
     
     public String removeMaskCEP(String cep){
         return cep.replaceAll("-", "");
     }
     
     public String removeMaskTel(String tel){
         return tel.replaceAll("[()-]", "");
     }
}
