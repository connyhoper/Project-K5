/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AplikasiPenjualan;

/**
 *
 * @author X13 Yoga
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenu() {
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

        toPaymentButton = new javax.swing.JButton();
        showDataButton = new javax.swing.JButton();

        setTitle("OPTION MENU");

        toPaymentButton.setText("PENJUALAN RUMAH");
        toPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPaymentButtonActionPerformed(evt);
            }
        });

        showDataButton.setText("TAMPILKAN DATA");
        showDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(toPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toPaymentButton)
                    .addComponent(showDataButton))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPaymentButtonActionPerformed
        PaymentForm paymentForm = new PaymentForm();
        paymentForm.setVisible (true);
        this.getDesktopPane().add(paymentForm);
        this.dispose();
    }//GEN-LAST:event_toPaymentButtonActionPerformed

    private void showDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataButtonActionPerformed
        DataForm dataForm = new DataForm();
        dataForm.setVisible(true);
        this.getDesktopPane().add(dataForm);
        this.dispose();
    }//GEN-LAST:event_showDataButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton showDataButton;
    private javax.swing.JButton toPaymentButton;
    // End of variables declaration//GEN-END:variables
}
