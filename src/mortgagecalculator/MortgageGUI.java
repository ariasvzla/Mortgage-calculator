/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgagecalculator;

/**
 *
 * @author Arias.E
 */
public class MortgageGUI extends javax.swing.JFrame {
    double loan;
    double interest;
    int terms;
    double mp;
    MortgageCalculator myC= new MortgageCalculator();
      
    /**
     * Creates new form MortgageGUI
     */
    public MortgageGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        inputPnl = new javax.swing.JPanel();
        loanTf = new javax.swing.JTextField();
        interestTf = new javax.swing.JTextField();
        termsTf = new javax.swing.JTextField();
        loanLbl = new javax.swing.JLabel();
        interestLbl = new javax.swing.JLabel();
        termsLbl = new javax.swing.JLabel();
        errorLbl = new javax.swing.JLabel();
        computeBtn = new javax.swing.JButton();
        resultLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Mortgage Calculator");

        loanTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanTfActionPerformed(evt);
            }
        });

        loanLbl.setText("Loan Amount");

        interestLbl.setText("Interest rate");

        termsLbl.setText("Terms (years)");

        javax.swing.GroupLayout inputPnlLayout = new javax.swing.GroupLayout(inputPnl);
        inputPnl.setLayout(inputPnlLayout);
        inputPnlLayout.setHorizontalGroup(
            inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interestLbl)
                    .addComponent(termsLbl)
                    .addComponent(loanLbl))
                .addGap(40, 40, 40)
                .addGroup(inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loanTf, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(interestTf)
                    .addComponent(termsTf))
                .addGap(18, 18, 18)
                .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPnlLayout.setVerticalGroup(
            inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanLbl)
                    .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interestTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interestLbl))
                .addGap(18, 18, 18)
                .addGroup(inputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termsLbl))
                .addContainerGap())
        );

        computeBtn.setText("Compute Montly Payment");
        computeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(computeBtn)
                                .addGap(67, 67, 67)
                                .addComponent(resultLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(inputPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computeBtn)
                    .addComponent(resultLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loanTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loanTfActionPerformed

    private void computeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeBtnActionPerformed
       
        loan= Double.parseDouble(loanTf.getText());
       interest = Double.parseDouble(interestTf.getText());
       terms= Integer.parseInt(termsTf.getText());
       

       
       myC.setInterest(interest);
       myC.setLoan(loan);
       myC.setTerms(terms);
       myC.compute();
       
      mp=myC.getResult();
      String mq=Double.toString(mp);
      
      resultLbl.setText(mq);
                
              
                      
    }//GEN-LAST:event_computeBtnActionPerformed
 
       
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
            java.util.logging.Logger.getLogger(MortgageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MortgageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MortgageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MortgageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MortgageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computeBtn;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JPanel inputPnl;
    private javax.swing.JLabel interestLbl;
    private javax.swing.JTextField interestTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loanLbl;
    private javax.swing.JTextField loanTf;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JLabel termsLbl;
    private javax.swing.JTextField termsTf;
    // End of variables declaration//GEN-END:variables
}
