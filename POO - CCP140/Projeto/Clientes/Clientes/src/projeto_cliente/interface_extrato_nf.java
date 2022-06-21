/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_cliente;

import clientes.Cliente;
import clientes.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author danim
 */
public class interface_extrato_nf extends javax.swing.JFrame {
    Cliente cliente;
    DAO funcao;
    /**
     * Creates new form interface_extrato_nf
     */
    public interface_extrato_nf(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        funcao = new DAO();
    }

    private interface_extrato_nf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFeicash = new javax.swing.JLabel();
        lblSelec = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaPrint = new javax.swing.JTextArea();
        btnOk = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFeicash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFeicash.setForeground(new java.awt.Color(0, 0, 240));
        lblFeicash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeicash.setText("FEICASH");
        lblFeicash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 240)));

        lblSelec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelec.setText("Pressione Ok para gerar o Extrato de Notas Fiscais:");

        areaPrint.setColumns(20);
        areaPrint.setRows(5);
        jScrollPane1.setViewportView(areaPrint);

        btnOk.setText("ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSelec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOk)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(lblFeicash, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 233, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFeicash, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelec)
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        try {
            
            String cpf = cliente.getCpf();
            
            ResultSet rs2 = funcao.buscarInfosClientes(cpf);
            String lista = "";
            while (rs2.next()) {
                lista = "NOME: " + rs2.getString("NOME") + "\nCPF: " + rs2.getString("CPF") 
                +"\n"+ "Data do Cadastro"+"\tValor da compra (R$)"+"\t%"+"\tCashBack (R$)"+"\t    Compra Online\n";
            }
            
            ResultSet rs = funcao.extratos(cpf);
            // formatação da data para o print
            SimpleDateFormat simpDate = new SimpleDateFormat("dd-MM-yyyy");

            while (rs.next()) {
                if("Sim".equals(rs.getString("Online"))){
                    lista = lista + simpDate.format(rs.getDate("DATA"))+" "+rs.getTime("HORA") +"\t"+ String.format("%.2f", rs.getDouble("VALOR")) +"\t\t";
                    lista = lista + "5%\t";
                    lista = lista + String.format("%.2f", rs.getDouble("CASHBACK")) + "\t    " + rs.getString("ONLINE") + "\n";
                }
                else if ("Não".equals(rs.getString("Online"))){
                    lista = lista + simpDate.format(rs.getDate("DATA"))+" "+rs.getTime("HORA") +"\t"+ String.format("%.2f", rs.getDouble("VALOR")) +"\t\t";
                    lista = lista + "2%\t";
                    lista = lista + String.format("%.2f", rs.getDouble("CASHBACK")) + "\t    " + rs.getString("ONLINE") + "\n";
                }   
                else{
                    rs.next(); 
                }
            }
            areaPrint.setText(lista);
            String s = "Extrato de notas fiscais encontradas!";
            JOptionPane.showMessageDialog(null, s, "Informação: Extrato Carregado.", JOptionPane.INFORMATION_MESSAGE);
            
        } catch( SQLException e) {
            String s = "Consulta não foi possível " + e.getMessage();
            JOptionPane.showMessageDialog(null, s, "Não foram encontradas notas fiscais", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        interface_usuario tela = new interface_usuario(cliente);
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(interface_extrato_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_extrato_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_extrato_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_extrato_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_extrato_nf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaPrint;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFeicash;
    private javax.swing.JLabel lblSelec;
    // End of variables declaration//GEN-END:variables
}