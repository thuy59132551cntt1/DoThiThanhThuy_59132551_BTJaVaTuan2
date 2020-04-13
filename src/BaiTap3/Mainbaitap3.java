/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author hp
 */
public class Mainbaitap3 {
    public static void main(String[] args) {
      SinhVienIT pl1 = new SinhVienIT(6, 8, 10,"Do Thi Thanh Thuy ","CNTT");
        System.out.println("\nSinh vien IT ke thua tu sinh vien poly");
        pl1.Xuat();

        SinhVienBiz pl2 = new SinhVienBiz(8, 8," Tran Duy Trung ","CNTT");
        System.out.println("\nSinh vien bIZ ke thua tu sinh vien poly");
        pl2.Xuat();
        
    }
    
}
