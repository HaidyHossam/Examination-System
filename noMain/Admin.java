/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noMain;

import examinationsystem.ExamSession;
import examinationsystem.admin;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    String UserName = "";
    String Password = "";
    String name = "";
    String phone = "";
    String Address = "";
    String Mail = "";
    String age = "";
    String TypeUser = "";
    ArrayList<String> usernames = new ArrayList<String>();
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();
    ArrayList<String> phones = new ArrayList<String>();
    ArrayList<String> addresses = new ArrayList<String>();
    ArrayList<String> mails = new ArrayList<String>();
    ArrayList<String> ages = new ArrayList<String>();
    ArrayList<String> types = new ArrayList<String>();

    public Admin() {
        initComponents();
        A_Noti_pnl.hide();
        A_Noti2_pnl.hide();
        try {
            BufferedReader br = new BufferedReader(new FileReader("ExamIDS.txt"));
            String line = br.readLine();
            while (line != null) {
                A_ExamIDs_cmbo.addItem(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IO Error");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A_AC_tab = new javax.swing.JTabbedPane();
        A_Exam_pnl = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        A_ExamIDs_cmbo = new javax.swing.JComboBox();
        A_Submit_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        A_Noti2_pnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        A_Noti_pnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        A_Clear_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        A_OOP_chk = new javax.swing.JCheckBox();
        A_OR_chk = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        A_Stat_chk = new javax.swing.JCheckBox();
        A_Eth_chk = new javax.swing.JCheckBox();
        A_math_chk = new javax.swing.JCheckBox();
        A_file_chk = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        A_Assign_btn = new javax.swing.JButton();
        A_Username_cmbo = new javax.swing.JComboBox();
        A_LogOut_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        A_Refresh_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Exam IDs:");

        A_Submit_btn.setText("Submit");
        A_Submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_Submit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_Exam_pnlLayout = new javax.swing.GroupLayout(A_Exam_pnl);
        A_Exam_pnl.setLayout(A_Exam_pnlLayout);
        A_Exam_pnlLayout.setHorizontalGroup(
            A_Exam_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Exam_pnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A_ExamIDs_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_Exam_pnlLayout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addComponent(A_Submit_btn)
                .addContainerGap())
        );
        A_Exam_pnlLayout.setVerticalGroup(
            A_Exam_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Exam_pnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(A_Exam_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(A_ExamIDs_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(A_Submit_btn)
                .addContainerGap())
        );

        A_AC_tab.addTab("Exam Sessions", A_Exam_pnl);

        A_Noti2_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Notification"));

        jLabel4.setText("There a new Exam was submitted.");

        javax.swing.GroupLayout A_Noti2_pnlLayout = new javax.swing.GroupLayout(A_Noti2_pnl);
        A_Noti2_pnl.setLayout(A_Noti2_pnlLayout);
        A_Noti2_pnlLayout.setHorizontalGroup(
            A_Noti2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Noti2_pnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        A_Noti2_pnlLayout.setVerticalGroup(
            A_Noti2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Noti2_pnlLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        A_Noti_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Notification"));

        jLabel5.setText("A New User was added .");

        javax.swing.GroupLayout A_Noti_pnlLayout = new javax.swing.GroupLayout(A_Noti_pnl);
        A_Noti_pnl.setLayout(A_Noti_pnlLayout);
        A_Noti_pnlLayout.setHorizontalGroup(
            A_Noti_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Noti_pnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        A_Noti_pnlLayout.setVerticalGroup(
            A_Noti_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Noti_pnlLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        A_Clear_btn.setText("Clear");
        A_Clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_Clear_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_Clear_btn)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A_Noti_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_Noti2_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(A_Noti_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(A_Noti2_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(A_Clear_btn)
                .addGap(22, 22, 22))
        );

        A_AC_tab.addTab("Notification", jPanel1);

        A_OOP_chk.setText("OOP");

        A_OR_chk.setText("OR");

        jLabel6.setText("Subjects");

        A_Stat_chk.setText("Statistical Analysis");

        A_Eth_chk.setText("ethics");

        A_math_chk.setText("Math 4");

        A_file_chk.setText("Files");

        jLabel7.setText("UserName:");

        A_Assign_btn.setText("Assign");
        A_Assign_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_Assign_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A_file_chk)
                                    .addComponent(A_math_chk)
                                    .addComponent(A_Eth_chk)
                                    .addComponent(A_Stat_chk)
                                    .addComponent(A_OR_chk)
                                    .addComponent(A_OOP_chk))
                                .addGap(391, 463, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A_Username_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_Assign_btn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(A_Username_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A_OOP_chk)
                .addGap(18, 18, 18)
                .addComponent(A_OR_chk)
                .addGap(18, 18, 18)
                .addComponent(A_Stat_chk)
                .addGap(18, 18, 18)
                .addComponent(A_Eth_chk)
                .addGap(18, 18, 18)
                .addComponent(A_math_chk)
                .addGap(18, 18, 18)
                .addComponent(A_file_chk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_Assign_btn)
                .addContainerGap())
        );

        A_AC_tab.addTab("Assign Course", jPanel2);

        A_LogOut_btn.setText("Logout");
        A_LogOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_LogOut_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Welcome");

        A_Refresh_btn.setText("Refresh");
        A_Refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_Refresh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_Refresh_btn)
                .addGap(18, 18, 18)
                .addComponent(A_LogOut_btn)
                .addContainerGap())
            .addComponent(A_AC_tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_LogOut_btn)
                    .addComponent(jLabel3)
                    .addComponent(A_Refresh_btn))
                .addGap(18, 18, 18)
                .addComponent(A_AC_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A_Refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_Refresh_btnActionPerformed
        // TODO add your handling code here:
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("Notification.txt"));
            String line = br.readLine();
            if (line != null) {

                A_Noti_pnl.show();

            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO error");
        }

        try {
            br = new BufferedReader(new FileReader("ExamIDs.txt"));
            String line = br.readLine();
            if (line != null) {

                A_Noti2_pnl.show();

            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO error");
        }

        String Line = "";
        BufferedReader Br = null;
        try {
            Br = new BufferedReader(new FileReader("Notification.txt"));
            Line = Br.readLine();
            while (Line != null) {
                String arr[] = Line.split(Pattern.quote("|"));
                UserName = arr[0];
                usernames.add(UserName);
                Password = arr[1];
                passwords.add(Password);
                name = arr[2];
                names.add(name);
                phone = arr[3];
                phones.add(phone);
                Address = arr[4];
                addresses.add(Address);
                Mail = arr[5];
                mails.add(Mail);
                age = arr[6];
                ages.add(age);
                TypeUser = arr[7];
                types.add(TypeUser);
                Line = Br.readLine();
            }

        } catch (IOException e) {
            System.out.println("");

        }
        for (int i = 0; i < usernames.size(); i++) {
            A_Username_cmbo.addItem(usernames.get(i));
        }
    }//GEN-LAST:event_A_Refresh_btnActionPerformed

    private void A_Clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_Clear_btnActionPerformed
        // TODO add your handling code here:
        A_Noti_pnl.hide();
        A_Noti2_pnl.hide();
    }//GEN-LAST:event_A_Clear_btnActionPerformed

    private void A_Assign_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_Assign_btnActionPerformed
        // TODO add your handling code here:
        ArrayList<String> courses = new ArrayList();
        try {
            String ExamID = A_Username_cmbo.getSelectedItem().toString();
            Boolean Eth = A_Eth_chk.isSelected();
            if (A_OOP_chk.isSelected()) {
                courses.add(A_OOP_chk.getText());
            }
            if (A_OR_chk.isSelected()) {
                courses.add(A_OR_chk.getText());
            }
            if (A_Stat_chk.isSelected()) {
                courses.add(A_Stat_chk.getText());
            }
            if (A_Eth_chk.isSelected()) {
                courses.add(A_Eth_chk.getText());
            }
            if (A_math_chk.isSelected()) {
                courses.add(A_math_chk.getText());
            }
            if (A_file_chk.isSelected()) {
                courses.add(A_file_chk.getText());
            }

            for (int i = 0; i < usernames.size(); i++) {
                if (types.get(i).equals("S")) {
                    admin A = new admin();
                    if (A_Username_cmbo.getSelectedItem().toString() == usernames.get(i)) {
                        A.Register(names.get(i), phones.get(i), addresses.get(i), mails.get(i), ages.get(i), usernames.get(i), passwords.get(i), "Students.txt", courses);
                        JOptionPane.showMessageDialog(this, "Successful Assigning.");
                    }
                }
            }

            for (int i = 0; i < usernames.size(); i++) {
                if (types.get(i).equals("I")) {
                    admin A = new admin();
                    if (A_Username_cmbo.getSelectedItem().toString() == usernames.get(i)) {
                        A.Register(names.get(i), phones.get(i), addresses.get(i), mails.get(i), ages.get(i), usernames.get(i), passwords.get(i), "Instructor.txt", courses);
                        JOptionPane.showMessageDialog(this, "Successful Assigning.");
                    }
                }
            }
            String user = A_Username_cmbo.getSelectedItem().toString();
            A_Username_cmbo.removeItem(user);
            A_OOP_chk.setSelected(false);
            A_OR_chk.setSelected(false);
            A_math_chk.setSelected(false);
            A_file_chk.setSelected(false);
            A_Eth_chk.setSelected(false);
            A_Stat_chk.setSelected(false);
            try {
                PrintWriter WR = new PrintWriter("Notification.txt");
                WR.print("");
                WR.close();
            } catch (FileNotFoundException e) {
                System.out.println("noMain.Admin.A_Assign_btnActionPerformed()");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "there's no username selected","Error",JOptionPane.ERROR_MESSAGE);
        } catch (Throwable NE) {
            JOptionPane.showMessageDialog(this, "You have to at least select one course","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_A_Assign_btnActionPerformed

    private void A_Submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_Submit_btnActionPerformed
        // TODO add your handling code here:
        try {
            String ExamID = A_ExamIDs_cmbo.getSelectedItem().toString();
            ExamSession Current = new ExamSession();

            ArrayList<String> H = new ArrayList<>();
            H = Current.Inform_Students(ExamID);
            Current.Save_ExamFile(ExamID, H);
            A_ExamIDs_cmbo.removeItem(ExamID);
            try {
                PrintWriter WR = new PrintWriter("ExamIDS.txt");
                WR.print("");
                WR.close();
            } catch (FileNotFoundException e) {
                System.out.println("noMain.Admin.A_Assign_btnActionPerformed()");
            }
            JOptionPane.showMessageDialog(this, "Submitted Succesfully", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "there's no exam id selected","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_A_Submit_btnActionPerformed

    private void A_LogOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_LogOut_btnActionPerformed
        // TODO add your handling code here:
        LogInOrRegister LOG = new LogInOrRegister();
        this.hide();
        LOG.show();
    }//GEN-LAST:event_A_LogOut_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane A_AC_tab;
    private javax.swing.JButton A_Assign_btn;
    private javax.swing.JButton A_Clear_btn;
    private javax.swing.JCheckBox A_Eth_chk;
    private javax.swing.JComboBox A_ExamIDs_cmbo;
    private javax.swing.JPanel A_Exam_pnl;
    private javax.swing.JButton A_LogOut_btn;
    private javax.swing.JPanel A_Noti2_pnl;
    private javax.swing.JPanel A_Noti_pnl;
    private javax.swing.JCheckBox A_OOP_chk;
    private javax.swing.JCheckBox A_OR_chk;
    private javax.swing.JButton A_Refresh_btn;
    private javax.swing.JCheckBox A_Stat_chk;
    private javax.swing.JButton A_Submit_btn;
    private javax.swing.JComboBox A_Username_cmbo;
    private javax.swing.JCheckBox A_file_chk;
    private javax.swing.JCheckBox A_math_chk;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
