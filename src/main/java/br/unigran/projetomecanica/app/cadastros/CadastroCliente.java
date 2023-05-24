/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unigran.projetomecanica.app.cadastros;

import br.unigran.projetomecanica.app.casosdeuso.Repository;
import br.unigran.projetomecanica.app.models.Cliente;
import br.unigran.projetomecanica.app.models.Contato;
import br.unigran.projetomecanica.app.models.Tipo;
import br.unigran.projetomecanica.app.padroes.InterfacePadraoCadastro;
import br.unigran.projetomecanica.app.util.Util;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class CadastroCliente extends InterfacePadraoCadastro {


    public CadastroCliente() {
        initComponents();
      atualizaContatos();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Nome");

        jLabel3.setText("Contatos");

        jLabel5.setText("Email");

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

        jButton1.setText("Adicionar Novo Contato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNome)
                    .addComponent(jtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JPanel painel = new JPanel(new FlowLayout());
        JTextField descricao = new JTextField(30);
        JComboBox tipo = new JComboBox(Tipo.values());
        painel.add(tipo);
        painel.add(descricao);
        
    if(JOptionPane.showOptionDialog(this, painel, "Adicionar Contato", JOptionPane.CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null)==0){
       Cliente c = (Cliente) objeto;
       Contato contato= new Contato();
       contato.setCliente(c);
       contato.setDescricao(descricao.getText());
       contato.setTipo((Tipo) tipo.getSelectedItem());
       c.getContatos().add(contato);
       atualizaContatos();
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void atualizaContatos(){
        if(objeto==null)
            objeto= new Cliente();
       jTable1.setModel(Util.atualizaTabela(((Cliente)objeto).getContatos(),new Contato()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables

    @Override
    public  void setObjeto(Object o){
        objeto=o;
        Cliente c = (Cliente) objeto;
        jtNome.setText(c.getNome());
        jtEmail.setText(c.getEmail());
        jTable1.setModel(Util.atualizaTabela(c.getContatos(), new Contato()));
        
    };  
    @Override
    public Object getObjeto() {
        Cliente o = (Cliente) objeto;
        if(o==null)
            o= new Cliente();
        o.setEmail(jtEmail.getText());
        o.setNome(jtNome.getText());
        
        return o;
    }    
}
