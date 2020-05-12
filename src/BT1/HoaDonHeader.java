/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDonHeader {
    String MaHd,TenKh;
  String NgayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String MaHd, String TenKh, String NgayBan) {
        this.MaHd = MaHd;
        this.TenKh = TenKh;
        this.NgayBan = NgayBan;
    }

    public String getMaHd() {
        return MaHd;
    }

    public void setMaHd(String MaHd) {
        this.MaHd = MaHd;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHd=" + MaHd + ", TenKh=" + TenKh + ", NgayBan=" + NgayBan + '}';
    }
    
}
