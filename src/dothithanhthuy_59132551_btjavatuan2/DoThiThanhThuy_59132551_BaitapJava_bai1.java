/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public interface DoThiThanhThuy_59132551_BaitapJava_bai1 {
 /**
 *
 * @author Admin
 */
public class NhanVien {
    public String ten;
    public int tuoi;
    public String diaChi;
    public double tienLuong;
    public int tongGioLam;
   
    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
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

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    public void getThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tien luong: " + tienLuong);
        System.out.println("Tong so gio lam: " + tongGioLam);
        System.out.println("Tien thuong: " + tinhThuong());
    }
    
    public int tinhThuong(){
        if(tongGioLam < 100) return 0;
        else if (tongGioLam >= 100 && tongGioLam < 200)
            return (int) (tienLuong*0.1);
        return (int) (tienLuong*0.2);
    }

   
}
    
}
