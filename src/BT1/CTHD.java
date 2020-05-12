/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;



/**
 *
 * @author Administrator
 */
public class CTHD {
    String SPham;
    int SLuong;
    float DGia,CKhau;
   
    public CTHD() {
    }

    public CTHD(String SPham, int SLuong, float DGia, float CKhau) {
        this.SPham = SPham;
        this.SLuong = SLuong;
        this.DGia = DGia;
        this.CKhau = CKhau;
    }

    public String getSPham() {
        return SPham;
    }

    public void setSPham(String SPham) {
        this.SPham = SPham;
    }

    public int getSLuong() {
        return SLuong;
    }

    public void setSLuong(int SLuong) {
        this.SLuong = SLuong;
    }

    public float getDGia() {
        return DGia;
    }

    public void setDGia(float DGia) {
        this.DGia = DGia;
    }

    public float getCKhau() {
        return CKhau;
    }

    public void setCKhau(float CKhau) {
        this.CKhau = CKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "SPham=" + SPham + ", SLuong=" + SLuong + ", DGia=" + DGia + ", CKhau=" + CKhau + '}';
    }

   

    
    
}
