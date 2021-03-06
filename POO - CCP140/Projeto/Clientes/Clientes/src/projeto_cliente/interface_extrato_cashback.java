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
public class interface_extrato_cashback extends javax.swing.JFrame {
    Cliente cliente;
    DAO funcao;

    /**
     * Creates new form interface_extrato_cashback
     */
    public interface_extrato_cashback(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        funcao = new DAO();
    }

    private interface_extrato_cashback() {
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
        areaResultados = new javax.swing.JTextArea();
        btnOk = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFeicash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFeicash.setForeground(new java.awt.Color(0, 0, 240));
        lblFeicash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeicash.setText("FEICASH");
        lblFeicash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 240)));

        lblSelec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelec.setText("Pressione Ok para gerar o Extrato dos Caskbacks:");

        areaResultados.setColumns(20);
        areaResultados.setRows(5);
        jScrollPane1.setViewportView(areaResultados);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFeicash, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(btnVoltar)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFeicash, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelec)
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        interface_usuario tela = new interface_usuario(cliente);
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
            String cpf = cliente.getCpf();
            
            ResultSet rs2 = funcao.buscarInfosClientes(cpf);
            String lista = "";
            while (rs2.next()) {
                lista = "NOME: " + rs2.getString("NOME") + "\nCPF: " + rs2.getString("CPF") + "\nSALDO ATUAL: R$ " + String.format("%.2f", rs2.getDouble("SALDO"))+"\n";
            }
           

            ResultSet rs = funcao.buscarCashbackPorCPF(cpf);
            // formata????o da data para o print
            SimpleDateFormat simpDate = new SimpleDateFormat("dd-MM-yyyy");

            while (rs.next()) {
                lista = lista + "DATA: " + rs.getDate("DATA")+" "+rs.getTime("HORA") + "   " + rs.getString("STATUS")+ "   ";
                lista = lista + String.format("%.2f", rs.getDouble("CASHBACK")) + "\tSALDO: R$ " + String.format("%.2f", rs.getDouble("SALDO"))+"\n";
            }
            areaResultados.setText(lista);
            String s = "Extrato cashback encontrado!";
            JOptionPane.showMessageDialog(null, s, "Informa????o: Extrato Carregado.", JOptionPane.INFORMATION_MESSAGE);
            
        } catch( SQLException e) {
            String s = "Consulta n??o foi poss??vel " + e.getMessage();
            JOptionPane.showMessageDialog(null, s, "Erro na busca do cliente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(interface_extrato_cashback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_extrato_cashback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_extrato_cashback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_extrato_cashback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_extrato_cashback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultados;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFeicash;
    private javax.swing.JLabel lblSelec;
    // End of variables declaration//GEN-END:variables
}
