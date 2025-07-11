/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AplikasiPenjualan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author X13 Yoga
 */
public class PaymentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form paymentForm
     */
    public PaymentForm() {
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

        radioButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        priceLandTxt = new javax.swing.JTextField();
        areaCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t36RadioButton = new javax.swing.JRadioButton();
        t45RadioButton = new javax.swing.JRadioButton();
        t54RadioButton = new javax.swing.JRadioButton();
        buildingPriceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        largeLandTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        availableLandTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalPriceTxt = new javax.swing.JTextField();
        DPTxt = new javax.swing.JTextField();
        instalmentAmountTxt = new javax.swing.JTextField();
        ppnTxt = new javax.swing.JTextField();
        instalmentMonthTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agreementCbx = new javax.swing.JCheckBox();
        processButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tArea = new javax.swing.JTextArea();

        setTitle("FORM PENJUALAN");

        jLabel1.setText("Nama Pemesan");

        jLabel2.setText("Harga Tanah");

        jLabel3.setText("Area");

        priceLandTxt.setEditable(false);
        priceLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        areaCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- PILIH ---", "BOUGENVILE", "MELATI", "FLAMBOYAN", " " }));
        areaCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboboxActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AplikasiPenjualan/rumah.jpeg"))); // NOI18N

        jLabel5.setText("Harga Bangunan");

        jLabel6.setText("Tipe Rumah");

        radioButton.add(t36RadioButton);
        t36RadioButton.setText("Tipe - 36");
        t36RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t45RadioButton);
        t45RadioButton.setText("Tipe - 45");
        t45RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t45RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t54RadioButton);
        t54RadioButton.setText("Tipe - 54");
        t54RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t54RadioButtonActionPerformed(evt);
            }
        });

        buildingPriceTxt.setEditable(false);
        buildingPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("Luas Tanah Asli");

        largeLandTxt.setEditable(false);
        largeLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("Luas Tanah Tersedia");

        availableLandTxt.setEditable(false);
        availableLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("Harga");

        jLabel10.setText("DP");

        jLabel11.setText("Lama Cicilan");

        jLabel12.setText("PPn (10%)");

        jLabel13.setText("Cicilan / Bulan");

        totalPriceTxt.setEditable(false);
        totalPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        DPTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        instalmentAmountTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ppnTxt.setEditable(false);
        ppnTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ppnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppnTxtActionPerformed(evt);
            }
        });

        instalmentMonthTxt.setEditable(false);
        instalmentMonthTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel14.setText("Bulan");

        agreementCbx.setText("Setuju");
        agreementCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementCbxActionPerformed(evt);
            }
        });

        processButton.setText("PROSES");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SIMPAN");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("HAPUS");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        tArea.setColumns(20);
        tArea.setRows(5);
        jScrollPane1.setViewportView(tArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderNameTxt)
                            .addComponent(priceLandTxt)
                            .addComponent(areaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t36RadioButton)
                                    .addComponent(t45RadioButton)
                                    .addComponent(t54RadioButton)))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buildingPriceTxt)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(largeLandTxt)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(availableLandTxt)
                            .addComponent(totalPriceTxt)
                            .addComponent(DPTxt)
                            .addComponent(instalmentAmountTxt)
                            .addComponent(ppnTxt)
                            .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(agreementCbx)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buildingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(largeLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availableLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t54RadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instalmentAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ppnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(agreementCbx))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(processButton)
                                .addComponent(saveButton))
                            .addComponent(deleteButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(priceLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t36RadioButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(areaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t45RadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ppnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppnTxtActionPerformed

    private void areaComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboboxActionPerformed
        switch(areaCombobox.getSelectedIndex()){
            case 0:
                priceLandTxt.setText("");
                buildingPriceTxt.setText("");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            case 1:
                priceLandTxt.setText("5000000");
                buildingPriceTxt.setText("900000000");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            case 2:
                priceLandTxt.setText("6000000");
                buildingPriceTxt.setText("1200000000");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            default:
                priceLandTxt.setText("7000000");
                buildingPriceTxt.setText("1500000000");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;    
        }
    }//GEN-LAST:event_areaComboboxActionPerformed

    private void t36RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            radioButton.clearSelection();
        } else {
            largeLandTxt.setText("90");
            availableLandTxt.setText("54");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableLand = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            instalmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            instalmentMonthTxt.setText("");
            agreementCbx.setText("");
            tArea.setText("");
        }
    }//GEN-LAST:event_t36RadioButtonActionPerformed

    private void t45RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t45RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            radioButton.clearSelection();
        } else {
            largeLandTxt.setText("120");
            availableLandTxt.setText("75");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableLand = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            instalmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            instalmentMonthTxt.setText("");
            agreementCbx.setText("");
            tArea.setText("");
        }
    }//GEN-LAST:event_t45RadioButtonActionPerformed

    private void t54RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t54RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            radioButton.clearSelection();
        } else {
            largeLandTxt.setText("140");
            availableLandTxt.setText("86");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableLand = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            instalmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            instalmentMonthTxt.setText("");
            agreementCbx.setText("");
            tArea.setText("");
        }
    }//GEN-LAST:event_t54RadioButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        orderNameTxt.setText("");
        priceLandTxt.setText("");
        buildingPriceTxt.setText("");
        largeLandTxt.setText("");
        availableLandTxt.setText("");
        totalPriceTxt.setText("");
        DPTxt.setText("");
        instalmentAmountTxt.setText("");
        instalmentMonthTxt.setText("");
        ppnTxt.setText("");
        areaCombobox.setSelectedIndex(0);
        radioButton.clearSelection();
        tArea.setText("");
        agreementCbx.setSelected(false);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        if(totalPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilihan belum lengkap");
        } else if(DPTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "DP harus diisi");
        } else if(instalmentAmountTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi jumlah cicilan yang diinginkan");
        } else {
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableLand = Long.parseLong(availableLandTxt.getText()),
                    dp = Long.parseLong(DPTxt.getText()),
                    instalmentAmount = Long.parseLong(instalmentAmountTxt.getText()),
                    totalPrice, ppn, instalmentPerMonth;
                totalPrice = (availableLand * landPrice) + buildingPrice;
                ppn = totalPrice * 10 / 100;
                instalmentPerMonth = (totalPrice + ppn) / instalmentAmount;
                ppnTxt.setText("" + ppn);
                instalmentMonthTxt.setText("" + instalmentPerMonth);
                
            // Set hasil perhitungan ke field
        totalPriceTxt.setText(String.valueOf(totalPrice));
        ppnTxt.setText(String.valueOf(ppn));
        instalmentMonthTxt.setText(String.valueOf(instalmentPerMonth));

        // Ambil data lainnya
        String nama = orderNameTxt.getText();
        String hargaTanah = priceLandTxt.getText();
        String area = areaCombobox.getSelectedItem().toString();

        String tipeRumah = "";
        if (t36RadioButton.isSelected()) {
            tipeRumah = "Tipe 36";
        } else if (t45RadioButton.isSelected()) {
            tipeRumah = "Tipe 45";
        } else if (t54RadioButton.isSelected()) {
            tipeRumah = "Tipe 54";
        }

        String hargaBangunan = buildingPriceTxt.getText();
        String luasAsli = largeLandTxt.getText();
        String luasTersedia = availableLandTxt.getText();
        String lamaCicilan = instalmentMonthTxt.getText();
        String cicilanPerBulan = instalmentAmountTxt.getText();
        boolean setuju = agreementCbx.isSelected();

        if (!setuju) {
            JOptionPane.showMessageDialog(this, "Silakan centang kotak persetujuan terlebih dahulu.");
            return;
        }

        String output = "===== RINCIAN PEMESANAN =====\n"
                + "Nama Pemesan          : " + nama + "\n"
                + "Harga Tanah              : " + hargaTanah + "\n"
                + "Area                            : " + area + "\n"
                + "Tipe Rumah                : " + tipeRumah + "\n"
                + "Harga Bangunan        : " + hargaBangunan + "\n"
                + "Luas Tanah Asli          : " + luasAsli + "\n"
                + "Luas Tanah Tersedia : " + luasTersedia + "\n"
                + "Total Harga                : " + totalPrice + "\n"
                + "DP                              : " + dp + "\n"
                + "Lama Cicilan              : " + lamaCicilan + " bulan\n"
                + "PPN (10%)                 : " + ppn + "\n"
                + "Cicilan per Bulan        : " + cicilanPerBulan + "\n"
                + "==============================";

        tArea.setText(output);
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void agreementCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementCbxActionPerformed
        if(orderNameTxt.getText().isEmpty()){  
            JOptionPane.showMessageDialog(null, "Nama pemesan harus diisi");
            agreementCbx.setSelected(false);
        } else if (ppnTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "tekan tombol proses terlebih dahulu");
            agreementCbx.setSelected(false);
        } else if(agreementCbx.isSelected() == true){
            JOptionPane.showMessageDialog(null, "pesanan disetujui");
            agreementCbx.setSelected(true);
        } else {
            JOptionPane.showMessageDialog(null, "pesanan belum disetujui");
            agreementCbx.setSelected(false);
        }
    }//GEN-LAST:event_agreementCbxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (!agreementCbx.isSelected()) {
            JOptionPane.showMessageDialog(null,
                    "Klik centang checkbox untuk simpan data", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {  
        }
            String typeHouse;
            
            if (t36RadioButton.isSelected()) {
                typeHouse = "TIPE 36";
            } else if (t45RadioButton.isSelected()) {
                typeHouse = "TIPE 45";
            } else {
                typeHouse = "TIPE 54";
            }
            
            
            try {
                String sql = "INSERT INTO rumah (name, area, tipe, luas, harga, jumlah_cicilan, cicilan_bulan) VALUES (?, ?, ?, ?, ?, ?, ?)";

                Connection conn = ConnectionDb.getConnection(); 
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, orderNameTxt.getText());
                pst.setString(2, areaCombobox.getSelectedItem().toString());
                pst.setString(3, typeHouse);
                pst.setString(4, largeLandTxt.getText());
                pst.setString(5, totalPriceTxt.getText());
                pst.setString(6, instalmentAmountTxt.getText());
                pst.setString(7, instalmentMonthTxt.getText());


                pst.executeUpdate(); 
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                
                OptionMenu optionMenu = new OptionMenu();
                optionMenu.setVisible(true);
                this.getDesktopPane().add(optionMenu);
                this.dispose();
                
                } catch (SQLException ex) {
                Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + ex.getMessage());
    }//GEN-LAST:event_saveButtonActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DPTxt;
    private javax.swing.JCheckBox agreementCbx;
    private javax.swing.JComboBox<String> areaCombobox;
    private javax.swing.JTextField availableLandTxt;
    private javax.swing.JTextField buildingPriceTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField instalmentAmountTxt;
    private javax.swing.JTextField instalmentMonthTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largeLandTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JTextField ppnTxt;
    private javax.swing.JTextField priceLandTxt;
    private javax.swing.JButton processButton;
    private javax.swing.ButtonGroup radioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JRadioButton t36RadioButton;
    private javax.swing.JRadioButton t45RadioButton;
    private javax.swing.JRadioButton t54RadioButton;
    private javax.swing.JTextArea tArea;
    private javax.swing.JTextField totalPriceTxt;
    // End of variables declaration//GEN-END:variables
}
