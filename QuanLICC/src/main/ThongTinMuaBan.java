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
public class ThongTinMuaBan extends javax.swing.JFrame {

    public ThongTinMuaBan() {
        initComponents();
        this.getDulieu();
        this.setLocationRelativeTo(null);
    }
    public ThongTinMuaBan(String loginName, int role) {
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
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        giaoDich_jButton_them = new javax.swing.JButton();
        giaoDich_jButton_sua = new javax.swing.JButton();
        giaoDich_jButton_reset = new javax.swing.JButton();
        giaoDich_jTextField_ngayGiaoDich = new javax.swing.JTextField();
        giaoDich_jTextField_diaChiKhachHang = new javax.swing.JTextField();
        giaoDich_jTextField_tenKhachHang = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        giaoDich_jTextField_maHopDong = new javax.swing.JTextField();
        giaoDich_jTextField_maKhachHang = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        giaoDich_jTextField_gia = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        giaoDich_jButton_xoa = new javax.swing.JButton();
        giaoDich_jTextField_maCanHo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ThongTinMuaBan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Giao dịch");

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

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giaoDich_jButton_them.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        giaoDich_jButton_them.setText("Thêm");
        giaoDich_jButton_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giaoDich_jButton_themMouseClicked(evt);
            }
        });
        jPanel2.add(giaoDich_jButton_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        giaoDich_jButton_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        giaoDich_jButton_sua.setText("Sửa");
        giaoDich_jButton_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giaoDich_jButton_suaMouseClicked(evt);
            }
        });
        jPanel2.add(giaoDich_jButton_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        giaoDich_jButton_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        giaoDich_jButton_reset.setText("Reset");
        giaoDich_jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaoDich_jButton_resetActionPerformed(evt);
            }
        });
        jPanel2.add(giaoDich_jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));
        jPanel2.add(giaoDich_jTextField_ngayGiaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 110, -1));
        jPanel2.add(giaoDich_jTextField_diaChiKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 170, -1));
        jPanel2.add(giaoDich_jTextField_tenKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Tên khách hàng");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Địa chỉ khách hàng");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Ngày giao dịch");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));
        jPanel2.add(giaoDich_jTextField_maHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, -1));
        jPanel2.add(giaoDich_jTextField_maKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 110, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Mã hợp đồng");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Mã Khách hàng");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Mã căn hộ");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        giaoDich_jTextField_gia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaoDich_jTextField_giaActionPerformed(evt);
            }
        });
        jPanel2.add(giaoDich_jTextField_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 110, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Giá");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        giaoDich_jButton_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        giaoDich_jButton_xoa.setText("Xoá");
        giaoDich_jButton_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giaoDich_jButton_xoaMouseClicked(evt);
            }
        });
        giaoDich_jButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaoDich_jButton_xoaActionPerformed(evt);
            }
        });
        jPanel2.add(giaoDich_jButton_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));
        jPanel2.add(giaoDich_jTextField_maCanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 110, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 910, 210));

        table_ThongTinMuaBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Mã khách hàng", "Tên khách hàng", "Địa chỉ khách hàng", "Giá", "Ngày giao dịch", "Mã căn hộ"
            }
        ));
        table_ThongTinMuaBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ThongTinMuaBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_ThongTinMuaBan);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 900, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giaoDich_jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaoDich_jButton_resetActionPerformed
        
        giaoDich_jTextField_maHopDong.setText("");    
        giaoDich_jTextField_maCanHo.setText("");
        giaoDich_jTextField_gia.setText("");
        giaoDich_jTextField_ngayGiaoDich.setText("");
        giaoDich_jTextField_maKhachHang.setText("");
        giaoDich_jTextField_tenKhachHang.setText("");
        giaoDich_jTextField_diaChiKhachHang.setText("");
        
    }//GEN-LAST:event_giaoDich_jButton_resetActionPerformed

    private void giaoDich_jButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaoDich_jButton_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaoDich_jButton_xoaActionPerformed

    private void giaoDich_jTextField_giaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaoDich_jTextField_giaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaoDich_jTextField_giaActionPerformed

    private void giaoDich_jButton_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaoDich_jButton_themMouseClicked
        
        ketNoi.Mo();
      
        Pattern patternMaHD = Pattern.compile("\\d{10}");
        Matcher matcherMaHD = patternMaHD.matcher(giaoDich_jTextField_maHopDong.getText());
        if(!matcherMaHD.matches())
       //   maKhachHang = khachHang_jTextField_maKhachHang.getText();
        JOptionPane.showMessageDialog(this, "Mã hợp đồng có 10kis tự...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternMaKH = Pattern.compile("\\d{6}");
        Matcher matcherMaKH = patternMaKH.matcher(giaoDich_jTextField_maKhachHang.getText());
        if(!matcherMaKH.matches())
        //  tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
        JOptionPane.showMessageDialog(this, "Mã khách hàng phải dài 6 kí tự", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternTenKH = Pattern.compile("");
        Matcher matcherTenKH = patternTenKH.matcher(giaoDich_jTextField_tenKhachHang.getText());
        if(matcherTenKH .matches())
          //ngaySinh = khachHang_jTextField_ngaySinh.getText();
        JOptionPane.showMessageDialog(this, "Nhập tên khách hàng", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternDiaChi = Pattern.compile("");
        Matcher matcherDiaChi = patternDiaChi.matcher(giaoDich_jTextField_diaChiKhachHang.getText());
        if(matcherDiaChi.matches())
        JOptionPane.showMessageDialog(this, "Nhập địa chỉ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternGiaBan = Pattern.compile("\\d{3,5}");
        Matcher matcherGiaBan = patternGiaBan.matcher(giaoDich_jTextField_gia.getText());
        if(!matcherGiaBan.matches())
          //soCMND = khachHang_jTextField_soCMND.getText();
        JOptionPane.showMessageDialog(this, "Giá bán từ 100 trở lên", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternNgayGD = Pattern.compile("\\d{4}[-|/]\\d{1,2}[-|/]\\d{1,2}");
        Matcher matcherNgayGD = patternNgayGD.matcher(giaoDich_jTextField_ngayGiaoDich.getText());
        if(!matcherNgayGD.matches())
          //soDienThoai = khachHang_jTextField_soDienThoai.getText();
        JOptionPane.showMessageDialog(this, "Số điện thoại là 10 số nhé!...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternMaCanHo = Pattern.compile("\\d{6}");
        Matcher matcherMaCanHo = patternMaCanHo.matcher(giaoDich_jTextField_maCanHo.getText());
        if(!matcherMaCanHo.matches())
        JOptionPane.showMessageDialog(this, "Mã căn hộ [6 kí tự]...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        try{
            if(matcherMaHD.matches() && !matcherTenKH.matches() && matcherNgayGD.matches() 
                   && matcherMaCanHo.matches() && matcherMaKH.matches() && !matcherDiaChi.matches() && matcherGiaBan.matches()){
                String maKhachHang = giaoDich_jTextField_maKhachHang.getText();
                String tenKhachHang = giaoDich_jTextField_tenKhachHang.getText();
                String ngayGD = giaoDich_jTextField_ngayGiaoDich.getText();
                String diaChi = giaoDich_jTextField_diaChiKhachHang.getText();
                String giaBan = giaoDich_jTextField_gia.getText();
                String maCanHo = giaoDich_jTextField_maCanHo.getText();
                String maHD = giaoDich_jTextField_maHopDong.getText();
                String query = "INSERT INTO HOPDONG VALUES("+maHD+","+maKhachHang+",N'"+tenKhachHang+"',N'"
                  +diaChi+"',"+giaBan+",'"+ngayGD+"','"+maCanHo+"')";
                System.out.println(query);
                ketNoi.CapNhat(query);
            }
            }catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Looxisadasdasdasdsa", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.getDulieu();
        
    }//GEN-LAST:event_giaoDich_jButton_themMouseClicked

    private void giaoDich_jButton_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaoDich_jButton_suaMouseClicked
        
        ketNoi.Mo();
        
        Pattern patternMaKH = Pattern.compile("\\d{6}");
        Matcher matcherMaKH = patternMaKH.matcher(giaoDich_jTextField_maKhachHang.getText());
        if(!matcherMaKH.matches())
        //  tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
        JOptionPane.showMessageDialog(this, "Mã khách hàng phải dài 6 kí tự", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternTenKH = Pattern.compile("");
        Matcher matcherTenKH = patternTenKH.matcher(giaoDich_jTextField_tenKhachHang.getText());
        if(matcherTenKH .matches())
          //ngaySinh = khachHang_jTextField_ngaySinh.getText();
        JOptionPane.showMessageDialog(this, "Nhập tên khách hàng", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternDiaChi = Pattern.compile("");
        Matcher matcherDiaChi = patternDiaChi.matcher(giaoDich_jTextField_diaChiKhachHang.getText());
        if(matcherDiaChi.matches())
        JOptionPane.showMessageDialog(this, "Nhập địa chỉ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternGiaBan = Pattern.compile("\\d{3,5}");
        Matcher matcherGiaBan = patternGiaBan.matcher(giaoDich_jTextField_gia.getText());
        if(!matcherGiaBan.matches())
          //soCMND = khachHang_jTextField_soCMND.getText();
        JOptionPane.showMessageDialog(this, "Giá bán từ 100 trở lên", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternNgayGD = Pattern.compile("\\d{4}[-|/]\\d{1,2}[-|/]\\d{1,2}");
        Matcher matcherNgayGD = patternNgayGD.matcher(giaoDich_jTextField_ngayGiaoDich.getText());
        if(!matcherNgayGD.matches())
          //soDienThoai = khachHang_jTextField_soDienThoai.getText();
        JOptionPane.showMessageDialog(this, "Số điện thoại là 10 số nhé!...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternMaCanHo = Pattern.compile("\\d{6}");
        Matcher matcherMaCanHo = patternMaCanHo.matcher(giaoDich_jTextField_maCanHo.getText());
        if(!matcherMaCanHo.matches())
        JOptionPane.showMessageDialog(this, "Mã căn hộ [6 kí tự]...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        try{
            if(!matcherTenKH.matches() && matcherNgayGD.matches() && matcherMaCanHo.matches() && matcherMaKH.matches() && !matcherDiaChi.matches() && matcherGiaBan.matches()){
                String maKhachHang = giaoDich_jTextField_maKhachHang.getText();
                String tenKhachHang = giaoDich_jTextField_tenKhachHang.getText();
                String ngayGD = giaoDich_jTextField_ngayGiaoDich.getText();
                String diaChi = giaoDich_jTextField_diaChiKhachHang.getText();
                String giaBan = giaoDich_jTextField_gia.getText();
                String maCanHo = giaoDich_jTextField_maCanHo.getText();
//              String maHD = giaoDich_jTextField_maHopDong.getText();
                
                int hangDuocChon = table_ThongTinMuaBan.getSelectedRow();
                String maHDTemp = table_ThongTinMuaBan.getValueAt(hangDuocChon, 0).toString();
                
                String query = "UPDATE HOPDONG SET maKhachHang="+maKhachHang+", tenKhachHang=N'"+tenKhachHang+"', "
                        + "diaChiKH=N'"+diaChi+"', giaBan="+giaBan+", ngayGiaoDich='"+ngayGD+"',maCanHo="+maCanHo+" " 
                        + "WHERE maHopDong="+maHDTemp;
                System.out.println(query);
                ketNoi.CapNhat(query);
            }
            }catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Meow meow !!!", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.getDulieu();
        
    }//GEN-LAST:event_giaoDich_jButton_suaMouseClicked

    private void giaoDich_jButton_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaoDich_jButton_xoaMouseClicked
        
//        String maHopDong = giaoDich_jTextField_maHopDong.getText();
//        String maCanHo = giaoDich_jTextField_maCanHo.getText();
//        String gia = giaoDich_jTextField_gia.getText();
//        String ngayGiaoDich = giaoDich_jTextField_ngayGiaoDich.getText();
//        String maKhachHang = giaoDich_jTextField_maKhachHang.getText();
//        String tenKhachHang = giaoDich_jTextField_tenKhachHang.getText();
//        String diaChi = giaoDich_jTextField_diaChiKhachHang.getText();
        
        int hangDuocChon = table_ThongTinMuaBan.getSelectedRow();
        String maHDTemp = table_ThongTinMuaBan.getValueAt(hangDuocChon, 0).toString();
        
        String query = "DELETE from HOPDONG where maHopDong="+maHDTemp;
        ketNoi.Mo();
        ketNoi.CapNhat(query);
        System.out.println(query);
        
        this.getDulieu();
        
    }//GEN-LAST:event_giaoDich_jButton_xoaMouseClicked

    private void table_ThongTinMuaBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ThongTinMuaBanMouseClicked
        
        int index = table_ThongTinMuaBan.getSelectedRow();
        giaoDich_jTextField_maHopDong.setText((String)table_ThongTinMuaBan.getValueAt(index, 0));
        giaoDich_jTextField_maKhachHang.setText((String)table_ThongTinMuaBan.getValueAt(index, 1));
        giaoDich_jTextField_tenKhachHang.setText((String)table_ThongTinMuaBan.getValueAt(index, 2));
        giaoDich_jTextField_diaChiKhachHang.setText((String)table_ThongTinMuaBan.getValueAt(index, 3));
        giaoDich_jTextField_gia.setText((String)table_ThongTinMuaBan.getValueAt(index, 4));
        giaoDich_jTextField_ngayGiaoDich.setText((String)table_ThongTinMuaBan.getValueAt(index, 5));
        giaoDich_jTextField_maCanHo.setText((String)table_ThongTinMuaBan.getValueAt(index, 6));
        
    }//GEN-LAST:event_table_ThongTinMuaBanMouseClicked

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
            java.util.logging.Logger.getLogger(ThongTinMuaBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinMuaBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinMuaBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinMuaBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinMuaBan().setVisible(true);
            }
        });
    }
    
    public void getDulieu(){
        ketNoi.Mo();
        String query = "SELECT * FROM HOPDONG;";
        System.out.println(query);
        ResultSet rs = ketNoi.LayDL(query);
// create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Mã hợp đồng","Mã khách hàng","Tên khách hàng","Địa chỉ khách hàng","Giá", "Ngày Giao dịch", "Mã Khu"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table_ThongTinMuaBan.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));        
        table_ThongTinMuaBan.getTableHeader().setOpaque(false);
        table_ThongTinMuaBan.getTableHeader().setBackground(new Color(32, 136, 203));
        table_ThongTinMuaBan.getTableHeader().setForeground(new Color(255,255,255));
        table_ThongTinMuaBan.setRowHeight(25);
// create an array of objects to set the row data
        Object[] row = new Object[9];
        try {
            while(rs.next())
            {
                Object rowData[] = new Object[9]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                rowData[5]=rs.getString(6);
                rowData[6]=rs.getString(7);
                model.addRow(rowData);
                table_ThongTinMuaBan.setModel(model);
             //   System.out.println("add du lieu vao bang thanh cong!");        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
          //  System.out.println("add du lieu vao bang that bai!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giaoDich_jButton_reset;
    private javax.swing.JButton giaoDich_jButton_sua;
    private javax.swing.JButton giaoDich_jButton_them;
    private javax.swing.JButton giaoDich_jButton_xoa;
    private javax.swing.JTextField giaoDich_jTextField_diaChiKhachHang;
    private javax.swing.JTextField giaoDich_jTextField_gia;
    private javax.swing.JTextField giaoDich_jTextField_maCanHo;
    private javax.swing.JTextField giaoDich_jTextField_maHopDong;
    private javax.swing.JTextField giaoDich_jTextField_maKhachHang;
    private javax.swing.JTextField giaoDich_jTextField_ngayGiaoDich;
    private javax.swing.JTextField giaoDich_jTextField_tenKhachHang;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ThongTinMuaBan;
    // End of variables declaration//GEN-END:variables
}
