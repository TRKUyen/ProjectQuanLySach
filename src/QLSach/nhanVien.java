/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.ConNguoi;

/**
 *
 * @author This PC
 */
public abstract class nhanVien extends ConNguoi{
    private String IDNhanVien;
    private String NgayBatDauLamViec;
    private boolean Lamviectheothang;
    private float SoGioLamViec;
    private String SoNgayLamViec;
    private float LuongCoBan;

    public nhanVien() {
    }

    public nhanVien(String IDNhanVien, String NgayBatDauLamViec, boolean Lamviectheothang, float SoGioLamViec, String SoNgayLamViec, float LuongCoBan) {
        this.IDNhanVien = IDNhanVien;
        this.NgayBatDauLamViec = NgayBatDauLamViec;
        this.Lamviectheothang = Lamviectheothang;
        this.SoGioLamViec = SoGioLamViec;
        this.SoNgayLamViec = SoNgayLamViec;
        this.LuongCoBan = LuongCoBan;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getNgayBatDauLamViec() {
        return NgayBatDauLamViec;
    }

    public void setNgayBatDauLamViec(String NgayBatDauLamViec) {
        this.NgayBatDauLamViec = NgayBatDauLamViec;
    }

    public boolean isLamviectheothang() {
        return Lamviectheothang;
    }

    public void setLamviectheothang(boolean Lamviectheothang) {
        this.Lamviectheothang = Lamviectheothang;
    }

    public float getSoGioLamViec() {
        return SoGioLamViec;
    }

    public void setSoGioLamViec(float SoGioLamViec) {
        this.SoGioLamViec = SoGioLamViec;
    }

    public String getSoNgayLamViec() {
        return SoNgayLamViec;
    }

    public void setSoNgayLamViec(String SoNgayLamViec) {
        this.SoNgayLamViec = SoNgayLamViec;
    }

    public float getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(float LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }
    
}
