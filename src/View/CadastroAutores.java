/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ControleAutor;
import Model.ModeloAutor;
import javax.swing.JOptionPane;

/**
 *
 * @author Sirlei
 */
public class CadastroAutores extends javax.swing.JFrame {
    private  ModeloAutor autorSalvo;

    Control.ControleAutor ca = new ControleAutor();

    /**
     * Creates new form CadastroAutores
     */
    public CadastroAutores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbtSalvarAutor = new javax.swing.JButton();
        jbtnFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtfAnoNasc = new javax.swing.JFormattedTextField();

        setTitle("Cadastro de Autores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("jfCadAutores"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("CADASTRO DE AUTORES");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("AUTOR:");

        jtfAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAutorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("ANO DE NASC.");

        jbtSalvarAutor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtSalvarAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_guido/imagem/disquete30x30.jpg"))); // NOI18N
        jbtSalvarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarAutorActionPerformed(evt);
            }
        });

        jbtnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_guido/imagem/close.png"))); // NOI18N
        jbtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFecharActionPerformed(evt);
            }
        });

        try {
            jtfAnoNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfAutor)
                                    .addComponent(jtfAnoNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addComponent(jbtSalvarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtSalvarAutor))
                .addGap(18, 18, 18)
                .addComponent(jbtnFechar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean ValidaCampo() {
        if (jtfAutor.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Informe o nome do Autor!", "Alerta", JOptionPane.WARNING_MESSAGE);
            jtfAutor.requestFocus();
        
        return false;
    }
        if (jtfAnoNasc.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Informe o nome do produto!", "Alerta", JOptionPane.WARNING_MESSAGE);
            jtfAnoNasc.requestFocus();
        
        return false;
    }    
        
        return true;
    }
    
    private void  limparCampo(){
    jtfAutor.setText("");
    jtfAnoNasc.setText("");
    this.autorSalvo = null;
    
    }
    
    private void jbtSalvarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarAutorActionPerformed
if(ValidaCampo()) {
 ControleAutor controle = new ControleAutor();
 ModeloAutor autor;
 if (this.autorSalvo != null){
     autor = this.autorSalvo;
 }else{
    autor = new ModeloAutor();
 }
 
 autor.setNome(jtfAutor.getText());
 autor.setAno_nasc(jtfAnoNasc.getText());
 autor.setStatus(true);
 
 boolean gravou = controle.gravarAutor(autor);
 if(gravou) {
     JOptionPane.showMessageDialog(this, "Sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
 limparCampo();
 jtfAutor.requestFocus();
 }else{
     JOptionPane.showMessageDialog(this,"Erro","ERRO",JOptionPane.ERROR_MESSAGE );
 }
 
}
    }//GEN-LAST:event_jbtSalvarAutorActionPerformed

    private void jtfAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAutorActionPerformed

    private void jbtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFecharActionPerformed
        this.dispose();

    }//GEN-LAST:event_jbtnFecharActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastroAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroAutores().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtSalvarAutor;
    private javax.swing.JButton jbtnFechar;
    private javax.swing.JFormattedTextField jtfAnoNasc;
    private javax.swing.JTextField jtfAutor;
    // End of variables declaration//GEN-END:variables
}
