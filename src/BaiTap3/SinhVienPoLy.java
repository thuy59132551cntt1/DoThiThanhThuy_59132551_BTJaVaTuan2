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
public abstract class SinhVienPoLy {

    private String hoTen;
   private String nganh;

    public SinhVienPoLy() {
    }

    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        if(getDiem()<5) return "Yeu";
        else if (getDiem()>=5 && getDiem()<6.5) return "trungBinh";
        else if (getDiem()>=6.5 && getDiem()<7) return "Kha";
        else if (getDiem()>=7.5 && getDiem()<9) return "Gioi";
        return "Xuat sac";       
    }
    
    public void Xuat(){
        System.out.println("Ho ten cua sinh vien la: "+hoTen);
        System.out.println("Nganh hoc cua sinh vien la: "+nganh);
        System.out.println("Diem cua sinh vien la: "+getDiem());
        System.out.println("Hoc luc cua sinh vien la: "+getHocLuc());
    }
}
