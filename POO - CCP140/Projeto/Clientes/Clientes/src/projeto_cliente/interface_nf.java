/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_cliente;

import clientes.CadastrarNF;
import clientes.Cliente;
import clientes.DAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author danim
 */
public class interface_nf extends javax.swing.JFrame {
    Cliente cliente;
    CadastrarNF nf;
    private DAO dao;
//    private ButtonGroup tipoCompra;
//    private JLabel lblFeicash;
//    private JLabel lblInfo;
//    private JPanel jPanel1;
//    private JLabel lblNumnota;
//    private JTextField txtNumnota;
//    private JLabel lblValcompra;
//    private JTextField txtValcompra;
//    private JLabel lblTipocompra;
//    private JRadioButton rbtOnline;
//    private JRadioButton rbtLojaFisica;
//    private JButton btnConfirma;
//    private JButton btnVoltar;
    /**
     * Creates new form interface_nf
     */
    public interface_nf(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        dao = new DAO();
    }

    private interface_nf() {
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

        tipoCompra = new javax.swing.ButtonGroup();
        lblFeicash = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNumnota = new javax.swing.JLabel();
        txtNumnota = new javax.swing.JTextField();
        lblValcompra = new javax.swing.JLabel();
        txtValcompra = new javax.swing.JTextField();
        lblTipocompra = new javax.swing.JLabel();
        rbtOnline = new javax.swing.JRadioButton();
        rbtLojaFisica = new javax.swing.JRadioButton();
        btnConfirma = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFeicash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFeicash.setForeground(new java.awt.Color(0, 0, 240));
        lblFeicash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeicash.setText("FEICASH");
        lblFeicash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 240)));

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInfo.setText("Para cadastrar uma nova Nota Fiscal preencha o seguinte formul??rio:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNumnota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumnota.setText("Numero da Nota:");

        txtNumnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumnotaActionPerformed(evt);
            }
        });

        lblValcompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValcompra.setText("Valor da Compra:");

        lblTipocompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipocompra.setText("Tipo de Compra:");

        tipoCompra.add(rbtOnline);
        rbtOnline.setText("Online");
        rbtOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOnlineActionPerformed(evt);
            }
        });

        tipoCompra.add(rbtLojaFisica);
        rbtLojaFisica.setText("Loja F??sica ");

        btnConfirma.setText("Confirma");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipocompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtOnline)
                                .addGap(18, 18, 18)
                                .addComponent(rbtLojaFisica))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConfirma)
                                .addGap(59, 59, 59)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumnota)
                            .addComponent(lblValcompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumnota)
                            .addComponent(txtValcompra))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumnota)
                    .addComponent(txtNumnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValcompra)
                    .addComponent(txtValcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipocompra)
                    .addComponent(rbtOnline)
                    .addComponent(rbtLojaFisica))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFeicash, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFeicash, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumnotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumnotaActionPerformed

    private void rbtOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtOnlineActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        interface_usuario tela = new interface_usuario(cliente);
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        
        String numNota = txtNumnota.getText();
        
        
        
        //data        
//        long millis = System.currentTimeMillis();
//        java.sql.Date sqlDate = new java.sql.Date(millis);
//        java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
//        final String stringDate = dateFormat.format(utilDate);        
//        Date data = sqlDate;
        
        String valor = txtValcompra.getText();
        double valorC = Double.parseDouble(valor);
        String cpf = cliente.getCpf();
        double saldo = cliente.getSaldo();
        nf = new CadastrarNF(cpf,saldo);
        String online;
        double nfSaldo;
        double cashback;
        
        
        if(rbtOnline.isSelected()){
            online = "Sim";
            nfSaldo = nf.CreditarOnline(cpf, saldo, valorC);
            cliente.setSaldo(nfSaldo);
            cashback = nf.CashbackOnline(saldo, valorC);
        }
        else{
            online = "N??o";
            nfSaldo = nf.CreditarFisica(cpf, saldo, valorC);
            cliente.setSaldo(nfSaldo);
            cashback = nf.CashbackFisica(saldo, valorC);
        }
        String status = "+";

        String retorno = dao.inserirNF(numNota, valorC, online, status, nfSaldo, cpf, cashback);
        
        if(retorno == "ok"){
            String s = "Seu saldo ser?? alterado.\n" + "Casback: " + "R$" +cashback;
            JOptionPane.showMessageDialog(null, s, "Informa????o: Nota Fiscal adicionada.", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String s = status;
            JOptionPane.showMessageDialog(null, s, "Erro no cadastro de nota fiscal", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_btnConfirmaActionPerformed

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
            java.util.logging.Logger.getLogger(interface_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_nf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_nf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFeicash;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNumnota;
    private javax.swing.JLabel lblTipocompra;
    private javax.swing.JLabel lblValcompra;
    private javax.swing.JRadioButton rbtLojaFisica;
    private javax.swing.JRadioButton rbtOnline;
    private javax.swing.ButtonGroup tipoCompra;
    private javax.swing.JTextField txtNumnota;
    private javax.swing.JTextField txtValcompra;
    // End of variables declaration//GEN-END:variables
}
