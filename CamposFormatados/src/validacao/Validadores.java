/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



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
     
     public String dataValida(String d){
          
      Date data = null;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            try {
                    format.setLenient(false);
                    data = format.parse(d);
            } catch (ParseException e) {
     		JOptionPane.showMessageDialog(null,
                        "Data inválida. Tente novamente!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return null;
            }
            return d;
}   
     
     public String horaValida(String h){
          
      Date data = null;
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            try {
                    format.setLenient(false);
                    data = format.parse(h);
            } catch (ParseException e) {
     		JOptionPane.showMessageDialog(null,
                        "Hora inválida. Tente novamente!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return null;
            }
            return h;
}
}
