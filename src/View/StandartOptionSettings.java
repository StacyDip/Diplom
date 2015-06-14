/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Logic.Parameters;
import Logic.ValidationParam;
import javax.swing.JRootPane;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Stacy
 */
public class StandartOptionSettings extends javax.swing.JPanel {

    /**
     * Creates new form StandartOptionSettings
     */
    public StandartOptionSettings() {
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

        HelpjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFperiod = new javax.swing.JTextField();
        TFdlina = new javax.swing.JTextField();
        TF_polinom = new javax.swing.JTextField();
        OkButton2 = new javax.swing.JButton();
        CancelButton3 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(568, 423));
        setMinimumSize(new java.awt.Dimension(568, 423));

        HelpjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HelpjButton1.setText("Help");
        HelpjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Параметры генерации:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Период  GMW - последовательностей :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Длина  GMW - последовательностей :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Коэффициенты характеристического");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("полинома для М - последовательности ");
        jLabel5.setToolTipText("");

        TFdlina.setMaximumSize(new java.awt.Dimension(6, 22));
        TFdlina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdlinaActionPerformed(evt);
            }
        });

        OkButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OkButton2.setText("OK");
        OkButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButton2ActionPerformed(evt);
            }
        });

        CancelButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CancelButton3.setText("Cancel");
        CancelButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton3ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Отображать дополнительную информацию о генерации");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HelpjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(OkButton2)
                                .addGap(70, 70, 70)
                                .addComponent(CancelButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFperiod)
                                    .addComponent(TFdlina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TF_polinom))))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HelpjButton1)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TFdlina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TF_polinom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jCheckBox2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkButton2)
                    .addComponent(CancelButton3))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HelpjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpjButton1ActionPerformed
        // TODO add your handling code here:

        Help help = Help.getInstance();
        help.setVisible(true);
    }//GEN-LAST:event_HelpjButton1ActionPerformed

    private void TFdlinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdlinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdlinaActionPerformed

    private void CancelButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton3ActionPerformed
        // TODO add your handling code here:
         jCheckBox2.setSelected(true);
        TF_polinom.setText("");
        TFdlina.setText("");
        TFperiod.setText("");
        JRootPane pane = (JRootPane) this.getRootPane();
        MainJFrame frame = (MainJFrame) pane.getParent();
        frame.setOnTopStartSelectMode();

    }//GEN-LAST:event_CancelButton3ActionPerformed

    private void OkButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButton2ActionPerformed
        // TODO add your handling code here:
        String polinom = this.TF_polinom.getText();
        String dlina = this.TFdlina.getText();
        String period = this.TFperiod.getText();
        if (dlina.equals("")) {
            dlina = period;
        }
        
       if(polinom.equals("")|| period.equals("")){
           Warning warning = new Warning();
               warning.setVisible(true);
              
           
       }
       else{
        int periodGMW = Integer.parseInt(period);
        int lengthGMW = Integer.parseInt(dlina);

        char[] masPolinom = polinom.toCharArray();

        int[] polinom_M = new int[masPolinom.length];

        for (int i = 0; i < masPolinom.length; i++) {

            int temp = Character.getNumericValue(masPolinom[i]);

            polinom_M[i] = temp;
        }

            ValidationParam validator =  new ValidationParam();
           if(( validator.chekPolinomMSeq(polinom_M)== false)||(  validator.chekSizePeriod(periodGMW)== false)||(validator.chekSizePolinom(periodGMW, polinom_M)  ==false))
           {
               Warning warning = new Warning();
               warning.setVisible(true);
           }
           else{
        int[] temp_b ={-1};
        Parameters.getInstance().setPolinomMSeq(polinom_M);
        Parameters.getInstance().setPeriodGMW(periodGMW);
        Parameters.getInstance().setLenghtGMW(lengthGMW);
        Parameters.getInstance().setBasicSequence(temp_b);
        Parameters.getInstance().setRowMatrxDec(-1);
        Parameters.getInstance().setColMatrxDec(-1);

        JRootPane pane = (JRootPane) this.getRootPane();
        MainJFrame frame = (MainJFrame) pane.getParent();

        frame.startGenerating1.standartParametersGen();
        frame.setOnTopStartGeneration();

       } 
       }

    }//GEN-LAST:event_OkButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        jCheckBox2.setSelected(false);
        Parameters.getInstance().setDisplayMode(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton3;
    private javax.swing.JButton HelpjButton1;
    private javax.swing.JButton OkButton2;
    public javax.swing.JTextField TF_polinom;
    public javax.swing.JTextField TFdlina;
    public javax.swing.JTextField TFperiod;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
