/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author hp
 */
public class NhanVien {

    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    public String getThongTin() {
        return "NhanVien{" + "ten=" + ten + ", "
        + "tuoi=" + tuoi + ", diaChi=" + diaChi + ", tienLuong="
        + tienLuong + ", tongSoGioLam=" + tongSoGioLam + '}';
    }
    
    
  
      
    public int tinhThuong(){
        if(tongSoGioLam<100)
            return 0;
        else if (tongSoGioLam>=100 && tongSoGioLam<200)
            return (int) (tienLuong*0.1);
         return (int) (tienLuong*0.2);
    }  
}

