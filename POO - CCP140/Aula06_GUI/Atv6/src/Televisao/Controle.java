package Televisao;
import  javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Set;

public class Controle extends javax.swing.JFrame {
    // Objeto para usar as funções da classe televisão
    private Televisao televisao;
    
    public Controle() {
        initComponents();
        televisao = new Televisao(1,0,false);
        cmbxTransmissao.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volume = new javax.swing.ButtonGroup();
        sistema = new javax.swing.ButtonGroup();
        btnAumentar1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        canal = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        btnLigarDesligar = new javax.swing.JButton();
        progressbarVolume = new javax.swing.JProgressBar();
        lblVolume = new javax.swing.JLabel();
        cmbxTransmissao = new javax.swing.JComboBox<>();
        lblTransmissao = new javax.swing.JLabel();
        btnAumentarVolume = new javax.swing.JButton();
        btnDiminuirCanal = new javax.swing.JButton();
        txtCanal = new javax.swing.JTextField();
        lblCanal = new javax.swing.JLabel();
        btnConfirmarCanal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCanalVisu = new javax.swing.JLabel();
        btnAumentarCanal = new javax.swing.JButton();
        btnDiminuirVolume = new javax.swing.JButton();
        pnlSistema = new javax.swing.JPanel();

        btnAumentar1.setBackground(new java.awt.Color(240, 250, 240));
        btnAumentar1.setForeground(new java.awt.Color(0, 0, 255));
        btnAumentar1.setText("Aumentar");
        volume.add(btnAumentar1);
        btnAumentar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLigarDesligar.setBackground(new java.awt.Color(255, 0, 0));
        btnLigarDesligar.setText("POWER");
        sistema.add(btnLigarDesligar);
        btnLigarDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarDesligarActionPerformed(evt);
            }
        });

        progressbarVolume.setForeground(new java.awt.Color(0, 255, 0));
        progressbarVolume.setMaximum(10);

        lblVolume.setText("VOLUME");

        cmbxTransmissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cmbxTransmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTransmissaoActionPerformed(evt);
            }
        });

        lblTransmissao.setText("Estado de Transmissão");

        btnAumentarVolume.setBackground(new java.awt.Color(240, 250, 240));
        btnAumentarVolume.setForeground(new java.awt.Color(0, 0, 255));
        btnAumentarVolume.setText("Aumentar");
        volume.add(btnAumentarVolume);
        btnAumentarVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarVolumeActionPerformed(evt);
            }
        });

        btnDiminuirCanal.setForeground(new java.awt.Color(255, 0, 0));
        btnDiminuirCanal.setText("Diminuir");
        canal.add(btnDiminuirCanal);
        btnDiminuirCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirCanalActionPerformed(evt);
            }
        });

        lblCanal.setText("CANAL");

        btnConfirmarCanal.setBackground(new java.awt.Color(0, 240, 0));
        btnConfirmarCanal.setText("Confirmar");
        btnConfirmarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCanalActionPerformed(evt);
            }
        });

        lblCanalVisu.setBackground(new java.awt.Color(0, 0, 0));
        lblCanalVisu.setText("///");

        btnAumentarCanal.setBackground(new java.awt.Color(240, 250, 240));
        btnAumentarCanal.setForeground(new java.awt.Color(0, 0, 255));
        btnAumentarCanal.setText("Aumentar");
        btnAumentarCanal.setBorderPainted(false);
        canal.add(btnAumentarCanal);
        btnAumentarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarCanalActionPerformed(evt);
            }
        });

        btnDiminuirVolume.setForeground(new java.awt.Color(255, 0, 0));
        btnDiminuirVolume.setText("Diminuir");
        volume.add(btnDiminuirVolume);
        btnDiminuirVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirVolumeActionPerformed(evt);
            }
        });

        pnlSistema.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSistemaLayout = new javax.swing.GroupLayout(pnlSistema);
        pnlSistema.setLayout(pnlSistemaLayout);
        pnlSistemaLayout.setHorizontalGroup(
            pnlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        pnlSistemaLayout.setVerticalGroup(
            pnlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCanal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirmarCanal)
                                .addGap(129, 141, Short.MAX_VALUE)))
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)
                        .addGap(4, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCanal)
                                .addGap(18, 18, 18)
                                .addComponent(lblCanalVisu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLigarDesligar)
                                        .addGap(26, 26, 26)
                                        .addComponent(pnlSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAumentarCanal)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDiminuirCanal))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblVolume))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btnDiminuirVolume))
                            .addComponent(btnAumentarVolume)
                            .addComponent(cmbxTransmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTransmissao)
                            .addComponent(progressbarVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLigarDesligar)
                    .addComponent(pnlSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCanal)
                    .addComponent(lblCanalVisu)
                    .addComponent(btnAumentarCanal)
                    .addComponent(btnDiminuirCanal))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmarCanal)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVolume)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAumentarVolume)
                    .addComponent(btnDiminuirVolume))
                .addGap(14, 14, 14)
                .addComponent(progressbarVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTransmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbxTransmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAumentarVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarVolumeActionPerformed
        // TODO add your handling code here:
        boolean sistema = televisao.getLigada();
        if (sistema == true){ 
            televisao.aumentarVolume();
            int volume = televisao.getSom();
            progressbarVolume.setValue(volume);
            if (volume == 10){
                    String s = "Não é possível aumentar o volume.\n"
                            + "Volume 10 selecionado.";
                    JOptionPane.showMessageDialog(null, s, "Atenção: Volume máximo.", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAumentarVolumeActionPerformed

    private void btnDiminuirCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirCanalActionPerformed
        // TODO add your handling code here:
        boolean sistema = televisao.getLigada();
        if (sistema == true){ 
            boolean cond = televisao.descerCanal();
            if(cond==false){
                String s = "O menor canal é o 1.\n"
                            + "Não houve alteracao.";
                JOptionPane.showMessageDialog(null, s, "Atenção: Canal minimo atingido", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                int output = televisao.getCanal();
                //System.out.println(output);
                lblCanalVisu.setText(String.valueOf(output));
            } 
        }
    }//GEN-LAST:event_btnDiminuirCanalActionPerformed

    private void btnConfirmarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCanalActionPerformed
        // TODO add your handling code here:
        boolean sistema = televisao.getLigada();
        if (sistema == true){    
            int canal = Integer.parseInt(txtCanal.getText());
            if (canal > 64){
                String s = "O maior canal é o 64.\n"
                        + "Canal 64 selecionado.";
                JOptionPane.showMessageDialog(null, s, "Atenção: Canal inexistente.", JOptionPane.PLAIN_MESSAGE);
                lblCanalVisu.setText("64");
                televisao.setCanal(64);
                }
            else if(canal < 1){
                String s = "O menor canal é o 1.\n"
                        + "Canal 1 selecionado.";
                JOptionPane.showMessageDialog(null, s, "Atenção: Canal inexistente.", JOptionPane.PLAIN_MESSAGE);

                lblCanalVisu.setText("1");
                televisao.setCanal(1);
            }
            else{
                televisao.setCanal(canal);
                String canal_s = String.valueOf(canal);
                lblCanalVisu.setText(canal_s);
                }
        }
    }//GEN-LAST:event_btnConfirmarCanalActionPerformed

    private void btnLigarDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigarDesligarActionPerformed
        // TODO add your handling code here:
        if(televisao.LigaOuDesligaTV()){
            pnlSistema.setBackground(Color.green);
            lblCanalVisu.setText("1");
            progressbarVolume.setValue(0);
            cmbxTransmissao.setSelectedIndex(24);
            
        }
        else{
            pnlSistema.setBackground(Color.black);
            lblCanalVisu.setText("///");
            progressbarVolume.setValue(0);
            cmbxTransmissao.setSelectedIndex(-1);
        }    

        
    }//GEN-LAST:event_btnLigarDesligarActionPerformed

    private void cmbxTransmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTransmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTransmissaoActionPerformed

    private void btnAumentar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAumentar1ActionPerformed

    private void btnAumentarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarCanalActionPerformed
        boolean sistema = televisao.getLigada();
        if (sistema == true){
            boolean cond = televisao.subirCanal();
            if(cond==false){
                String s = "O maior canal é o 64.\n"
                            + "Não houve alteracao.";
                JOptionPane.showMessageDialog(null, s, "Atenção: Canal máximo atingido", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                int output = televisao.getCanal();
                //System.out.println(output);
                lblCanalVisu.setText(String.valueOf(output));
            }
        }
    }//GEN-LAST:event_btnAumentarCanalActionPerformed

    private void btnDiminuirVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirVolumeActionPerformed
        // TODO add your handling code here:
        boolean sistema = televisao.getLigada();
        if (sistema == true){
            televisao.diminuirVolume();
            int volume = televisao.getSom();
            progressbarVolume.setValue(volume);
            if (volume == 0){
                    String s = "Não é possível diminuir o volume.\n"
                            + "Volume 0 selecionado.";
                    JOptionPane.showMessageDialog(null, s, "Atenção: Volume minimo.", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDiminuirVolumeActionPerformed

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
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentar1;
    private javax.swing.JButton btnAumentarCanal;
    private javax.swing.JButton btnAumentarVolume;
    private javax.swing.JButton btnConfirmarCanal;
    private javax.swing.JButton btnDiminuirCanal;
    private javax.swing.JButton btnDiminuirVolume;
    private javax.swing.JButton btnLigarDesligar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup canal;
    private javax.swing.JComboBox<String> cmbxTransmissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCanal;
    private javax.swing.JLabel lblCanalVisu;
    private javax.swing.JLabel lblTransmissao;
    private javax.swing.JLabel lblVolume;
    private java.awt.Panel panel1;
    private javax.swing.JPanel pnlSistema;
    private javax.swing.JProgressBar progressbarVolume;
    private javax.swing.ButtonGroup sistema;
    private javax.swing.JTextField txtCanal;
    private javax.swing.ButtonGroup volume;
    // End of variables declaration//GEN-END:variables
}
