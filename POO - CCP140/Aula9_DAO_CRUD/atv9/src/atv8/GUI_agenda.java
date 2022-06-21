/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atv8;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;  


/**
 *
 * @author uniebrunosil
 */
public class GUI_agenda extends javax.swing.JFrame {
    private Agenda agenda;
    private Pessoa pessoa;
    /**
     * Creates new form GUI_agenda
     */
    public GUI_agenda() {
        initComponents();
        agenda = new Agenda();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPainel = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        btnBuscarContato = new javax.swing.JButton();
        btnAtualizarContato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        txtPainel.setColumns(20);
        txtPainel.setRows(5);
        jScrollPane1.setViewportView(txtPainel);

        btnBuscar.setText("LISTA COMPLETA");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscarContato.setText("BUSCAR CONTATO");
        btnBuscarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContatoActionPerformed(evt);
            }
        });

        btnAtualizarContato.setText("ATUALIZAR CONTATO");
        btnAtualizarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(btnRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnBuscarContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        String status = agenda.remover(txtNome.getText());
        
        if(status == "ok"){
            String s = "Contato Removido!";
            JOptionPane.showMessageDialog(null, s, "Informação: Contato Removido.", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String s = status;
            JOptionPane.showMessageDialog(null, s, "Erro na remoção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        String numero = txtTelefone.getText();
        pessoa = new Pessoa(nome, numero);
        String status = agenda.inserir(pessoa);
        
        if(status == "ok"){
            String s = "Contato Adicionado Com Sucesso!";
            JOptionPane.showMessageDialog(null, s, "Informação: Contato Adicionado.", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String s = status;
            JOptionPane.showMessageDialog(null, s, "Erro na adição", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnBuscarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContatoActionPerformed
        // TODO add your handling code here:
        try {
            String nome = txtNome.getText();
            ResultSet rs = agenda.buscarPorNome(nome);
            while (rs.next()) {
                String lista = "Nome : " + rs.getString("NOME") + " - " + "Telefone : " + rs.getString("TELEFONE") + "\n";
                txtPainel.setText(lista);
                String s = "Contato Encontrado Com Sucesso!";
                JOptionPane.showMessageDialog(null, s, "Informação: Contato Carregada.", JOptionPane.INFORMATION_MESSAGE);
                
            }
        } catch( SQLException e) {
            String s = "Consulta não foi possível" + e.getMessage();
            JOptionPane.showMessageDialog(null, s, "Erro na busca do contato.", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btnBuscarContatoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs = agenda.buscar();
            String lista = "";
            while (rs.next()) {
                lista = lista + "Nome : " + rs.getString("NOME") + " - " + "Telefone : " + rs.getString("TELEFONE") + "\n";
            }
            txtPainel.setText(lista);
            String s = "Lista Carregada Com Sucesso!";
            JOptionPane.showMessageDialog(null, s, "Informação: Lista Carregada.", JOptionPane.INFORMATION_MESSAGE);
            
        } catch( SQLException e) {
            String s = "Consulta não foi possível" + e.getMessage();
            JOptionPane.showMessageDialog(null, s, "Erro na busca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarContatoActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        String numero = txtTelefone.getText();
        agenda.alterar(numero, nome);
        String s = "Contato Modificado Com Sucesso!";
        JOptionPane.showMessageDialog(null, s, "Informação: Contato Modificado.", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAtualizarContatoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizarContato;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarContato;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtPainel;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}