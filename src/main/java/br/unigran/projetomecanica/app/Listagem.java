package br.unigran.projetomecanica.app;

import br.unigran.projetomecanica.app.casosdeuso.Repository;
import br.unigran.projetomecanica.app.padroes.InterfacePadraoCadastro;
import br.unigran.projetomecanica.app.padroes.PadraoListar;
import br.unigran.projetomecanica.app.util.Util;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Listagem extends javax.swing.JDialog {
    private final PadraoListar padrao;
    private List dados;
    private final InterfacePadraoCadastro cadastro;
    public Listagem(java.awt.Frame parent, boolean modal,PadraoListar padrao,InterfacePadraoCadastro cadastro) {
        super(parent, modal);
        initComponents();
        this.padrao=padrao;
        this.cadastro=cadastro;
        atualiza();
        }
    public void atualiza(){
        dados=Repository.listar(padrao.getClass(), padrao.pesquisar(jTextField1.getText()));
        jTable1.setModel(Util.atualizaTabela(dados, padrao));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jbNovo.setText("Novo");
        jbNovo.setMaximumSize(new java.awt.Dimension(100, 50));
        jbNovo.setMinimumSize(new java.awt.Dimension(100, 50));
        jbNovo.setPreferredSize(new java.awt.Dimension(100, 50));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel6.add(jbNovo);

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel6.add(jbEditar);

        jbRemover.setText("Remover");
        jbRemover.setMinimumSize(new java.awt.Dimension(100, 50));
        jbRemover.setPreferredSize(new java.awt.Dimension(100, 50));
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });
        jPanel6.add(jbRemover);

        jbImprimir.setText("Imprimir");
        jbImprimir.setMinimumSize(new java.awt.Dimension(100, 50));
        jbImprimir.setPreferredSize(new java.awt.Dimension(100, 50));
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });
        jPanel6.add(jbImprimir);

        jbSair.setText("Sair");
        jbSair.setMinimumSize(new java.awt.Dimension(100, 50));
        jbSair.setPreferredSize(new java.awt.Dimension(100, 50));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jPanel6.add(jbSair);

        jPanel2.add(jPanel6);

        jLabel2.setText("Pesquisar");
        jPanel5.add(jLabel2);

        jTextField1.setColumns(30);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel5.add(jTextField1);

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Info");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(814, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        new Cadastro((Frame) this.getParent(), cadastro).setVisible(true);
        atualiza();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>0){
            Repository.remover(dados.get(jTable1.getSelectedRow()));
            atualiza();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione um item");
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        atualiza();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>0){
            new Cadastro((Frame) this.getParent(), (InterfacePadraoCadastro) dados.get(jTable1.getSelectedRow())).setVisible(true);
            atualiza();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione um item");
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        atualiza();
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSair;
    // End of variables declaration//GEN-END:variables
}
