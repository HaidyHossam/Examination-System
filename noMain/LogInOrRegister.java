/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noMain;

import examinationsystem.Instructor;
import examinationsystem.Student;
import examinationsystem.admin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author Yatta
 */

public class LogInOrRegister extends javax.swing.JFrame {

    /**
     * Creates new form LogInOrRegister
     */
    public static boolean check = true;
    public LogInOrRegister() {

        initComponents();
        lbl_u.setVisible(false);
        lbl_p.setVisible(false);
        lbl_u1.setVisible(false);
        lbl_u2.setVisible(false);
        lbl_u3.setVisible(false);
        lbl_u4.setVisible(false);
        lbl_u5.setVisible(false);
        lbl_u6.setVisible(false);
        lbl_u7.setVisible(false);
        jLabel11.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Register_pnl = new javax.swing.JPanel();
        L_GInfo_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        L_Name_txt = new javax.swing.JTextField();
        L_Phone_txt = new javax.swing.JTextField();
        L_Address_txt = new javax.swing.JTextField();
        L_Email_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        L_age_txt = new javax.swing.JTextField();
        lbl_u1 = new javax.swing.JLabel();
        lbl_u2 = new javax.swing.JLabel();
        lbl_u3 = new javax.swing.JLabel();
        lbl_u4 = new javax.swing.JLabel();
        lbl_u5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        L_LogInfo_pnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        L_RUser_txt = new javax.swing.JTextField();
        L_RPass_txt = new javax.swing.JPasswordField();
        lbl_u6 = new javax.swing.JLabel();
        lbl_u7 = new javax.swing.JLabel();
        L_LogIn_pnl = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        L_LUser_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        L_logIn_btn = new javax.swing.JButton();
        L_LPass_txt = new javax.swing.JPasswordField();
        lbl_u = new javax.swing.JLabel();
        lbl_p = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        L_ISA_jCombo = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        L_RegAs_cmbo = new javax.swing.JComboBox();
        L_Sign_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Register_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registeration"));

        L_GInfo_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "General Info"));

        jLabel1.setText("Name:");

        jLabel6.setText("Address:");

        jLabel2.setText("Phone:");

        jLabel3.setText("Email: ");

        jLabel12.setText("Age:");

        lbl_u1.setText("*");

        lbl_u2.setText("*");

        lbl_u3.setText("*");

        lbl_u4.setText("*");

        lbl_u5.setText("*");

        jLabel11.setText("Phone Number can only be integers.");

        javax.swing.GroupLayout L_GInfo_pnlLayout = new javax.swing.GroupLayout(L_GInfo_pnl);
        L_GInfo_pnl.setLayout(L_GInfo_pnlLayout);
        L_GInfo_pnlLayout.setHorizontalGroup(
            L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                        .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                                .addComponent(L_Address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_u3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L_Email_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(L_age_txt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_u4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_u5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                        .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(L_Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_u1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(L_Phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_u2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, Short.MAX_VALUE))
                    .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        L_GInfo_pnlLayout.setVerticalGroup(
            L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_GInfo_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(L_Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u1))
                .addGap(18, 18, 18)
                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_u2)
                    .addComponent(L_Phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(L_Address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(L_Email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u4))
                .addGap(13, 13, 13)
                .addGroup(L_GInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_u5))
                .addContainerGap())
        );

        L_LogInfo_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Logging in Info"));

        jLabel4.setText("UserName:");

        jLabel5.setText("Password:");

        lbl_u6.setText("*");

        lbl_u7.setText("*");

        javax.swing.GroupLayout L_LogInfo_pnlLayout = new javax.swing.GroupLayout(L_LogInfo_pnl);
        L_LogInfo_pnl.setLayout(L_LogInfo_pnlLayout);
        L_LogInfo_pnlLayout.setHorizontalGroup(
            L_LogInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L_LogInfo_pnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(L_LogInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(L_LogInfo_pnlLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_RUser_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addGroup(L_LogInfo_pnlLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_RPass_txt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(L_LogInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_u6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        L_LogInfo_pnlLayout.setVerticalGroup(
            L_LogInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_LogInfo_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_LogInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(L_RUser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u6))
                .addGap(18, 18, 18)
                .addGroup(L_LogInfo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(L_RPass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u7))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout L_Register_pnlLayout = new javax.swing.GroupLayout(L_Register_pnl);
        L_Register_pnl.setLayout(L_Register_pnlLayout);
        L_Register_pnlLayout.setHorizontalGroup(
            L_Register_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_Register_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_GInfo_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(L_LogInfo_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        L_Register_pnlLayout.setVerticalGroup(
            L_Register_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_Register_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_Register_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L_LogInfo_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_GInfo_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        L_LogIn_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Logging in"));

        jLabel8.setText("UserName:");

        jLabel9.setText("Password");

        L_logIn_btn.setText("Log in");
        L_logIn_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_logIn_btnActionPerformed(evt);
            }
        });

        lbl_u.setText("*");

        lbl_p.setText("*");

        jLabel13.setText("Login as:");

        L_ISA_jCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Instructor", "Student", "Admin" }));

        javax.swing.GroupLayout L_LogIn_pnlLayout = new javax.swing.GroupLayout(L_LogIn_pnl);
        L_LogIn_pnl.setLayout(L_LogIn_pnlLayout);
        L_LogIn_pnlLayout.setHorizontalGroup(
            L_LogIn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_LogIn_pnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(L_LogIn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(L_LogIn_pnlLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_LUser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(L_LogIn_pnlLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(L_LPass_txt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(L_LogIn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(L_LogIn_pnlLayout.createSequentialGroup()
                        .addComponent(lbl_p)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_ISA_jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L_logIn_btn)
                        .addGap(50, 50, 50))
                    .addGroup(L_LogIn_pnlLayout.createSequentialGroup()
                        .addComponent(lbl_u, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        L_LogIn_pnlLayout.setVerticalGroup(
            L_LogIn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_LogIn_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_LogIn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(L_LUser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u))
                .addGap(18, 18, 18)
                .addGroup(L_LogIn_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(L_logIn_btn)
                    .addComponent(L_LPass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_p)
                    .addComponent(jLabel13)
                    .addComponent(L_ISA_jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Don't have an account? Register now!");

        jLabel10.setText("Register as:");

        L_RegAs_cmbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Instructor" }));

        L_Sign_btn.setText("Sign up");
        L_Sign_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_Sign_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_LogIn_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Register_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L_RegAs_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_Sign_btn)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_LogIn_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(L_RegAs_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_Register_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(L_Sign_btn)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L_Sign_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_Sign_btnActionPerformed
        // TODO add your handling code here:
        Instructor Ins = new Instructor();
        Student Std = new Student();
        String Name = L_Name_txt.getText();
        String Phone = L_Phone_txt.getText();
        String Address = L_Address_txt.getText();
        String Email = L_Email_txt.getText();
        String Age = L_age_txt.getText();
        String Username = L_RUser_txt.getText();
        String Pass = L_RPass_txt.getText();
        if (L_RegAs_cmbo.getSelectedItem().equals("Student")) {

            try {
                int phone = Integer.valueOf(L_Phone_txt.getText());
                if (Std.CheckEmail(Email)) {
                    if (Std.CheckUserName(Name, Phone, Address, Email, Age, Username, Pass, "Students.txt", "Notification.txt")) {
                        JOptionPane.showMessageDialog(this, "Successful Registertion.");
                        L_Address_txt.setText(null);
                        L_Email_txt.setText(null);
                        L_Name_txt.setText(null);
                        L_LPass_txt.setText(null);
                        L_LUser_txt.setText(null);
                        L_age_txt.setText(null);
                        L_Phone_txt.setText(null);
                        L_RUser_txt.setText(null);
                        L_RPass_txt.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(this, "This Username is already used.Please enter another Username.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please write your email in a write format.");
                }
            } catch (NumberFormatException e) {
                jLabel11.setVisible(true);
                if (L_Name_txt.getText().equals("")) {
                    lbl_u1.setVisible(true);
                }
                if (L_Phone_txt.getText().equals("")) {
                    lbl_u2.setVisible(true);
                }
                if (L_Address_txt.getText().equals("")) {
                    lbl_u3.setVisible(true);
                }
                if (L_Email_txt.getText().equals("")) {
                    lbl_u4.setVisible(true);
                }
                if (L_age_txt.getText().equals("")) {
                    lbl_u5.setVisible(true);
                }
                if (L_LUser_txt.getText().equals("")) {
                    lbl_u6.setVisible(true);
                }
                if (L_LPass_txt.getText().equals("")) {
                    lbl_u7.setVisible(true);
                }
            }

        } else if (L_RegAs_cmbo.getSelectedItem().equals("Instructor")) {
            try {
                int phone = Integer.valueOf(L_Phone_txt.getText());
                if (Ins.CheckEmail(Email)) {

                    if (Ins.CheckUserName(Name, Phone, Address, Email, Age, Username, Pass, "Instructors.txt", "Notification.txt")) {
                        JOptionPane.showMessageDialog(this, "Successful Registertion.");
                        L_Address_txt.setText(null);
                        L_Email_txt.setText(null);
                        L_Name_txt.setText(null);
                        L_LPass_txt.setText(null);
                        L_LUser_txt.setText(null);
                        L_age_txt.setText(null);
                        L_Phone_txt.setText(null);
                        L_RUser_txt.setText(null);
                        L_RPass_txt.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(this, "This Username is already used.Please enter another Username.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please write your email in a write format.");
                }

            } catch (NumberFormatException e) {
                jLabel11.setVisible(true);
                if (L_Name_txt.getText().equals("")) {
                    lbl_u1.setVisible(true);
                }
                if (L_Phone_txt.getText().equals("")) {
                    lbl_u2.setVisible(true);
                }
                if (L_Address_txt.getText().equals("")) {
                    lbl_u3.setVisible(true);
                }
                if (L_Email_txt.getText().equals("")) {
                    lbl_u4.setVisible(true);
                }
                if (L_age_txt.getText().equals("")) {
                    lbl_u5.setVisible(true);
                }
                if (L_LUser_txt.getText().equals("")) {
                    lbl_u6.setVisible(true);
                }
                if (L_LPass_txt.getText().equals("")) {
                    lbl_u7.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_L_Sign_btnActionPerformed

    private void L_logIn_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_logIn_btnActionPerformed

        // TODO add your handling code here:
        lbl_u.setVisible(false);
        lbl_p.setVisible(false);
        if (L_LUser_txt.getText().equals("")) {
            lbl_u.setVisible(true);
        }
        if (L_LPass_txt.getText().equals("")) {
            lbl_p.setVisible(true);
        }

        Instructor insClass = new Instructor();
        Student stdClass = new Student();
        admin adminClass = new admin();

        Admin adminForm = new Admin();

        String UserName = L_LUser_txt.getText();
        String Password = L_LPass_txt.getText();
       

        if (L_ISA_jCombo.getSelectedItem().equals("Instructor")) {
            if (insClass.LogIn(UserName, Password, "Instructor.txt")) {
                this.hide();
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader("Instructor.txt"));
                    String line = br.readLine();
                    ArrayList<String> courses = new ArrayList<String>();
                    while (line != null) {
                        String myarr[] = line.split(Pattern.quote("|"));

                        if (L_LUser_txt.getText().equals(myarr[0])) {
                            for (int i = 7; i < myarr.length; i++) {
                                courses.add(myarr[i]);
                            }
                            break;
                        } else {
                            line = br.readLine();
                        }
                    }
                    insClass.setCourses(courses);
                    br.close();
                } catch (IOException e) {
                    System.out.println("IO error");
                }
                instructor insForm = new instructor(insClass);
                insForm.show();
            } else {
                JOptionPane.showMessageDialog(this, "UserNAme or Password Incorrect !!!, Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } else if (L_ISA_jCombo.getSelectedItem().equals("Student")) {

            if (stdClass.LogIn(UserName, Password, "Students.txt")) {
                this.hide();
                Studentt stdForm = new Studentt(stdClass);
                stdForm.show();
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password Incorrect !!!, Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
            }

        } else if (L_ISA_jCombo.getSelectedItem().equals("Admin")) {
            if (adminClass.LogInAdmin(UserName, Password)) {
                this.hide();
                adminForm.show();
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password Incorrect !!!, Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_L_logIn_btnActionPerformed

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
            java.util.logging.Logger.getLogger(LogInOrRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInOrRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInOrRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInOrRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInOrRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L_Address_txt;
    private javax.swing.JTextField L_Email_txt;
    private javax.swing.JPanel L_GInfo_pnl;
    private javax.swing.JComboBox<String> L_ISA_jCombo;
    private javax.swing.JPasswordField L_LPass_txt;
    private javax.swing.JTextField L_LUser_txt;
    private javax.swing.JPanel L_LogIn_pnl;
    private javax.swing.JPanel L_LogInfo_pnl;
    private javax.swing.JTextField L_Name_txt;
    private javax.swing.JTextField L_Phone_txt;
    private javax.swing.JPasswordField L_RPass_txt;
    private javax.swing.JTextField L_RUser_txt;
    private javax.swing.JComboBox L_RegAs_cmbo;
    private javax.swing.JPanel L_Register_pnl;
    private javax.swing.JButton L_Sign_btn;
    private javax.swing.JTextField L_age_txt;
    private javax.swing.JButton L_logIn_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_p;
    private javax.swing.JLabel lbl_u;
    private javax.swing.JLabel lbl_u1;
    private javax.swing.JLabel lbl_u2;
    private javax.swing.JLabel lbl_u3;
    private javax.swing.JLabel lbl_u4;
    private javax.swing.JLabel lbl_u5;
    private javax.swing.JLabel lbl_u6;
    private javax.swing.JLabel lbl_u7;
    // End of variables declaration//GEN-END:variables
}
