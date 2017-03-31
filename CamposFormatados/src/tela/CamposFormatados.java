/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import validacao.Limitecaracteres;
import javax.swing.JOptionPane;
import validacao.CPF;
import validacao.JtextFieldSomenteNumeros;
import validacao.Validadores;


/**
 *
 * @author joaol
 */
public class CamposFormatados extends javax.swing.JFrame {

    /**
     * Creates new form CamposFormatados
     */
    public CamposFormatados() {
        initComponents();
       tfnumeros = new JtextFieldSomenteNumeros();
       tatexto.setDocument(new Limitecaracteres(8) );
       cep = new Validadores();
       tel = new Validadores();
       data = new Validadores();
       hora = new Validadores();
       
       //cpf = new Validadores();
    }
    
   // private final Validadores cpf;
   private final Validadores cep;
   private final Validadores tel;
   private final Validadores data;
   private final Validadores hora;      
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tfcpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        tftel = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdigitos = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tatexto = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tfcep = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        tfnumeros = new JtextFieldSomenteNumeros();
        jLabel5 = new javax.swing.JLabel();
        tdData = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        tfHora = new javax.swing.JFormattedTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CPF: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 37, 24));

        try {
            tfcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcpfActionPerformed(evt);
            }
        });
        getContentPane().add(tfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 61, 134, -1));

        jLabel2.setText("tel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, -1, -1));

        try {
            tftel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tftel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftelActionPerformed(evt);
            }
        });
        getContentPane().add(tftel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 108, 151, -1));

        jLabel3.setText("Dois Digitos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 65, -1));

        try {
            tfdigitos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfdigitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 160, 65, -1));

        jLabel4.setText("Só numeros:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, -1, 22));

        jLabel6.setText("Area de texto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, -1, -1));

        tatexto.setColumns(20);
        tatexto.setRows(5);
        jScrollPane1.setViewportView(tatexto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 258, 199, 73));

        jLabel7.setText("CEP:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 45, -1));

        try {
            tfcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 93, -1));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        tfnumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfnumerosKeyTyped(evt);
            }
        });
        getContentPane().add(tfnumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 210, 137, -1));

        jLabel5.setText("Data:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        try {
            tdData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdDataActionPerformed(evt);
            }
        });
        getContentPane().add(tdData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 80, 30));

        jLabel8.setText("Hora:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        try {
            tfHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraActionPerformed(evt);
            }
        });
        getContentPane().add(tfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnumerosKeyTyped
  
    }//GEN-LAST:event_tfnumerosKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String cpf =  cpf.removeMaskCPF(tfcpf.getText());  
  String cpf = tfcpf.getText();
  String cepDesmascarado = cep.removeMaskCEP(tfcep.getText());
  String telDesmascarado = tel.removeMaskTel(tftel.getText());
  String data1 = data.dataValida(tdData.getText());
  CPF pf = new CPF(cpf);
  String hora1 = hora.horaValida(tfHora.getText());
        if(pf.isCPF()){
            cpf = pf.getCPF(false);
            JOptionPane.showMessageDialog(null, "O cpf e:"+ cpf +"\n"
          +"O cep é:"+ cepDesmascarado+ "\n"+
          "O tel é: "+telDesmascarado+"\n"+
                      "A data é: " +data1+"\n"+
                    "A hora é: "+hora1);
            
        }else{
            JOptionPane.showMessageDialog(rootPane,"CPF inválido!");
        }
  

            
 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcpfActionPerformed

    private void tdDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdDataActionPerformed

    private void tfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraActionPerformed

    private void tftelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CamposFormatados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CamposFormatados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CamposFormatados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CamposFormatados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CamposFormatados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tatexto;
    private javax.swing.JFormattedTextField tdData;
    private javax.swing.JFormattedTextField tfHora;
    private javax.swing.JFormattedTextField tfcep;
    private javax.swing.JFormattedTextField tfcpf;
    private javax.swing.JFormattedTextField tfdigitos;
    private javax.swing.JTextField tfnumeros;
    private javax.swing.JFormattedTextField tftel;
    // End of variables declaration//GEN-END:variables
}
