/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.ConnectDB.KetNoi;

/**
 *
 * @author proxc
 */
public class CanHo extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public CanHo() {
        initComponents();
    }
    KetNoi ketNoi = new KetNoi();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panel_CanHo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_CanHo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        canHo_jButton_timKiem = new javax.swing.JButton();
        canHo_jComboBox_dienTichTimKiem = new javax.swing.JComboBox();
        canHo_jComboBox_giaTimKiem = new javax.swing.JComboBox();
        canHo_jCheckBox_trangThaiTimKiem = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        canHo_jComboBox_maCan = new javax.swing.JComboBox<>();
        canHo_jTextField_gia = new javax.swing.JTextField();
        canHo_jTextField_soPhong = new javax.swing.JTextField();
        canHo_jTextField_dienTich = new javax.swing.JTextField();
        canHo_jTextField_maKhachHang = new javax.swing.JTextField();
        canHo_jTextField_khu = new javax.swing.JTextField();
        canHo_jButton_them = new javax.swing.JButton();
        canHo_jButton_sua = new javax.swing.JButton();
        canHo_jButton_xoa = new javax.swing.JButton();
        canHo_jButton_reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        canHo_jCheckBox_trangThai = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Căn hộ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 965, -1));

        panel_CanHo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_CanHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã căn", "Diện tích (m2)", "Giá (triệu)", "Trạng thái", "Số phòng", "Mã khách hàng", "Khu"
            }
        ));
        table_CanHo.setMaximumSize(new java.awt.Dimension(775, 150));
        table_CanHo.setMinimumSize(new java.awt.Dimension(775, 150));
        table_CanHo.setPreferredSize(new java.awt.Dimension(775, 150));
        table_CanHo.setRequestFocusEnabled(false);
        table_CanHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_CanHoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_CanHo);

        panel_CanHo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 945, 140));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Diện tích");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Giá");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 37, -1));

        canHo_jButton_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        canHo_jButton_timKiem.setText("Tìm");
        canHo_jButton_timKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canHo_jButton_timKiemMouseClicked(evt);
            }
        });
        jPanel2.add(canHo_jButton_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 20));

        canHo_jComboBox_dienTichTimKiem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50", "60", "70" }));
        jPanel2.add(canHo_jComboBox_dienTichTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, -1));

        canHo_jComboBox_giaTimKiem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dưới 500 triệu", "500 - 1 tỷ", "1 tỷ - 2 tỷ", "Trên 2 tỷ" }));
        jPanel2.add(canHo_jComboBox_giaTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 103, -1));

        canHo_jCheckBox_trangThaiTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        canHo_jCheckBox_trangThaiTimKiem.setSelected(true);
        canHo_jCheckBox_trangThaiTimKiem.setText("Đã bán");
        canHo_jCheckBox_trangThaiTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jCheckBox_trangThaiTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(canHo_jCheckBox_trangThaiTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 82, 20));

        panel_CanHo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 530, 60));

        getContentPane().add(panel_CanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã căn");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel3.setText("Diện tích");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel4.setText("Giá");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel6.setText("Số phòng");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel7.setText("Mã khách hàng");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel8.setText("Khu");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        canHo_jComboBox_maCan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A100", "B201", "C303" }));
        canHo_jComboBox_maCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jComboBox_maCanActionPerformed(evt);
            }
        });
        jPanel3.add(canHo_jComboBox_maCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        jPanel3.add(canHo_jTextField_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, -1));
        jPanel3.add(canHo_jTextField_soPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 90, -1));
        jPanel3.add(canHo_jTextField_dienTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 90, -1));

        canHo_jTextField_maKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jTextField_maKhachHangActionPerformed(evt);
            }
        });
        jPanel3.add(canHo_jTextField_maKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 90, -1));
        jPanel3.add(canHo_jTextField_khu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 90, -1));

        canHo_jButton_them.setText("Thêm");
        canHo_jButton_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canHo_jButton_themMouseClicked(evt);
            }
        });
        jPanel3.add(canHo_jButton_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        canHo_jButton_sua.setText("Sửa");
        canHo_jButton_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jButton_suaActionPerformed(evt);
            }
        });
        jPanel3.add(canHo_jButton_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        canHo_jButton_xoa.setText("Xoá");
        canHo_jButton_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canHo_jButton_xoaMouseClicked(evt);
            }
        });
        jPanel3.add(canHo_jButton_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        canHo_jButton_reset.setText("Reset");
        canHo_jButton_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canHo_jButton_resetMouseClicked(evt);
            }
        });
        jPanel3.add(canHo_jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabel5.setText("Trạng thái");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        canHo_jCheckBox_trangThai.setText("Đã bán");
        jPanel3.add(canHo_jCheckBox_trangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 940, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canHo_jComboBox_maCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jComboBox_maCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jComboBox_maCanActionPerformed

    private void canHo_jButton_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_resetMouseClicked
        // TODO add your handling code here:
        canHo_jComboBox_maCan.setSelectedItem("A100");
        canHo_jTextField_dienTich.setText("");
        canHo_jTextField_gia.setText("");
        canHo_jTextField_soPhong.setText("");
        canHo_jTextField_maKhachHang.setText("");
        canHo_jTextField_dienTich.setText("");
        canHo_jTextField_khu.setText("");
        
    }//GEN-LAST:event_canHo_jButton_resetMouseClicked

    private void table_CanHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_CanHoMouseClicked
        // TODO add your handling code here:
        int rowSelected = table_CanHo.getSelectedRow();
        canHo_jTextField_dienTich.setText(table_CanHo.getValueAt(rowSelected, 2).toString());
        canHo_jTextField_gia.setText(table_CanHo.getValueAt(rowSelected, 3).toString());
        canHo_jTextField_soPhong.setText(table_CanHo.getValueAt(rowSelected, 4).toString());
        canHo_jTextField_maKhachHang.setText(table_CanHo.getValueAt(rowSelected, 5).toString());
        canHo_jTextField_khu.setText(table_CanHo.getValueAt(rowSelected, 6).toString());
    }//GEN-LAST:event_table_CanHoMouseClicked

    private void canHo_jButton_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_themMouseClicked
        // TODO add your handling code here:
        String maCan = (String) canHo_jComboBox_maCan.getSelectedItem();
        String gia = canHo_jTextField_gia.getText();
        String soPhong = canHo_jTextField_soPhong.getText();
        String dienTich = canHo_jTextField_dienTich.getText();
        String maKhachHang = canHo_jTextField_maKhachHang.getText();
        String khu = canHo_jTextField_khu.getText();
        String trangThai;
        if(canHo_jCheckBox_trangThai.isSelected())
            trangThai = "Da ban";
                    else trangThai = "Chua ban";
        String query = "INSERT INTO CANHO VALUES("+maCan+",'"+dienTich+"',"+gia+",'"
                +trangThai+"','"+soPhong+"',"+maKhachHang+"','"+khu+")";
        ketNoi.CapNhat(query);
        
        //show
        String query1 = "SELECT * FROM CANHO ";
        ResultSet rs = ketNoi.LayDL(query1);
        DefaultTableModel tbl = new DefaultTableModel();
        try{
            while(rs.next()){
                Object rowData[] = new Object[7];
                rowData[0] = rs.getString(1);
                rowData[1] = rs.getString(2);
                rowData[2] = rs.getString(3);
                rowData[3] = rs.getString(4);
                rowData[4] = rs.getString(5);
                rowData[5] = rs.getString(6);
                rowData[6] = rs.getString(7);
                tbl.addRow(rowData);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_canHo_jButton_themMouseClicked

    private void canHo_jButton_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jButton_suaActionPerformed
        // TODO add your handling code here:
        String maCan = (String) canHo_jComboBox_maCan.getSelectedItem();
        String gia = canHo_jTextField_gia.getText();
        String soPhong = canHo_jTextField_soPhong.getText();
        String dienTich = canHo_jTextField_dienTich.getText();
        String maKhachHang = canHo_jTextField_maKhachHang.getText();
        String khu = canHo_jTextField_khu.getText();
        int hangDuocChon = table_CanHo.getSelectedRow();
        String maTemp = table_CanHo.getValueAt(hangDuocChon, 1).toString();
        String query = "UPDATE INFO SET gia="+gia+", soPhong='"
                +soPhong+"', dienTich='"+dienTich+"',maKhachHang="+maKhachHang+" where maCan="+maTemp;
        ketNoi.CapNhat(query);

        
        //show
        String query1 = "SELECT * FROM CANHO ";
        ResultSet rs = ketNoi.LayDL(query1);
        DefaultTableModel tbl = new DefaultTableModel();
        try{
            while(rs.next()){
                Object rowData[] = new Object[7];
                rowData[0] = rs.getString(1);
                rowData[1] = rs.getString(2);
                rowData[2] = rs.getString(3);
                rowData[3] = rs.getString(4);
                rowData[4] = rs.getString(5);
                rowData[5] = rs.getString(6);
                rowData[6] = rs.getString(7);
                tbl.addRow(rowData);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_canHo_jButton_suaActionPerformed

    private void canHo_jButton_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_xoaMouseClicked
        // TODO add your handling code here:
        String maCan = (String) canHo_jComboBox_maCan.getSelectedItem();
        String gia = canHo_jTextField_gia.getText();
        String soPhong = canHo_jTextField_soPhong.getText();
        String dienTich = canHo_jTextField_dienTich.getText();
        String maKhachHang = canHo_jTextField_maKhachHang.getText();
        String khu = canHo_jTextField_khu.getText();
        int rowNow = table_CanHo.getSelectedRow();
        String maTemp = table_CanHo.getValueAt(rowNow, 1).toString();
        String query = "DELETE from CANHO where maCan="+maTemp;
        ketNoi.CapNhat(query);
        
        //show
        String query1 = "SELECT * FROM CANHO ";
        ResultSet rs = ketNoi.LayDL(query1);
        DefaultTableModel tbl = new DefaultTableModel();
        try{
            while(rs.next()){
                Object rowData[] = new Object[7];
                rowData[0] = rs.getString(1);
                rowData[1] = rs.getString(2);
                rowData[2] = rs.getString(3);
                rowData[3] = rs.getString(4);
                rowData[4] = rs.getString(5);
                rowData[5] = rs.getString(6);
                rowData[6] = rs.getString(7);
                tbl.addRow(rowData);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_canHo_jButton_xoaMouseClicked

    private void canHo_jCheckBox_trangThaiTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jCheckBox_trangThaiTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jCheckBox_trangThaiTimKiemActionPerformed

    private void canHo_jTextField_maKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jTextField_maKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jTextField_maKhachHangActionPerformed

    private void canHo_jButton_timKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_timKiemMouseClicked
        // TODO add your handling code here:
        String trangThaiTK, giaTK;
        if(canHo_jCheckBox_trangThaiTimKiem.isSelected())
            trangThaiTK = "Da ban";
        else trangThaiTK = "Chua ban";
       
        String query = "SELECT * FROM CANHO "
                         + "WHERE dienTich="+canHo_jComboBox_dienTichTimKiem+" and "+trangThaiTK+";";
    }//GEN-LAST:event_canHo_jButton_timKiemMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CanHo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canHo_jButton_reset;
    private javax.swing.JButton canHo_jButton_sua;
    private javax.swing.JButton canHo_jButton_them;
    private javax.swing.JButton canHo_jButton_timKiem;
    private javax.swing.JButton canHo_jButton_xoa;
    private javax.swing.JCheckBox canHo_jCheckBox_trangThai;
    private javax.swing.JCheckBox canHo_jCheckBox_trangThaiTimKiem;
    private javax.swing.JComboBox canHo_jComboBox_dienTichTimKiem;
    private javax.swing.JComboBox canHo_jComboBox_giaTimKiem;
    private javax.swing.JComboBox<String> canHo_jComboBox_maCan;
    private javax.swing.JTextField canHo_jTextField_dienTich;
    private javax.swing.JTextField canHo_jTextField_gia;
    private javax.swing.JTextField canHo_jTextField_khu;
    private javax.swing.JTextField canHo_jTextField_maKhachHang;
    private javax.swing.JTextField canHo_jTextField_soPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel_CanHo;
    private javax.swing.JTable table_CanHo;
    // End of variables declaration//GEN-END:variables
}