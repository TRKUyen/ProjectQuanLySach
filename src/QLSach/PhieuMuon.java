/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.Sach;

/**
 *
 * @author This PC
 */
public class PhieuMuon extends Sach{
    private String PhieuMuonID;
    private String DocGiaID;
    private String NgayMuon;
    private String NgayHenTra;
    private int SoLuongMuon;

    public PhieuMuon() {
    }

    public PhieuMuon(String PhieuMuonID, String DocGiaID, String NgayMuon, String NgayHenTra, int SoLuongMuon) {
        this.PhieuMuonID = PhieuMuonID;
        this.DocGiaID = DocGiaID;
        this.NgayMuon = NgayMuon;
        this.NgayHenTra = NgayHenTra;
        this.SoLuongMuon = SoLuongMuon;
    }

    public String getPhieuMuonID() {
        return PhieuMuonID;
    }

    public void setPhieuMuonID(String PhieuMuonID) {
        this.PhieuMuonID = PhieuMuonID;
    }

    public String getDocGiaID() {
        return DocGiaID;
    }

    public void setDocGiaID(String DocGiaID) {
        this.DocGiaID = DocGiaID;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getNgayHenTra() {
        return NgayHenTra;
    }

    public void setNgayHenTra(String NgayHenTra) {
        this.NgayHenTra = NgayHenTra;
    }

    public int getSoLuongMuon() {
        return SoLuongMuon;
    }

    public void setSoLuongMuon(int SoLuongMuon) {
        this.SoLuongMuon = SoLuongMuon;
    }
    
    public void capnhatPhieuMuon(){
        
    }

    @Override
    public void input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void output() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
