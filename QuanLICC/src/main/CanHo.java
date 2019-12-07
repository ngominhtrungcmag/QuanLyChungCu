package main;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ConnectDB.KetNoi;

/**
 *
 * @author TUNGBT-TRUNGNM
 */
public class CanHo extends javax.swing.JFrame {

    public CanHo() {
        initComponents();
        this.getDulieu();
        this.setLocationRelativeTo(null);
    }
    public CanHo(String loginName, int role) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getDulieu();
        this.setLoginName(loginName); 
        this.setRole(role);
        if (getRole() == 1)
        {
        this.setTitle(getLoginName() +" [Admin]");
        }
        else
        {
        this.setTitle(getLoginName() +" [Nhân viên]");    
        }
    }
    KetNoi ketNoi = new KetNoi();
    private String loginName;
    private int role;
    public void setRole(int role)
    {
        this.role = role;
    }
    public int getRole()
    {
        return this.role;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getLoginName()
    {
        return this.loginName;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panel_CanHo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        canHo_jButton_loc = new javax.swing.JButton();
        canHo_jComboBox_dienTichTimKiem = new javax.swing.JComboBox();
        canHo_jComboBox_giaTimKiem = new javax.swing.JComboBox();
        canHo_jCheckBox_trangThaiTimKiem = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_CanHo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        canHo_jTextField_maCan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        canHo_jTextField_timKiem = new javax.swing.JTextField();
        canHo_jComboBox_timKiem = new javax.swing.JComboBox<>();
        canHo_jButton_timKiem = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Diện tích");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Giá");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 37, -1));

        canHo_jButton_loc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        canHo_jButton_loc.setText("Lọc");
        canHo_jButton_loc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canHo_jButton_locMouseClicked(evt);
            }
        });
        jPanel2.add(canHo_jButton_loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 20));

        canHo_jComboBox_dienTichTimKiem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dưới 45", "Từ 45 - 60", "Trên 60" }));
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

        table_CanHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã căn", "Diện tích (m2)", "Giá (M)", "Trạng thái", "Số phòng", "Mã khách hàng", "Mã khu"
            }
        ));
        table_CanHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_CanHoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_CanHo);

        panel_CanHo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 920, 130));

        getContentPane().add(panel_CanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, 950, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã căn");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel3.setText("Diện tích");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel4.setText("Giá");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel6.setText("Số phòng");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel7.setText("Mã khách hàng");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel8.setText("Khu");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));
        jPanel3.add(canHo_jTextField_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 90, -1));
        jPanel3.add(canHo_jTextField_soPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 90, -1));
        jPanel3.add(canHo_jTextField_dienTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 90, -1));

        canHo_jTextField_maKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jTextField_maKhachHangActionPerformed(evt);
            }
        });
        jPanel3.add(canHo_jTextField_maKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 90, -1));

        canHo_jTextField_khu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jTextField_khuActionPerformed(evt);
            }
        });
        jPanel3.add(canHo_jTextField_khu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 90, -1));

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
        jPanel3.add(canHo_jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jLabel5.setText("Trạng thái");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        canHo_jCheckBox_trangThai.setText("Đã bán");
        canHo_jCheckBox_trangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canHo_jCheckBox_trangThaiActionPerformed(evt);
            }
        });
        jPanel3.add(canHo_jCheckBox_trangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));
        jPanel3.add(canHo_jTextField_maCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, -1));

        jLabel10.setText("Tìm kiếm");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));
        jPanel3.add(canHo_jTextField_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 90, -1));

        canHo_jComboBox_timKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã căn", "Mã khách hàng" }));
        jPanel3.add(canHo_jComboBox_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        canHo_jButton_timKiem.setText("Tìm kiếm");
        canHo_jButton_timKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canHo_jButton_timKiemMouseClicked(evt);
            }
        });
        jPanel3.add(canHo_jButton_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 940, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canHo_jButton_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_resetMouseClicked
        
        canHo_jTextField_maCan.setText("");
        canHo_jTextField_dienTich.setText("");
        canHo_jTextField_gia.setText("");
        canHo_jTextField_soPhong.setText("");
        canHo_jTextField_maKhachHang.setText("");
        canHo_jTextField_dienTich.setText("");
        canHo_jTextField_khu.setText("");
        canHo_jTextField_timKiem.setText("");
        this.getDulieu();
        
    }//GEN-LAST:event_canHo_jButton_resetMouseClicked

    private void canHo_jButton_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_themMouseClicked
        
        Pattern patternMaCanHo = Pattern.compile("\\d{6}");
        Matcher matcherMaCanHo = patternMaCanHo.matcher(canHo_jTextField_maCan.getText());
        if(!matcherMaCanHo.matches())
        JOptionPane.showMessageDialog(this, "Mã căn hộ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternDienTich = Pattern.compile("\\d{2,3}[.]\\d{1,2}");
        Matcher matcherDienTich = patternDienTich.matcher(canHo_jTextField_dienTich.getText());
        if(!matcherDienTich.matches())
        JOptionPane.showMessageDialog(this, "Diện tích...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternGia = Pattern.compile("\\d{3,5}");
        Matcher matcherGia = patternGia.matcher(canHo_jTextField_gia.getText());
        if(!matcherGia.matches())
        JOptionPane.showMessageDialog(this, "Giá...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternSoPhong = Pattern.compile("\\d{1,2}");
        Matcher matcherSoPhong = patternSoPhong.matcher(canHo_jTextField_soPhong.getText());
        if(!matcherSoPhong.matches())
        JOptionPane.showMessageDialog(this, "Số phòng...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternMaKH = Pattern.compile("\\d{6}");
        Matcher matcherMaKH = patternMaKH.matcher(canHo_jTextField_maKhachHang.getText());
        if(!matcherMaKH.matches())
        JOptionPane.showMessageDialog(this, "Mã khách hàng...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternMaKhu = Pattern.compile("\\D{3}");
        Matcher matcherMaKhu = patternMaKhu.matcher(canHo_jTextField_khu.getText());
        if(!matcherMaKhu.matches())
        JOptionPane.showMessageDialog(this, "Mã khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        String trangThai;
        if(canHo_jCheckBox_trangThai.isSelected())
            trangThai = "1";
                    else trangThai = "0";
        
        try{
            if(matcherMaCanHo.matches() && matcherDienTich.matches() && matcherDienTich.matches() && matcherGia.matches() 
                    && matcherSoPhong.matches() && matcherMaKH.matches() && matcherMaKhu.matches()){
                String maCan = canHo_jTextField_maCan.getText();
                String gia = canHo_jTextField_gia.getText();
                String soPhong = canHo_jTextField_soPhong.getText();
                String dienTich = canHo_jTextField_dienTich.getText();
                String maKhachHang = canHo_jTextField_maKhachHang.getText();
                String khu = canHo_jTextField_khu.getText();
                String query = "INSERT INTO CANHO VALUES('"+maCan+"',"+dienTich+","+gia+",'"
                +trangThai+"',"+soPhong+",'"+maKhachHang+"','"+khu+"')";
                ketNoi.CapNhat(query);
                System.out.println(query);
        
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Meow.....", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.getDulieu();
        
    }//GEN-LAST:event_canHo_jButton_themMouseClicked

    private void canHo_jButton_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jButton_suaActionPerformed
        
        Pattern patternDienTich = Pattern.compile("\\d{2,3}[.]\\d{1,2}");
        Matcher matcherDienTich = patternDienTich.matcher(canHo_jTextField_dienTich.getText());
        if(!matcherDienTich.matches())
        JOptionPane.showMessageDialog(this, "Diện tích xy.z ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternGia = Pattern.compile("\\d{3,5}");
        Matcher matcherGia = patternGia.matcher(canHo_jTextField_gia.getText());
        if(!matcherGia.matches())
        JOptionPane.showMessageDialog(this, "Giá bán...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternSoPhong = Pattern.compile("\\d{1,2}");
        Matcher matcherSoPhong = patternSoPhong.matcher(canHo_jTextField_soPhong.getText());
        if(!matcherSoPhong.matches())
        JOptionPane.showMessageDialog(this, "Số phòng...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternMaKH = Pattern.compile("\\d{6}");
        Matcher matcherMaKH = patternMaKH.matcher(canHo_jTextField_maKhachHang.getText());
        if(!matcherMaKH.matches())
        JOptionPane.showMessageDialog(this, "Mã khách hàng...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternMaKhu = Pattern.compile("\\D{3}");
        Matcher matcherMaKhu = patternMaKhu.matcher(canHo_jTextField_khu.getText());
        if(!matcherMaKhu.matches())
        JOptionPane.showMessageDialog(this, "Mã khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        String trangThai;
        if(canHo_jCheckBox_trangThai.isSelected())
            trangThai = "1";
                    else trangThai = "0";
        
        try{
            if(matcherDienTich.matches() && matcherDienTich.matches() && matcherGia.matches() 
                    && matcherSoPhong.matches() && matcherMaKH.matches() && matcherMaKhu.matches()){
                String maCan = canHo_jTextField_maCan.getText();
                String gia = canHo_jTextField_gia.getText();
                String soPhong = canHo_jTextField_soPhong.getText();
                String dienTich = canHo_jTextField_dienTich.getText();
                String maKhachHang = canHo_jTextField_maKhachHang.getText();
                String khu = canHo_jTextField_khu.getText();
                int hangDuocChon = table_CanHo.getSelectedRow();
                String maCanTemp = table_CanHo.getValueAt(hangDuocChon, 0).toString();
                String query = "UPDATE CANHO SET dienTich="+dienTich+", giaBan="+gia+", trangThai="+trangThai+", "
                        + "soPhong=N'"+soPhong+"', maKhachHang=N'"+maKhachHang+"', maKhu=N'"+khu+"' "
                        + "WHERE maCanHo="+maCanTemp;
                ketNoi.Mo();
                ketNoi.CapNhat(query);
                System.out.println(query);
        
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Meow.....", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.getDulieu();
        
    }//GEN-LAST:event_canHo_jButton_suaActionPerformed

    private void canHo_jButton_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_xoaMouseClicked
        
        ketNoi.Mo();
        String maCanHo = canHo_jTextField_maCan.getText();
//        String giaBan = canHo_jTextField_gia.getText();
//        String soPhong = canHo_jTextField_soPhong.getText();
//        String dienTich = canHo_jTextField_dienTich.getText();
//        String maKhachHang = canHo_jTextField_maKhachHang.getText();
//        String khu = canHo_jTextField_khu.getText();
//        int rowNow = table_CanHo.getSelectedRow();
//        String maCanTemp = table_CanHo.getValueAt(rowNow, 0).toString();
        String query = "DELETE from CANHO where maCanHo='"+maCanHo+"'";
        ketNoi.CapNhat(query);
        System.out.println(query);
        
        this.getDulieu();
        
    }//GEN-LAST:event_canHo_jButton_xoaMouseClicked

    private void canHo_jCheckBox_trangThaiTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jCheckBox_trangThaiTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jCheckBox_trangThaiTimKiemActionPerformed

    private void canHo_jTextField_maKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jTextField_maKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jTextField_maKhachHangActionPerformed

    private void canHo_jButton_locMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_locMouseClicked
        
        String query, dienTichLoc, giaLoc, trangThaiLoc;
        ketNoi.Mo();
        if(canHo_jComboBox_dienTichTimKiem.getSelectedItem() == "Dưới 45")
            dienTichLoc = " < 45 ";
        else if(canHo_jComboBox_dienTichTimKiem.getSelectedItem() == "Trên 60")
            dienTichLoc = "> 60 ";
        else dienTichLoc = " >= 45 and dienTich <= 60 ";
        
        if(canHo_jComboBox_giaTimKiem.getSelectedItem() == "Dưới 500 triệu")
            giaLoc = " < 500 ";
        else if(canHo_jComboBox_giaTimKiem.getSelectedItem() == "Trên 2 tỷ")
            giaLoc = " > 2000 ";
        else if(canHo_jComboBox_giaTimKiem.getSelectedItem() == "500 - 1 tỷ") 
            giaLoc = " >= 500 and giaBan <= 1000 ";
        else giaLoc = " >= 1000 and giaBan <= 2000 ";
        
        if(canHo_jCheckBox_trangThaiTimKiem.isSelected())
            trangThaiLoc = "1";
        else trangThaiLoc = "0";
        
        query = "SELECT * FROM CANHO "
                + "WHERE dienTich"+dienTichLoc+ "and giaBan"+giaLoc+ "and trangThai="+trangThaiLoc;
            

        System.out.println(query);
        Object[] columns = {"Mã căn", "Diện tích(m2)", "Giá(triệu)", "Trạng thái","Số phòng","Mã khách hàng","Khu"};
        Object[] row = new Object[100];
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        ResultSet rs = ketNoi.LayDL(query);
        ketNoi.CapNhat(query);
        try {
            while(rs.next())
            {
                Object rowData[] = new Object[7]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                rowData[5]=rs.getString(6);
                rowData[6]=rs.getString(7);
                model.addRow(rowData);
                table_CanHo.setModel(model);
                System.out.println("add du lieu vao bang thanh cong!");        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("add du lieu vao bang that bai!");
        }
        
        //this.getDulieu();

    }//GEN-LAST:event_canHo_jButton_locMouseClicked

    private void canHo_jTextField_khuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jTextField_khuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jTextField_khuActionPerformed

    private void canHo_jCheckBox_trangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canHo_jCheckBox_trangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canHo_jCheckBox_trangThaiActionPerformed

    private void canHo_jButton_timKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHo_jButton_timKiemMouseClicked
        
        String query;
        ketNoi.Mo();
        
        Pattern patternTimKiem = Pattern.compile("");
        Matcher matcherTimKiem = patternTimKiem.matcher(canHo_jTextField_timKiem.getText());
        if(matcherTimKiem.matches()){
            JOptionPane.showMessageDialog(this, "Nhập đúng loại tìm kiếm...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(canHo_jComboBox_timKiem.getSelectedItem() == "Mã căn")
                query = "SELECT * FROM CANHO "
                    + "WHERE maCanHo='"+canHo_jTextField_timKiem.getText()+"';";
            else if(canHo_jComboBox_timKiem.getSelectedItem() == "Mã khách hàng")
                query = "SELECT * FROM CANHO "
                    + "WHERE maKhachHang='"+canHo_jTextField_timKiem.getText()+"';";
            else query = "SELECT * FROM CANHO "
                    + "WHERE gioiTinh='"+canHo_jTextField_timKiem.getText()+"';";
        
            System.out.println(query);
            Object[] columns = {"Mã căn", "Diện tích(m2)", "Giá(triệu)", "Trạng thái","Số phòng","Mã khách hàng","Khu"};
            Object[] row = new Object[100];
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columns);
            ResultSet rs = ketNoi.LayDL(query);
            ketNoi.CapNhat(query);
            try {
                while(rs.next()){
                    Object rowData[] = new Object[7]; 
                    rowData[0]=rs.getString(1);
                    rowData[1]=rs.getString(2);
                    rowData[2]=rs.getString(3);
                    rowData[3]=rs.getString(4);
                    rowData[4]=rs.getString(5);
                    rowData[5]=rs.getString(6);
                    rowData[6]=rs.getString(7);
                    model.addRow(rowData);
                    table_CanHo.setModel(model);
                    System.out.println("add du lieu vao bang thanh cong!");        
                }
            } catch (SQLException ex) {
                Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("add du lieu vao bang that bai!");
            }
        
        }
//        System.out.println(query);
//        Object[] columns = {"Mã căn", "Diện tích(m2)", "Giá(triệu)", "Trạng thái","Số phòng","Mã khách hàng","Khu"};
//        Object[] row = new Object[100];
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(columns);
//        ResultSet rs = ketNoi.LayDL(query);
//        ketNoi.CapNhat(query);
//        try {
//            while(rs.next()){
//                Object rowData[] = new Object[7]; 
//                rowData[0]=rs.getString(1);
//                rowData[1]=rs.getString(2);
//                rowData[2]=rs.getString(3);
//                rowData[3]=rs.getString(4);
//                rowData[4]=rs.getString(5);
//                rowData[5]=rs.getString(6);
//                rowData[6]=rs.getString(7);
//                model.addRow(rowData);
//                table_CanHo.setModel(model);
//                System.out.println("add du lieu vao bang thanh cong!");        
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("add du lieu vao bang that bai!");
//        }
        
        //this.getDulieu();
        
    }//GEN-LAST:event_canHo_jButton_timKiemMouseClicked

    private void table_CanHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_CanHoMouseClicked
        
        int index = table_CanHo.getSelectedRow();
        canHo_jTextField_maCan.setText((String)table_CanHo.getValueAt(index, 0));
        canHo_jTextField_dienTich.setText((String)table_CanHo.getValueAt(index, 1));
        canHo_jTextField_gia.setText((String)table_CanHo.getValueAt(index, 2));
        canHo_jTextField_soPhong.setText((String)table_CanHo.getValueAt(index, 4));
        canHo_jTextField_khu.setText((String)table_CanHo.getValueAt(index, 6));
        canHo_jTextField_maKhachHang.setText((String)table_CanHo.getValueAt(index, 5));
        if (((String)table_CanHo.getValueAt(index, 3)).equals("1"))
            canHo_jCheckBox_trangThai.setSelected(true);
        else canHo_jCheckBox_trangThai.setSelected(false);
        
        
    }//GEN-LAST:event_table_CanHoMouseClicked

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
    public void getDulieu(){
        
        ketNoi.Mo();
        String query = "SELECT * FROM CANHO;";
        System.out.println(query);
        ResultSet rs = ketNoi.LayDL(query);
// create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Mã căn","Diện tích","Giá","Trạng thái","Số phòng", "Mã khách hàng", "Khu"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table_CanHo.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));        
        table_CanHo.getTableHeader().setOpaque(false);
        table_CanHo.getTableHeader().setBackground(new Color(32, 136, 203));
        table_CanHo.getTableHeader().setForeground(new Color(255,255,255));
        table_CanHo.setRowHeight(25);
// create an array of objects to set the row data
        Object[] row = new Object[1000];
        try {
            while(rs.next()){
                Object rowData[] = new Object[1000]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                rowData[5]=rs.getString(6);
                rowData[6]=rs.getString(7);
                model.addRow(rowData);
                table_CanHo.setModel(model);
                System.out.println("add du lieu vao bang thanh cong!");        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("add du lieu vao bang that bai!");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canHo_jButton_loc;
    private javax.swing.JButton canHo_jButton_reset;
    private javax.swing.JButton canHo_jButton_sua;
    private javax.swing.JButton canHo_jButton_them;
    private javax.swing.JButton canHo_jButton_timKiem;
    private javax.swing.JButton canHo_jButton_xoa;
    private javax.swing.JCheckBox canHo_jCheckBox_trangThai;
    private javax.swing.JCheckBox canHo_jCheckBox_trangThaiTimKiem;
    private javax.swing.JComboBox canHo_jComboBox_dienTichTimKiem;
    private javax.swing.JComboBox canHo_jComboBox_giaTimKiem;
    private javax.swing.JComboBox<String> canHo_jComboBox_timKiem;
    private javax.swing.JTextField canHo_jTextField_dienTich;
    private javax.swing.JTextField canHo_jTextField_gia;
    private javax.swing.JTextField canHo_jTextField_khu;
    private javax.swing.JTextField canHo_jTextField_maCan;
    private javax.swing.JTextField canHo_jTextField_maKhachHang;
    private javax.swing.JTextField canHo_jTextField_soPhong;
    private javax.swing.JTextField canHo_jTextField_timKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_CanHo;
    private javax.swing.JTable table_CanHo;
    // End of variables declaration//GEN-END:variables
}
