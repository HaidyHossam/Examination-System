package noMain;

import examinationsystem.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Yatta
 */
public class CurrentExam extends javax.swing.JFrame {

    int CorrectCount = 0;
    int min = 0;
    int hour = 0;
    int sec = 15;
    String m, s, h;
    ArrayList<Integer> count = new ArrayList<Integer>();
    ExamSession S;

    Date now = new java.util.Date();

    public CurrentExam(ExamSession S) {
        initComponents();

        Q1.show();
        Q2.hide();
        Q3.hide();
        Q4.hide();
        this.S = S;
        Date EndDate = new Date(S.getCurrentExam().getDate().getYear(), S.getCurrentExam().getDate().getMonth(), S.getCurrentExam().getDate().getDate(), (S.getCurrentExam().getDate().getHours() + S.getCurrentExam().getDuration()), S.getCurrentExam().getDate().getMinutes(), 0);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = now;
            d2 = EndDate;
            formatter.format(d1);
            formatter.format(d2);

            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            s = String.valueOf(diffSeconds);
            long diffMinutes = diff / (60 * 1000) % 60;
            m = String.valueOf(diffMinutes);
            long diffHours = diff / (60 * 60 * 1000) % 24;
            h = String.valueOf(diffHours);

        } catch (Exception e) {
            e.printStackTrace();
        }

        min = Math.abs(Integer.valueOf(m));
        sec = Math.abs(Integer.valueOf(s));
        hour = Math.abs(Integer.valueOf(h));

        C_Choice1_rad.setActionCommand("A");
        C_Choice2_rad.setActionCommand("B");
        C_Choice3_rad.setActionCommand("C");
        C_Choice4_rad.setActionCommand("D");

        C_Choice21_rad.setActionCommand("A");
        C_Choice22_rad.setActionCommand("B");
        C_Choice23_rad.setActionCommand("C");
        C_Choice24_rad.setActionCommand("D");

        C_Choice31_rad.setActionCommand("A");
        C_Choice32_rad.setActionCommand("B");
        C_Choice33_rad.setActionCommand("C");
        C_Choice34_rad.setActionCommand("D");

        C_Choice41_rad.setActionCommand("A");
        C_Choice42_rad.setActionCommand("B");
        C_Choice43_rad.setActionCommand("C");
        C_Choice44_rad.setActionCommand("D");

        C_Content_lbl.setText(S.getCurrentExam().getQues().get(0).getQcontent());
        C_Content2_lbl.setText(S.getCurrentExam().getQues().get(0).getQcontent());
        C_Content3_lbl.setText(S.getCurrentExam().getQues().get(0).getQcontent());
        C_Content4_lbl.setText(S.getCurrentExam().getQues().get(0).getQcontent());

        C_Choice1_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("A"));
        C_Choice2_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("B"));
        C_Choice3_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("C"));
        C_Choice4_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("D"));

        C_Choice21_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("A"));
        C_Choice22_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("B"));
        C_Choice23_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("C"));
        C_Choice24_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("D"));

        C_Choice31_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("A"));
        C_Choice32_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("B"));
        C_Choice33_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("C"));
        C_Choice34_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("D"));

        C_Choice41_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("A"));
        C_Choice42_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("B"));
        C_Choice43_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("C"));
        C_Choice44_rad.setText(S.getCurrentExam().getQues().get(0).getListOfChoises().get("D"));
        javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (sec == 0) {
                    sec = 60;
                    min--;

                }

                if (min < 0) {
                    min = 59;
                    if (hour != 0) {
                        hour--;
                    }
                }

                sec--;
                if (sec < 10) {
                    Sec.setText("0" + String.valueOf(sec));
                } else {
                    Sec.setText(String.valueOf(sec));
                }
                if (min < 10) {
                    Min.setText("0" + String.valueOf(min));
                } else {
                    Min.setText(String.valueOf(min));
                }
                Hour.setText("0" + String.valueOf(hour));
                if (sec == 0) {
                    if (min == 0) {
                        if (hour == 0) {
                            String selection1 = buttonGroup1.getSelection().getActionCommand();
                            String selection2 = buttonGroup2.getSelection().getActionCommand();
                            String selection3 = buttonGroup3.getSelection().getActionCommand();
                            String selection4 = buttonGroup4.getSelection().getActionCommand();

                            if (S.getCurrentExam().getQues().get(0).CheckCorrect(selection1)) {
                                count.add(1);
                                CorrectCount++;
                            } else {
                                count.add(0);
                            }
                            if (S.getCurrentExam().getQues().get(1).CheckCorrect(selection2)) {
                                count.add(1);
                                CorrectCount++;
                            } else {
                                count.add(0);
                            }
                            if (S.getCurrentExam().getQues().get(2).CheckCorrect(selection3)) {
                                count.add(1);
                                CorrectCount++;
                            } else {
                                count.add(0);
                            }
                            if (S.getCurrentExam().getQues().get(3).CheckCorrect(selection4)) {
                                count.add(1);
                                CorrectCount++;
                            } else {
                                count.add(0);
                            }

                            try {
                                S.EvalWrite(count, S.getCurrentExam().getExamID());

                                S.GradeWrite(CorrectCount, S.getCurrentExam().getExamID());
                            } catch (IOException IOE) {
                                System.out.println(IOE);
                            }
                            JOptionPane.showMessageDialog(null, "Result = " + String.valueOf(CorrectCount) + " out of 4");
                            hide();
                        }
                    }
                }

            }
        });
        timer.start();

    }

    public CurrentExam() {
        initComponents();

        Q1.show();
        Q2.hide();
        Q3.hide();
        Q4.hide();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        Q1 = new javax.swing.JPanel();
        C_Q1_lbl = new javax.swing.JLabel();
        C_Content_lbl = new javax.swing.JLabel();
        C_ins_lbl = new javax.swing.JLabel();
        C_ans_lbl = new javax.swing.JLabel();
        C_Choice1_rad = new javax.swing.JRadioButton();
        C_Choice2_rad = new javax.swing.JRadioButton();
        C_Choice3_rad = new javax.swing.JRadioButton();
        C_Choice4_rad = new javax.swing.JRadioButton();
        C_Next_Btn = new javax.swing.JButton();
        C_TimeLift_lbl = new javax.swing.JLabel();
        Q2 = new javax.swing.JPanel();
        C_Q2_lbl = new javax.swing.JLabel();
        C_Content2_lbl = new javax.swing.JLabel();
        C_instruction2_lbl = new javax.swing.JLabel();
        C_ans2_lbl = new javax.swing.JLabel();
        C_Choice21_rad = new javax.swing.JRadioButton();
        C_Choice22_rad = new javax.swing.JRadioButton();
        C_Choice23_rad = new javax.swing.JRadioButton();
        C_Choice24_rad = new javax.swing.JRadioButton();
        C_prev_btn = new javax.swing.JButton();
        C_Next2_btn = new javax.swing.JButton();
        Q3 = new javax.swing.JPanel();
        C_Q3_lbl = new javax.swing.JLabel();
        C_Content3_lbl = new javax.swing.JLabel();
        C_ins3_lbl = new javax.swing.JLabel();
        C_ans3_lbl = new javax.swing.JLabel();
        C_Choice31_rad = new javax.swing.JRadioButton();
        C_Choice32_rad = new javax.swing.JRadioButton();
        C_Choice33_rad = new javax.swing.JRadioButton();
        C_Choice34_rad = new javax.swing.JRadioButton();
        C_prev3_btn = new javax.swing.JButton();
        C_Next3_btn = new javax.swing.JButton();
        Q4 = new javax.swing.JPanel();
        C_Q4_lbl = new javax.swing.JLabel();
        C_Content4_lbl = new javax.swing.JLabel();
        C_ins4_lbl = new javax.swing.JLabel();
        C_ans4_lbl = new javax.swing.JLabel();
        C_Choice41_rad = new javax.swing.JRadioButton();
        C_Choice42_rad = new javax.swing.JRadioButton();
        C_Choice43_rad = new javax.swing.JRadioButton();
        C_Choice44_rad = new javax.swing.JRadioButton();
        C_prev4_btn = new javax.swing.JButton();
        C_Finish_btn = new javax.swing.JButton();
        Hour = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        Sec = new javax.swing.JLabel();
        C_TimeLift_lbl4 = new javax.swing.JLabel();
        C_TimeLift_lbl5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Q1MouseDragged(evt);
            }
        });

        C_Q1_lbl.setText("Q1");

        C_Content_lbl.setText("Content");

        C_ins_lbl.setText("Intstructions");

        C_ans_lbl.setText("Answer: ");

        buttonGroup1.add(C_Choice1_rad);
        C_Choice1_rad.setText("jRadioButton1");

        buttonGroup1.add(C_Choice2_rad);
        C_Choice2_rad.setText("jRadioButton2");

        buttonGroup1.add(C_Choice3_rad);
        C_Choice3_rad.setText("jRadioButton3");

        buttonGroup1.add(C_Choice4_rad);
        C_Choice4_rad.setText("jRadioButton4");

        C_Next_Btn.setText("Next");
        C_Next_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Next_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Q1Layout = new javax.swing.GroupLayout(Q1);
        Q1.setLayout(Q1Layout);
        Q1Layout.setHorizontalGroup(
            Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Q1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(C_Next_Btn))
                    .addGroup(Q1Layout.createSequentialGroup()
                        .addGroup(Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C_ins_lbl)
                            .addComponent(C_Choice4_rad)
                            .addComponent(C_Choice3_rad)
                            .addComponent(C_Choice2_rad)
                            .addComponent(C_Choice1_rad)
                            .addComponent(C_Q1_lbl)
                            .addComponent(C_Content_lbl)
                            .addComponent(C_ans_lbl))
                        .addGap(0, 675, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Q1Layout.setVerticalGroup(
            Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(C_ins_lbl)
                .addGap(15, 15, 15)
                .addComponent(C_Q1_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Content_lbl)
                .addGap(39, 39, 39)
                .addComponent(C_ans_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Choice1_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice2_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice3_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice4_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(C_Next_Btn)
                .addContainerGap())
        );

        C_TimeLift_lbl.setText("Time Left:");

        Q2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Q2_lbl.setText("Q2");

        C_Content2_lbl.setText("Content");

        C_instruction2_lbl.setText("Intstructions");

        C_ans2_lbl.setText("Answer: ");

        buttonGroup2.add(C_Choice21_rad);
        C_Choice21_rad.setText("jRadioButton1");

        buttonGroup2.add(C_Choice22_rad);
        C_Choice22_rad.setText("jRadioButton2");

        buttonGroup2.add(C_Choice23_rad);
        C_Choice23_rad.setText("jRadioButton3");

        buttonGroup2.add(C_Choice24_rad);
        C_Choice24_rad.setText("jRadioButton4");

        C_prev_btn.setText("Previous");
        C_prev_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_prev_btnActionPerformed(evt);
            }
        });

        C_Next2_btn.setText("Next");
        C_Next2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Next2_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Q2Layout = new javax.swing.GroupLayout(Q2);
        Q2.setLayout(Q2Layout);
        Q2Layout.setHorizontalGroup(
            Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Choice24_rad)
                    .addComponent(C_Choice23_rad)
                    .addComponent(C_Choice22_rad)
                    .addComponent(C_Choice21_rad)
                    .addComponent(C_Q2_lbl)
                    .addComponent(C_Content2_lbl)
                    .addComponent(C_instruction2_lbl)
                    .addComponent(C_ans2_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Q2Layout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addComponent(C_prev_btn)
                .addGap(43, 43, 43)
                .addComponent(C_Next2_btn)
                .addContainerGap())
        );
        Q2Layout.setVerticalGroup(
            Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(C_instruction2_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Q2_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Content2_lbl)
                .addGap(39, 39, 39)
                .addComponent(C_ans2_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Choice21_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice22_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice23_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice24_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_prev_btn)
                    .addComponent(C_Next2_btn))
                .addContainerGap())
        );

        Q3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Q3_lbl.setText("Q3");

        C_Content3_lbl.setText("Content");

        C_ins3_lbl.setText("Intstructions");

        C_ans3_lbl.setText("Answer: ");

        buttonGroup3.add(C_Choice31_rad);
        C_Choice31_rad.setText("jRadioButton1");

        buttonGroup3.add(C_Choice32_rad);
        C_Choice32_rad.setText("jRadioButton2");

        buttonGroup3.add(C_Choice33_rad);
        C_Choice33_rad.setText("jRadioButton3");

        buttonGroup3.add(C_Choice34_rad);
        C_Choice34_rad.setText("jRadioButton4");

        C_prev3_btn.setText("Previous");
        C_prev3_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_prev3_btnActionPerformed(evt);
            }
        });

        C_Next3_btn.setText("Next");
        C_Next3_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Next3_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Q3Layout = new javax.swing.GroupLayout(Q3);
        Q3.setLayout(Q3Layout);
        Q3Layout.setHorizontalGroup(
            Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Choice34_rad)
                    .addComponent(C_Choice33_rad)
                    .addComponent(C_Choice32_rad)
                    .addComponent(C_Choice31_rad)
                    .addComponent(C_Q3_lbl)
                    .addComponent(C_Content3_lbl)
                    .addComponent(C_ins3_lbl)
                    .addComponent(C_ans3_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Q3Layout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addComponent(C_prev3_btn)
                .addGap(43, 43, 43)
                .addComponent(C_Next3_btn)
                .addContainerGap())
        );
        Q3Layout.setVerticalGroup(
            Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(C_ins3_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Q3_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Content3_lbl)
                .addGap(39, 39, 39)
                .addComponent(C_ans3_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Choice31_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice32_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice33_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice34_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_prev3_btn)
                    .addComponent(C_Next3_btn))
                .addContainerGap())
        );

        Q4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Q4_lbl.setText("Q4");

        C_Content4_lbl.setText("Content");

        C_ins4_lbl.setText("Intstructions");

        C_ans4_lbl.setText("Answer: ");

        buttonGroup4.add(C_Choice41_rad);
        C_Choice41_rad.setText("jRadioButton1");

        buttonGroup4.add(C_Choice42_rad);
        C_Choice42_rad.setText("jRadioButton2");

        buttonGroup4.add(C_Choice43_rad);
        C_Choice43_rad.setText("jRadioButton3");

        buttonGroup4.add(C_Choice44_rad);
        C_Choice44_rad.setText("jRadioButton4");

        C_prev4_btn.setText("Previous");
        C_prev4_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_prev4_btnActionPerformed(evt);
            }
        });

        C_Finish_btn.setText("Finish");
        C_Finish_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Finish_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Q4Layout = new javax.swing.GroupLayout(Q4);
        Q4.setLayout(Q4Layout);
        Q4Layout.setHorizontalGroup(
            Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Choice44_rad)
                    .addComponent(C_Choice43_rad)
                    .addComponent(C_Choice42_rad)
                    .addComponent(C_Choice41_rad)
                    .addComponent(C_Q4_lbl)
                    .addComponent(C_Content4_lbl)
                    .addComponent(C_ins4_lbl)
                    .addComponent(C_ans4_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Q4Layout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(C_prev4_btn)
                .addGap(43, 43, 43)
                .addComponent(C_Finish_btn)
                .addContainerGap())
        );
        Q4Layout.setVerticalGroup(
            Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(C_ins4_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Q4_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Content4_lbl)
                .addGap(45, 45, 45)
                .addComponent(C_ans4_lbl)
                .addGap(18, 18, 18)
                .addComponent(C_Choice41_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice42_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice43_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Choice44_rad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_prev4_btn)
                    .addComponent(C_Finish_btn))
                .addContainerGap())
        );

        Hour.setText("00");

        Min.setText("00");

        Sec.setText("00");

        C_TimeLift_lbl4.setText(":");

        C_TimeLift_lbl5.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(C_TimeLift_lbl)
                        .addGap(20, 20, 20)
                        .addComponent(Hour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C_TimeLift_lbl4)
                        .addGap(18, 18, 18)
                        .addComponent(Min)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C_TimeLift_lbl5)
                        .addGap(15, 15, 15)
                        .addComponent(Sec)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_TimeLift_lbl)
                    .addComponent(Hour)
                    .addComponent(Min)
                    .addComponent(Sec)
                    .addComponent(C_TimeLift_lbl4)
                    .addComponent(C_TimeLift_lbl5))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_Next_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Next_BtnActionPerformed
        // TODO add your handling code here:
        //System.out.println(buttonGroup1.getSelection().getActionCommand());
        Q1.hide();
        Q2.show();
    }//GEN-LAST:event_C_Next_BtnActionPerformed

    private void C_Next2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Next2_btnActionPerformed
        // TODO add your handling code here:

        Q2.hide();
        Q3.show();
    }//GEN-LAST:event_C_Next2_btnActionPerformed

    private void C_Next3_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Next3_btnActionPerformed
        // TODO add your handling code here:

        Q3.hide();
        Q4.show();
    }//GEN-LAST:event_C_Next3_btnActionPerformed

    private void C_prev4_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_prev4_btnActionPerformed
        // TODO add your handling code here:

        Q4.hide();
        Q3.show();
    }//GEN-LAST:event_C_prev4_btnActionPerformed

    private void C_prev3_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_prev3_btnActionPerformed
        // TODO add your handling code here:

        Q3.hide();
        Q2.show();

    }//GEN-LAST:event_C_prev3_btnActionPerformed

    private void C_prev_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_prev_btnActionPerformed
        // TODO add your handling code here:
        Q2.hide();
        Q1.show();
    }//GEN-LAST:event_C_prev_btnActionPerformed

    private void C_Finish_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Finish_btnActionPerformed
        // TODO add your handling code here:
        try {
            String selection1 = buttonGroup1.getSelection().getActionCommand();
            String selection2 = buttonGroup2.getSelection().getActionCommand();
            String selection3 = buttonGroup3.getSelection().getActionCommand();
            String selection4 = buttonGroup4.getSelection().getActionCommand();

            if (S.getCurrentExam().getQues().get(0).CheckCorrect(selection1)) {
                count.add(1);
                CorrectCount++;
            } else {
                count.add(0);
            }
            if (S.getCurrentExam().getQues().get(1).CheckCorrect(selection2)) {
                count.add(1);
                CorrectCount++;
            } else {
                count.add(0);
            }
            if (S.getCurrentExam().getQues().get(2).CheckCorrect(selection3)) {
                count.add(1);
                CorrectCount++;
            } else {
                count.add(0);
            }
            if (S.getCurrentExam().getQues().get(3).CheckCorrect(selection4)) {
                count.add(1);
                CorrectCount++;
            } else {
                count.add(0);
            }

            try {
                S.EvalWrite(count, S.getCurrentExam().getExamID());

                S.GradeWrite(CorrectCount, S.getCurrentExam().getExamID());
            } catch (IOException e) {
                System.out.println(e);
            }
            JOptionPane.showMessageDialog(null, "Result = " + String.valueOf(CorrectCount) + " out of 4");
            this.hide();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "You must select an answer for all the questions");
        }
    }//GEN-LAST:event_C_Finish_btnActionPerformed

    private void Q1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Q1MouseDragged
        // TODO add your handling code here:
        if (sec == 0) {
            if (min == 0) {
                if (hour == 0) {

                    this.hide();
                }
            }
        }
    }//GEN-LAST:event_Q1MouseDragged

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
            java.util.logging.Logger.getLogger(CurrentExam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentExam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentExam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentExam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton C_Choice1_rad;
    private javax.swing.JRadioButton C_Choice21_rad;
    private javax.swing.JRadioButton C_Choice22_rad;
    private javax.swing.JRadioButton C_Choice23_rad;
    private javax.swing.JRadioButton C_Choice24_rad;
    private javax.swing.JRadioButton C_Choice2_rad;
    private javax.swing.JRadioButton C_Choice31_rad;
    private javax.swing.JRadioButton C_Choice32_rad;
    private javax.swing.JRadioButton C_Choice33_rad;
    private javax.swing.JRadioButton C_Choice34_rad;
    private javax.swing.JRadioButton C_Choice3_rad;
    private javax.swing.JRadioButton C_Choice41_rad;
    private javax.swing.JRadioButton C_Choice42_rad;
    private javax.swing.JRadioButton C_Choice43_rad;
    private javax.swing.JRadioButton C_Choice44_rad;
    private javax.swing.JRadioButton C_Choice4_rad;
    private javax.swing.JLabel C_Content2_lbl;
    private javax.swing.JLabel C_Content3_lbl;
    private javax.swing.JLabel C_Content4_lbl;
    private javax.swing.JLabel C_Content_lbl;
    private javax.swing.JButton C_Finish_btn;
    private javax.swing.JButton C_Next2_btn;
    private javax.swing.JButton C_Next3_btn;
    private javax.swing.JButton C_Next_Btn;
    private javax.swing.JLabel C_Q1_lbl;
    private javax.swing.JLabel C_Q2_lbl;
    private javax.swing.JLabel C_Q3_lbl;
    private javax.swing.JLabel C_Q4_lbl;
    private javax.swing.JLabel C_TimeLift_lbl;
    private javax.swing.JLabel C_TimeLift_lbl4;
    private javax.swing.JLabel C_TimeLift_lbl5;
    private javax.swing.JLabel C_ans2_lbl;
    private javax.swing.JLabel C_ans3_lbl;
    private javax.swing.JLabel C_ans4_lbl;
    private javax.swing.JLabel C_ans_lbl;
    private javax.swing.JLabel C_ins3_lbl;
    private javax.swing.JLabel C_ins4_lbl;
    private javax.swing.JLabel C_ins_lbl;
    private javax.swing.JLabel C_instruction2_lbl;
    private javax.swing.JButton C_prev3_btn;
    private javax.swing.JButton C_prev4_btn;
    private javax.swing.JButton C_prev_btn;
    private javax.swing.JLabel Hour;
    private javax.swing.JLabel Min;
    private javax.swing.JPanel Q1;
    private javax.swing.JPanel Q2;
    private javax.swing.JPanel Q3;
    private javax.swing.JPanel Q4;
    private javax.swing.JLabel Sec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    // End of variables declaration//GEN-END:variables
}
