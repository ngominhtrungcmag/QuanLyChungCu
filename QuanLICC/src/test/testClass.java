/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.ConnectDB.KetNoi;
import main.TaiKhoan;

/**
 *
 * @author ngomi
 */
public class testClass {
    public static void main(String args[])
    {
//        int item = 0;
//        int ketqua = 0;
//        switch (item)
//        {
//            case 0:
//            {
//                KetNoi ketNoi =new KetNoi();
//                String query = "select COUNT(MACANHO) as TONG from CANHO Where CANHO.giaBan between 0 and 500";
//                System.out.println(query);
//                try {
//                    ResultSet rs = ketNoi.LayDL(query);
//                    while(rs.next())
//                        {
//                            ketqua = rs.getInt(1);
//                            System.out.println("Lấy dữ liệu thành công rồi đó bạn!");
//                        }
//                    ketNoi.DongKetNoi();
//                } catch (SQLException ex) {
//                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println("add du lieu vao bang that bai!");
//                }
//            }
//            case 1:
//            {
//                KetNoi ketNoi =new KetNoi();
//                String query = "select COUNT(MACANHO) AS TONG from CANHO Where CANHO.giaBan between 500 and 1000";
//                System.out.println(query);
//                
//                try {
//                    ResultSet rs = ketNoi.LayDL(query);
//                    while(rs.next())
//                        {
//                            ketqua = rs.getInt(1);
//                            System.out.println("Lấy dữ liệu thành công rồi đó bạn!");  
//
//                        }
//                    ketNoi.DongKetNoi();
//                } catch (SQLException ex) {
//                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println("add du lieu vao bang that bai!");
//                }
//                
//            }
//            case 2:
//            {
//                KetNoi ketNoi =new KetNoi();
//                String query = "select COUNT(MACANHO) AS TONG from CANHO Where CANHO.giaBan between 1000 and 10000";
//                System.out.println(query);
//                
//                try {
//                    ResultSet rs = ketNoi.LayDL(query);
//                    while(rs.next())
//                        {
//                            ketqua = rs.getInt(0);
//                            System.out.println("Lấy dữ liệu thành công rồi đó bạn!"); 
//
//                        }
//                    ketNoi.DongKetNoi();
//                } catch (SQLException ex) {
//                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println("add du lieu vao bang that bai!");
//                }
//                
//            }
//            case 3:
//            {
//                KetNoi ketNoi =new KetNoi();
//                String query = "select COUNT(MACANHO) AS TONG from CANHO Where CANHO.giaBan >= 10000";
//                System.out.println(query);
//                
//                try {
//                    ResultSet rs = ketNoi.LayDL(query);
//                    while(rs.next())
//                        {
//                            ketqua = rs.getInt(1);
//                            System.out.println("Lấy dữ liệu thành công rồi đó bạn!");        
//                        }
//                    ketNoi.DongKetNoi();
//                } catch (SQLException ex) {
//                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println("add du lieu vao bang that bai!");
//                }
//            }
//        }
        String query = "SELECT * FROM NHANVIEN";
        System.out.println(query);
        KetNoi ketNoi = new KetNoi();
        ResultSet rs = ketNoi.LayDL(query);
        try {
            while(rs.next())
            {
                Object rowData[] = new Object[9]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(3);
                rowData[2]=rs.getString(4);
                if (rs.getString(5).equals("0"))
                    rowData[3]="Nữ";
                else
                    rowData[3]="Nam";
                rowData[4]=rs.getString(6);
                rowData[5]=rs.getString(7);
                rowData[6]=rs.getString(8);
                rowData[7]=rs.getString(9);
                if (rs.getString(10).equals("0"))
                    rowData[8]="Nhân viên";
                else
                    rowData[8]="Admin";
                System.out.println(rowData.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("add du lieu vao bang that bai!");
        }
    }
}
