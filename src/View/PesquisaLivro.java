package View;

import Control.ControleLivro;
import Model.Livro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sirlei
 */
public class PesquisaLivro extends javax.swing.JFrame {
    ControleLivro cl = new ControleLivro();
    /**
     * Creates new form PesquisaLivro
     */
    public PesquisaLivro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void preencheTabela(ArrayList<Livro> livros) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        model.setColumnIdentifiers(new String [] {"ISBN", "Título", "Subtítulo", "Ano", "Edição", "Editora", "Qtd. Páginas", "Gênero"});        
        
        for (Livro livro : livros) {
            ArrayList<Object> row = new ArrayList<>();
            
            row.add(livro.getIsbn());
            row.add(livro.getTitulo());
            row.add(livro.getSubTitulo());
            row.add(livro.getAno());
            row.add(livro.getEdicao());
            row.add(livro.getId_editora());
            row.add(livro.getNumero_de_paginas());
            row.add(livro.getGenero());
            
            model.addRow(row.toArray());
        }
        
        jtbLivros.setModel(model);
    }
    
    private void pesquisar() {
        if (jrbNomeLivro.isSelected()) {
            preencheTabela(cl.pesquisarLivroPorNome(jtfFiltro.getText()));
        } else if (jrbIsbn.isSelected()) {
            preencheTabela(cl.pesquisarLivroPorIsbn(jtfFiltro.getText()));
        } else if (jrbAno.isSelected()) {
            preencheTabela(cl.pesquisarLivroPorAno(Integer.parseInt(jtfFiltro.getText())));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbLivros = new javax.swing.JTable();
        jtfFiltro = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbtnFechar = new javax.swing.JButton();
        jrbNomeLivro = new javax.swing.JRadioButton();
        jrbAno = new javax.swing.JRadioButton();
        jrbIsbn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Pesquisar Livros");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("jfPesqLivros"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("PESQUISAR LIVROS");

        jtbLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Título", "Subtítulo", "Ano", "Edição", "Editora", "Qtd. Páginas", "Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbLivros);

        jtfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFiltroKeyReleased(evt);
            }
        });

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_guido/imagem/Pesquisar30x31.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbtnFechar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_guido/imagem/close.png"))); // NOI18N
        jbtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFecharActionPerformed(evt);
            }
        });

        btnGroupTipos.add(jrbNomeLivro);
        jrbNomeLivro.setSelected(true);
        jrbNomeLivro.setText("Nome do livro");

        btnGroupTipos.add(jrbAno);
        jrbAno.setText("Ano de publicação");

        btnGroupTipos.add(jrbIsbn);
        jrbIsbn.setText("ISBN");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pesquisar por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfFiltro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbNomeLivro)
                                .addGap(18, 18, 18)
                                .addComponent(jrbAno)
                                .addGap(18, 18, 18)
                                .addComponent(jrbIsbn)
                                .addGap(219, 219, 219)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbNomeLivro)
                            .addComponent(jrbAno)
                            .addComponent(jrbIsbn)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 205, Short.MAX_VALUE)
                                .addComponent(jbtnFechar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnFecharActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFiltroKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            pesquisar();
        }
    }//GEN-LAST:event_jtfFiltroKeyReleased

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
//            java.util.logging.Logger.getLogger(PesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PesquisaLivro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbtnFechar;
    private javax.swing.JRadioButton jrbAno;
    private javax.swing.JRadioButton jrbIsbn;
    private javax.swing.JRadioButton jrbNomeLivro;
    private javax.swing.JTable jtbLivros;
    private javax.swing.JTextField jtfFiltro;
    // End of variables declaration//GEN-END:variables
}
