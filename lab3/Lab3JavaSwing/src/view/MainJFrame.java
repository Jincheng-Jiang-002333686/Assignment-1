/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 *
 * @author jincheng
 */
public class MainJFrame extends javax.swing.JFrame {
    
    ImageIcon profilePicture;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TitleJLabel = new javax.swing.JLabel();
        FirstNameJLabel = new javax.swing.JLabel();
        FirstNameJTextField = new javax.swing.JTextField();
        LastNameJLabel = new javax.swing.JLabel();
        LastNameJTextField = new javax.swing.JTextField();
        AgeJLabel = new javax.swing.JLabel();
        AgeJTextField = new javax.swing.JTextField();
        PhoneJLabel = new javax.swing.JLabel();
        PhoneJTextField = new javax.swing.JTextField();
        EmailJLabel = new javax.swing.JLabel();
        EmailJTextField = new javax.swing.JTextField();
        SubmitJButton1 = new javax.swing.JButton();
        GenderJRadioButton1 = new javax.swing.JRadioButton();
        GenderJRadioButton2 = new javax.swing.JRadioButton();
        GenderJRadioButton3 = new javax.swing.JRadioButton();
        GenderJLabel = new javax.swing.JLabel();
        imageJLabel = new javax.swing.JLabel();
        imageJButton = new javax.swing.JButton();
        imgJLabel = new javax.swing.JLabel();
        patientJComboBox = new javax.swing.JComboBox<>();
        patientTypeJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        TitleJLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        TitleJLabel.setText("Registration");

        FirstNameJLabel.setText("First Name:");

        FirstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameJTextFieldActionPerformed(evt);
            }
        });

        LastNameJLabel.setText("Last Name:");

        LastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameJTextFieldActionPerformed(evt);
            }
        });

        AgeJLabel.setText("Age:");

        PhoneJLabel.setText("Phone Number:");

        EmailJLabel.setText("Email:");

        SubmitJButton1.setText("Submit");
        SubmitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitJButton1ActionPerformed(evt);
            }
        });

        buttonGroupGender.add(GenderJRadioButton1);
        GenderJRadioButton1.setText("Male");
        GenderJRadioButton1.setActionCommand("MALE");
        GenderJRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderJRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroupGender.add(GenderJRadioButton2);
        GenderJRadioButton2.setText("Female");
        GenderJRadioButton2.setActionCommand("FEMALE");

        buttonGroupGender.add(GenderJRadioButton3);
        GenderJRadioButton3.setText("Prefer Not to Say");
        GenderJRadioButton3.setActionCommand("Others");

        GenderJLabel.setText("Gender:");

        imageJLabel.setText("Select Image:");

        imageJButton.setText("Upload Photo");
        imageJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageJButtonActionPerformed(evt);
            }
        });

        patientJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));
        patientJComboBox.setSelectedIndex(-1);

        patientTypeJLabel.setText("Patient Type:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PhoneJLabel)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AgeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LastNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FirstNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(GenderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmailJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientTypeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(imageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenderJRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderJRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderJRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FirstNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AgeJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmailJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imageJButton)
                                        .addComponent(patientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                    .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(SubmitJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeJLabel)
                    .addComponent(AgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailJLabel)
                    .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenderJRadioButton1)
                    .addComponent(GenderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenderJRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenderJRadioButton3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientTypeJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imageJButton)
                            .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(SubmitJButton1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameJTextFieldActionPerformed

    private void LastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameJTextFieldActionPerformed

    private void SubmitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitJButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String firstName = this.FirstNameJTextField.getText();
            String lastName = this.LastNameJTextField.getText();
            String age = this.AgeJTextField.getText();
            String phoneNumber = this.PhoneJTextField.getText();
            String email = this.EmailJTextField.getText();
            String gender = this.buttonGroupGender.getSelection().getActionCommand();
            String patientType = this.patientJComboBox.getSelectedItem().toString();


            // userInfo
            String displayMessage = "First Name: " + firstName +
                              "\nLast Name: " + lastName +
                              "\nAge: " + age +
                              "\nPhone Number: " + phoneNumber +
                              "\nEmail: " + email +
                              "\nGender: " + gender +
                              "\nPatientType: " + patientType;

            System.out.println(displayMessage);

            if (imgJLabel.getIcon() != null) {
            // Show the message dialog with text and the icon from imgJLabel
            JOptionPane.showMessageDialog(this, displayMessage, "User Profile", JOptionPane.INFORMATION_MESSAGE, this.profilePicture);
        } else {
            // Show only text information if no image is loaded
            JOptionPane.showMessageDialog(this, displayMessage, "User Profile", JOptionPane.INFORMATION_MESSAGE);
        }
        } 
        catch(NullPointerException ne){
            String errorMessage = "You must enter user Info.";
            JOptionPane.showMessageDialog(this, errorMessage);
        }
        catch(Exception e){
            System.out.println("Exception has occured.");
            System.out.println(e);
        }
    }//GEN-LAST:event_SubmitJButton1ActionPerformed

    private void GenderJRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderJRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderJRadioButton1ActionPerformed

    private void imageJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageJButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
            try{
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                if (edited_image != null){
                    this.imgJLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                }
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_imageJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JTextField AgeJTextField;
    private javax.swing.JLabel EmailJLabel;
    private javax.swing.JTextField EmailJTextField;
    private javax.swing.JLabel FirstNameJLabel;
    private javax.swing.JTextField FirstNameJTextField;
    private javax.swing.JLabel GenderJLabel;
    private javax.swing.JRadioButton GenderJRadioButton1;
    private javax.swing.JRadioButton GenderJRadioButton2;
    private javax.swing.JRadioButton GenderJRadioButton3;
    private javax.swing.JLabel LastNameJLabel;
    private javax.swing.JTextField LastNameJTextField;
    private javax.swing.JLabel PhoneJLabel;
    private javax.swing.JTextField PhoneJTextField;
    private javax.swing.JButton SubmitJButton1;
    private javax.swing.JLabel TitleJLabel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton imageJButton;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> patientJComboBox;
    private javax.swing.JLabel patientTypeJLabel;
    // End of variables declaration//GEN-END:variables
}
