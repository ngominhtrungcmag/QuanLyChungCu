/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.scene.paint.Color;
import javax.swing.JPanel;

/**
 *
 * @author proxc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        giaoDich = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        khuCanHo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        canHo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        khachHang = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        doanhThu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        taiKhoan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(860, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("JavaProject");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quản lý chung cư");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(45, 118, 232));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 334, 25));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 348, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/navigation.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, 100));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/search_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

        giaoDich.setBackground(java.awt.SystemColor.controlHighlight);
        giaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                giaoDichMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                giaoDichMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                giaoDichMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Giao dịch");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/download_52px.png"))); // NOI18N

        javax.swing.GroupLayout giaoDichLayout = new javax.swing.GroupLayout(giaoDich);
        giaoDich.setLayout(giaoDichLayout);
        giaoDichLayout.setHorizontalGroup(
            giaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giaoDichLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(giaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        giaoDichLayout.setVerticalGroup(
            giaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giaoDichLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(giaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 140, 120));

        khuCanHo.setBackground(java.awt.SystemColor.controlHighlight);
        khuCanHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                khuCanHoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                khuCanHoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khuCanHoMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Khu căn hộ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/home_48px.png"))); // NOI18N

        javax.swing.GroupLayout khuCanHoLayout = new javax.swing.GroupLayout(khuCanHo);
        khuCanHo.setLayout(khuCanHoLayout);
        khuCanHoLayout.setHorizontalGroup(
            khuCanHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khuCanHoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(khuCanHoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        khuCanHoLayout.setVerticalGroup(
            khuCanHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khuCanHoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(khuCanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, 120));

        canHo.setBackground(java.awt.SystemColor.controlHighlight);
        canHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                canHoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                canHoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canHoMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Căn hộ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout canHoLayout = new javax.swing.GroupLayout(canHo);
        canHo.setLayout(canHoLayout);
        canHoLayout.setHorizontalGroup(
            canHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canHoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(canHoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        canHoLayout.setVerticalGroup(
            canHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canHoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(canHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 120));

        khachHang.setBackground(java.awt.SystemColor.controlHighlight);
        khachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                khachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                khachHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khachHangMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 118, 232));
        jLabel7.setText("Khách hàng");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/classroom_48px.png"))); // NOI18N

        javax.swing.GroupLayout khachHangLayout = new javax.swing.GroupLayout(khachHang);
        khachHang.setLayout(khachHangLayout);
        khachHangLayout.setHorizontalGroup(
            khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangLayout.createSequentialGroup()
                .addGroup(khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(khachHangLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8))
                    .addGroup(khachHangLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        khachHangLayout.setVerticalGroup(
            khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(khachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, 120));

        doanhThu.setBackground(java.awt.SystemColor.controlHighlight);
        doanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doanhThuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doanhThuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doanhThuMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 118, 232));
        jLabel9.setText("Doanh thu");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/settings_48px.png"))); // NOI18N

        javax.swing.GroupLayout doanhThuLayout = new javax.swing.GroupLayout(doanhThu);
        doanhThu.setLayout(doanhThuLayout);
        doanhThuLayout.setHorizontalGroup(
            doanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doanhThuLayout.createSequentialGroup()
                .addGroup(doanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doanhThuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10))
                    .addGroup(doanhThuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        doanhThuLayout.setVerticalGroup(
            doanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doanhThuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(doanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 140, 120));

        taiKhoan.setBackground(java.awt.SystemColor.controlHighlight);
        taiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                taiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                taiKhoanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taiKhoanMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 118, 232));
        jLabel11.setText("Tài khoản");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/list_64px.png"))); // NOI18N

        javax.swing.GroupLayout taiKhoanLayout = new javax.swing.GroupLayout(taiKhoan);
        taiKhoan.setLayout(taiKhoanLayout);
        taiKhoanLayout.setHorizontalGroup(
            taiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taiKhoanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(taiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        taiKhoanLayout.setVerticalGroup(
            taiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taiKhoanLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(16, 16, 16))
        );

        jPanel1.add(taiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void khuCanHoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHoMouseEntered
        // TODO add your handling code here:
        setColor(khuCanHo);
    }//GEN-LAST:event_khuCanHoMouseEntered

    private void khuCanHoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHoMouseExited
        // TODO add your handling code here:
        resetColor(khuCanHo);
    }//GEN-LAST:event_khuCanHoMouseExited
     
    
    
    
    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel2MouseDragged

    private void canHoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHoMouseEntered
        // TODO add your handling code here:
        setColor(canHo);
    }//GEN-LAST:event_canHoMouseEntered

    private void canHoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHoMouseExited
        // TODO add your handling code here:
        resetColor(canHo);
    }//GEN-LAST:event_canHoMouseExited

    private void khachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseEntered
        // TODO add your handling code here
        setColor(khachHang);
    }//GEN-LAST:event_khachHangMouseEntered

    private void khachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseExited
        // TODO add your handling code here:
        resetColor(khachHang);
    }//GEN-LAST:event_khachHangMouseExited

    private void doanhThuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThuMouseEntered
        // TODO add your handling code here:
        setColor(doanhThu);
    }//GEN-LAST:event_doanhThuMouseEntered

    private void doanhThuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThuMouseExited
        // TODO add your handling code here:
        resetColor(doanhThu);
        
    }//GEN-LAST:event_doanhThuMouseExited

    private void taiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taiKhoanMouseEntered
        // TODO add your handling code here:
        setColor(taiKhoan);
    }//GEN-LAST:event_taiKhoanMouseEntered

    private void taiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taiKhoanMouseExited
        // TODO add your handling code here:
        resetColor(taiKhoan);
    }//GEN-LAST:event_taiKhoanMouseExited

    private void giaoDichMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaoDichMouseEntered
        // TODO add your handling code here:
        setColor(giaoDich);
    }//GEN-LAST:event_giaoDichMouseEntered

    private void giaoDichMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaoDichMouseExited
        // TODO add your handling code here:
        resetColor(giaoDich);
    }//GEN-LAST:event_giaoDichMouseExited
//
    private void khuCanHoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHoMousePressed
        // TODO add your handling code here:
        new KhuCanHo().show();
    }//GEN-LAST:event_khuCanHoMousePressed

    private void canHoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canHoMousePressed
        // TODO add your handling code here:
        //just a sample.
        new CanHo().show();
    }//GEN-LAST:event_canHoMousePressed

    private void giaoDichMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaoDichMousePressed
        // TODO add your handling code here:
        new ThongTinMuaBan().show();
        
    }//GEN-LAST:event_giaoDichMousePressed

    private void khachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMousePressed
        // TODO add your handling code here:
        new ThongTinDanCu().show();
    }//GEN-LAST:event_khachHangMousePressed

    private void doanhThuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThuMousePressed
        // TODO add your handling code here:
        new ThongKeDoanhThu().show();
    }//GEN-LAST:event_doanhThuMousePressed

    private void taiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taiKhoanMousePressed
        // TODO add your handling code here:
        new TaiKhoan().show();
    }//GEN-LAST:event_taiKhoanMousePressed
 public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
 }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canHo;
    private javax.swing.JPanel doanhThu;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel giaoDich;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel khachHang;
    private javax.swing.JPanel khuCanHo;
    private javax.swing.JPanel taiKhoan;
    // End of variables declaration//GEN-END:variables
}
