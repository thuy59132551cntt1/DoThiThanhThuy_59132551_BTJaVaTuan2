/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

public class MainBaitap1 {
    public static void main(String[] args) {
        NhanVien NV = new NhanVien("thuy", 10,"phu yen", 100000, 100);
        NhanVien NV1 = new NhanVien("my", 15,"phu yen", 110000, 110);
        NhanVien NV2 = new NhanVien("thoa", 20,"phu yen", 150000, 120);
        System.out.println(NV.getThongTin());  
        System.out.println(NV1.getThongTin()); 
        System.out.println(NV2.getThongTin()); 
        //day la main bt1
    }
    
}
