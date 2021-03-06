/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Logic.Controller;
import Logic.DecompositionMatrix;
import Logic.Parameters;
import java.util.Arrays;
import javax.swing.JRootPane;

/**
 *
 * @author Stacy
 */
public class StartGenerating extends javax.swing.JPanel {

    /**
     * Creates new form StartGenerating
     */
    public StartGenerating() {
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

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(568, 423));
        setMinimumSize(new java.awt.Dimension(568, 423));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 307, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(70, 70, 70)
                        .addComponent(jButton5)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Controller controller = new Controller();
        controller.startGenerate(Parameters.getInstance());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JRootPane pane = (JRootPane) this.getRootPane();
        MainJFrame frame = (MainJFrame) pane.getParent();

        if (Parameters.getInstance().isModeGeneration() == true) {
            frame.setOnTopStandartOption();
        } else {
            frame.setOnTopAdvancetOption();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Help help = Help.getInstance();
        help.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void standartParametersGen() {

        JRootPane pane = (JRootPane) this.getRootPane();
        MainJFrame frame = (MainJFrame) pane.getParent();

        String top_0 = "Процесс генерации будет запущен со следующими параметрами: " + "\n";
        String top_1 = "Период GMW-последовательности : " + Parameters.getInstance().getPeriodGMW() + "\n";
        String top_2 = "Длина GMW-последовательности : " + Parameters.getInstance().getLenghtGMW() + "\n";
        String top_3 = "Коэффициенты характеристического полинома : " + Arrays.toString(Parameters.getInstance().getPolinomMSeq()) + "\n";
//        String top_4 ="Базисная последовательность : "+"\n";
//        String top_5 ="Размерность матрицы декомпозиции (JxS) : "+"\n";
//        String top_6 ="J = "+"\n";
//        String top_7 ="S = "+"\n";
        String n = "\n";
        String main = n + top_0 + n + top_1 + n + top_2 + n + top_3;
        jTextPane1.setText(main);

    }

    public void advancedParametersGen() {

        JRootPane pane = (JRootPane) this.getRootPane();
        MainJFrame frame = (MainJFrame) pane.getParent();
     
        String top_0 = "Процесс генерации будет запущен со следующими параметрами: " + "\n";
        String top_1 = "Период GMW-последовательности : " + Parameters.getInstance().getPeriodGMW() + "\n";
        String top_2 = "Длина GMW-последовательности : " + Parameters.getInstance().getLenghtGMW() + "\n";
        String top_3 = "Коэффициенты характеристического полинома : " + Arrays.toString(Parameters.getInstance().getPolinomMSeq()) + "\n";
        String top_4 = "Базисная последовательность : " + Arrays.toString(Parameters.getInstance().getPolinomMSeq())+"\n";
        String top_5 = "Размерность матрицы декомпозиции (JxS) : " + "\n";
        String top_6 = "J = " + Parameters.getInstance().getRowMatrxDec() +"\n";
        String top_7 = "S = " +  Parameters.getInstance().getColMatrxDec() +"\n";
        String n = "\n";
        String main = n + top_0 + n + top_1 + n + top_2 + n + top_3 +n +top_4+ n + top_5 + n +top_6 + n + top_7;
        jTextPane1.setText(main);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
