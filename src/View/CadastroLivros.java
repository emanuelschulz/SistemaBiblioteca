/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Livro;

/**
 *
 * @author Sirlei
 */
public class CadastroLivros extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivros
     */
    public CadastroLivros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTelaLivros = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jsNumAutores = new javax.swing.JSpinner();
        jtfCDU = new javax.swing.JTextField();
        jtfISBN = new javax.swing.JTextField();
        jtfTitulo = new javax.swing.JTextField();
        jtfEdicao = new javax.swing.JTextField();
        jtfAcervo = new javax.swing.JTextField();
        jtfGenero = new javax.swing.JTextField();
        jtfAno = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbAutorEmail = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlstAutoresSelet = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jbtSalvarCadLivros = new javax.swing.JButton();
        jtfNumPaginas = new javax.swing.JTextField();
        jbtAdicionar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtbEditora = new javax.swing.JTable();
        jtfSubtitulo = new javax.swing.JTextField();
        jcbOnline = new javax.swing.JCheckBox();
        jcbBraile = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("CADASTRO DE LIVROS");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("ISBN:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("TÍTULO:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("ANO:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("EDIÇÃO:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Nº PÁGINAS:");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("ACERVO:");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("GÊNERO:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("CDU:");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("QNT. AUTORES:");

        jtfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTituloActionPerformed(evt);
            }
        });

        jtbAutorEmail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "AUTOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtbAutorEmail);

        jScrollPane4.setViewportView(jlstAutoresSelet);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("AUTORES SELECIONADOS");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jbtSalvarCadLivros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtSalvarCadLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_guido/imagem/salvar65x65.png"))); // NOI18N
        jbtSalvarCadLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarCadLivrosActionPerformed(evt);
            }
        });

        jbtAdicionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_guido/imagem/add65x65.png"))); // NOI18N

        jtbEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "EDITORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtbEditora);

        jtfSubtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSubtituloActionPerformed(evt);
            }
        });

        jcbOnline.setText("Online?");

        jcbBraile.setText("Braile?");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("SUBTITULO:");

        javax.swing.GroupLayout jpTelaLivrosLayout = new javax.swing.GroupLayout(jpTelaLivros);
        jpTelaLivros.setLayout(jpTelaLivrosLayout);
        jpTelaLivrosLayout.setHorizontalGroup(
            jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTelaLivrosLayout.createSequentialGroup()
                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel22))
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCDU, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsNumAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTelaLivrosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbOnline)
                                    .addComponent(jcbBraile))
                                .addGap(57, 57, 57)
                                .addComponent(jbtAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jtfAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTelaLivrosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTelaLivrosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbtSalvarCadLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTelaLivrosLayout.setVerticalGroup(
            jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(10, 10, 10)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(10, 10, 10)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(10, 10, 10)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfNumPaginas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(10, 10, 10)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(10, 10, 10)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfCDU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(10, 10, 10)
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jsNumAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtAdicionar)
                                        .addGap(46, 46, 46))
                                    .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbOnline)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbBraile)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jpTelaLivrosLayout.createSequentialGroup()
                                .addGroup(jpTelaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel23)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jbtSalvarCadLivros)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpTelaLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpTelaLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTituloActionPerformed

    private void jbtSalvarCadLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarCadLivrosActionPerformed
       int editora = (int) jtbEditora.getValueAt(0, jtbEditora.getSelectedRow());
        
        Livro livr = new Livro (0, jtfTitulo.getText(), jtfSubtitulo.getText(), jtfISBN.getText(), jcbOnline.isSelected(), jcbBraile.isSelected(), jtfGenero.getText(), Integer.parseInt(jtfNumPaginas.getText()), editora, true);
        
        
    }//GEN-LAST:event_jbtSalvarCadLivrosActionPerformed

    private void jtfSubtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSubtituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSubtituloActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtAdicionar;
    private javax.swing.JButton jbtSalvarCadLivros;
    private javax.swing.JCheckBox jcbBraile;
    private javax.swing.JCheckBox jcbOnline;
    private javax.swing.JList<String> jlstAutoresSelet;
    private javax.swing.JPanel jpTelaLivros;
    private javax.swing.JSpinner jsNumAutores;
    private javax.swing.JTable jtbAutorEmail;
    private javax.swing.JTable jtbEditora;
    private javax.swing.JTextField jtfAcervo;
    private javax.swing.JTextField jtfAno;
    private javax.swing.JTextField jtfCDU;
    private javax.swing.JTextField jtfEdicao;
    private javax.swing.JTextField jtfGenero;
    private javax.swing.JTextField jtfISBN;
    private javax.swing.JTextField jtfNumPaginas;
    private javax.swing.JTextField jtfSubtitulo;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
