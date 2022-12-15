
package visao;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDesktop = new javax.swing.JPanel();
        JBCriar_Conta = new javax.swing.JButton();
        JBRemover_Conta = new javax.swing.JButton();
        JBAlterar_Conta = new javax.swing.JButton();
        JBMostrar_Contas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agência 1027");

        JBCriar_Conta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBCriar_Conta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/create.png"))); // NOI18N
        JBCriar_Conta.setText("Criar Conta");
        JBCriar_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCriar_ContaActionPerformed(evt);
            }
        });

        JBRemover_Conta.setText("Remover Conta");

        JBAlterar_Conta.setText("Alterar Conta");

        JBMostrar_Contas.setText("Mostrar Contas");

        javax.swing.GroupLayout jpDesktopLayout = new javax.swing.GroupLayout(jpDesktop);
        jpDesktop.setLayout(jpDesktopLayout);
        jpDesktopLayout.setHorizontalGroup(
            jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDesktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCriar_Conta)
                .addGap(18, 18, 18)
                .addGroup(jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBMostrar_Contas)
                    .addGroup(jpDesktopLayout.createSequentialGroup()
                        .addComponent(JBRemover_Conta)
                        .addGap(18, 18, 18)
                        .addComponent(JBAlterar_Conta)))
                .addGap(38, 38, 38))
        );
        jpDesktopLayout.setVerticalGroup(
            jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDesktopLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCriar_Conta)
                    .addComponent(JBRemover_Conta)
                    .addComponent(JBAlterar_Conta))
                .addGap(49, 49, 49)
                .addComponent(JBMostrar_Contas)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCriar_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCriar_ContaActionPerformed
        // TODO add your handling code here:
        FormPadrao formulario = new FormPadrao();
        jpDesktop.add(formulario);
        formulario.setVisible(true);
        
    }//GEN-LAST:event_JBCriar_ContaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar_Conta;
    private javax.swing.JButton JBCriar_Conta;
    private javax.swing.JButton JBMostrar_Contas;
    private javax.swing.JButton JBRemover_Conta;
    private javax.swing.JPanel jpDesktop;
    // End of variables declaration//GEN-END:variables
}