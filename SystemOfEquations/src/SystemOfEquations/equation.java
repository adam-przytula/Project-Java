package SystemOfEquations;

import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author Adam
 */
public class equation extends javax.swing.JFrame {
    protected double x,y,Ax1,Bx1,Cx1,Ax2,Bx2,Cx2,wX,wY,w;

    public equation() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ax1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bx1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cx1 = new javax.swing.JTextField();
        ax2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bx2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cx2 = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        showGraph = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System of equations");

        ax1.setName("ax1"); // NOI18N

        jLabel1.setText("x + ");
        jLabel1.setName("xxxx"); // NOI18N

        bx1.setName("bx1"); // NOI18N

        jLabel2.setText("y = ");
        jLabel2.setToolTipText("");

        cx1.setName("cx1"); // NOI18N

        ax2.setName("ax2"); // NOI18N

        jLabel3.setText("x + ");

        bx2.setName("bx2"); // NOI18N

        jLabel4.setText("y = ");

        cx2.setName("cx2"); // NOI18N

        calculate.setText("Calculate");
        calculate.setName("calculate"); // NOI18N
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateMouseClicked(evt);
            }
        });

        showGraph.setText("Show graph");
        showGraph.setName("showGraph"); // NOI18N
        showGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGraphActionPerformed(evt);
            }
        });

        jLabel5.setText("Result: ");

        result.setName("result"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ax2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(ax1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bx2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cx2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showGraph))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ax1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ax2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(showGraph))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("frame2");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseClicked
        boolean checkIfCorrect = calcOfCoefficients();
        if(checkIfCorrect){
        if(w != 0)  
            result.setText("x = "+x+"  y = "+y);
        else if(wX != 0 && wY != 0) 
            result.setText("The system of equations hasn't solutions");
        else 
            result.setText("The system of equations has infinitely many solutions");
        }   else showMessageDialog(null, "Enter numbers!");
    }//GEN-LAST:event_calculateMouseClicked

    private void showGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGraphActionPerformed
        boolean checkIfCorrect = calcOfCoefficients();
        if(checkIfCorrect){
            JFrame f = new JFrame("Graph of the system of equations");
            f.add(new MyPanel(x, y, Ax1, Bx1, Cx1, Ax2, Bx2, Cx2));
            f.pack();
            f.setLocation(255,0);
            f.setVisible(true);
        }   else showMessageDialog(null, "Enter numbers!");
        
    }//GEN-LAST:event_showGraphActionPerformed
    
    private boolean calcOfCoefficients(){
        try{
            Ax1 = Double.valueOf(ax1.getText());
            Bx1 = Double.valueOf(bx1.getText());
            Cx1 = Double.valueOf(cx1.getText());
            Ax2 = Double.valueOf(ax2.getText());
            Bx2 = Double.valueOf(bx2.getText());
            Cx2 = Double.valueOf(cx2.getText());
            w = Ax1*Bx2 - Bx1*Ax2;
            wX = Cx1*Bx2 - Cx2*Bx1;
            wY = Ax1*Cx2 - Ax2*Cx1;

            x = wX/w;
            y = wY/w;
        }catch(NumberFormatException ex){return false;}
        return true;
    }
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
            java.util.logging.Logger.getLogger(equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new equation().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ax1;
    private javax.swing.JTextField ax2;
    private javax.swing.JTextField bx1;
    private javax.swing.JTextField bx2;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField cx1;
    private javax.swing.JTextField cx2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel result;
    private javax.swing.JButton showGraph;
    // End of variables declaration//GEN-END:variables

    
}



