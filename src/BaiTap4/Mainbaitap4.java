/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author hp
 */
public class Mainbaitap4 {
    public static void main(String[] args) {
        
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        
        ChuyenXeNoiThanh CXNoiThanh0 = new ChuyenXeNoiThanh(1, 10,"ChuyenXe0","Teoooooo","Soxe00", 1000);
        ChuyenXeNoiThanh CXNoiThanh1 = new ChuyenXeNoiThanh(4,4,"ChuyenXe1","Nguyen Thai Tuan","SoXe01",130);
        ChuyenXeNgoaiThanh CXNgoaiThanh1 = new ChuyenXeNgoaiThanh("phu yen",20,"Nguyen Thai Thinh","ChuyenXe2","SoXe02",140);
        ChuyenXeNoiThanh CXNoiThanh2 = new ChuyenXeNoiThanh(5,6,"ChuyenXe3","Nguyen Thai Thinh","SoXe03",100);
        ChuyenXeNgoaiThanh CXNgoaiThanh2 = new ChuyenXeNgoaiThanh("Huế",20,"Lê Thế Thiên","ChuyenXe4","SoXe03",200);
        
        QLCX.themCX(CXNoiThanh0);
        QLCX.themCX(CXNoiThanh1);
        QLCX.themCX(CXNgoaiThanh1);
        QLCX.themCX(CXNoiThanh2);
        QLCX.themCX(CXNgoaiThanh1);
        
        QLCX.inDS();
     
        System.out.println("Tong doanh thu chuyen xe ngoai thanh " + QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu chuyen xe noi thanh " + QLCX.tinhDoanhThuNoiThanh());
        System.out.println("Tong doanh thu 2 loai xe: "+QLCX.tongDoanhThu());
    }
    
}
    

