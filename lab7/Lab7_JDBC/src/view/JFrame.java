/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;

/**
 *
 * @author jincheng
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        FormJPanel newFormJPanel = new FormJPanel(bottomjPanel);
        this.bottomjPanel.add(newFormJPanel);
        CardLayout layout = (CardLayout) this.bottomjPanel.getLayout();
        layout.next(bottomjPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topjPanel = new javax.swing.JPanel();
        formjButton = new javax.swing.JButton();
        viewjButton = new javax.swing.JButton();
        bottomjPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        formjButton.setText("Form");
        formjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formjButtonActionPerformed(evt);
            }
        });

        viewjButton.setText("View");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topjPanelLayout = new javax.swing.GroupLayout(topjPanel);
        topjPanel.setLayout(topjPanelLayout);
        topjPanelLayout.setHorizontalGroup(
            topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(formjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                .addComponent(viewjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        topjPanelLayout.setVerticalGroup(
            topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formjButton)
                    .addComponent(viewjButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topjPanel);

        bottomjPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomjPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formjButtonActionPerformed
        // TODO add your handling code here:
        FormJPanel newFormJPanel = new FormJPanel(bottomjPanel);
        this.bottomjPanel.add(newFormJPanel);
        CardLayout layout = (CardLayout) this.bottomjPanel.getLayout();
        layout.next(bottomjPanel);
    }//GEN-LAST:event_formjButtonActionPerformed

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
        ViewJPanel newViewJPanel = new ViewJPanel();
        this.bottomjPanel.add(newViewJPanel);
        CardLayout layout = (CardLayout) this.bottomjPanel.getLayout();
        layout.next(bottomjPanel);
    }//GEN-LAST:event_viewjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomjPanel;
    private javax.swing.JButton formjButton;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topjPanel;
    private javax.swing.JButton viewjButton;
    // End of variables declaration//GEN-END:variables
}
