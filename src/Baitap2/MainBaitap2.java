/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

import Baitap1.NhanVien;

/**
 *
 * @author hp
 */
public class MainBaitap2 {
    public static void main(String[] args) {
            
    QuanLyNhanVien ds = new QuanLyNhanVien();
    NhanVien NV1 = new NhanVien("Do Thi Thanh Thuy", 21,"Phu Yen",6000000,500);
    NhanVien NV2 = new NhanVien("Nguyen Kieu Trinh", 22,"Phu Yen",5000000,400);
    NhanVien NV3 = new NhanVien("Nguyen My Thanh", 23,"Phu Yen",4000000,300);
    NhanVien NV4 = new NhanVien("Nguyen Thai Tien", 24,"Phu Yen",3000000,200);
    NhanVien NV5 = new NhanVien("Nguyen Phuoc Dai", 25,"Phu Yen",2000000,100);
     
    ds.themNhanVien(NV1);
    ds.themNhanVien(NV2);
    ds.themNhanVien(NV3);
    ds.themNhanVien(NV4);
    ds.themNhanVien(NV5);
    
        ds.inDS();
  }


    
}
