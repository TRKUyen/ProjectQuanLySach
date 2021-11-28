/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public abstract class Sach {
    private String SachID;
    private String LoaiSach;
    private String NgayXB;
    private String NgayNhapSach;
    private String TacGia;
    private float GiaTien;
    private int SoLuongNhap;
    private int SoLuongTon;

    public Sach() {
    }

    public Sach(String SachID, String LoaiSach, String NgayXB, String NgayNhapSach, String TacGia, float GiaTien, int SoLuongNhap, int SoLuongTon) {
        this.SachID = SachID;
        this.LoaiSach = LoaiSach;
        this.NgayXB = NgayXB;
        this.NgayNhapSach = NgayNhapSach;
        this.TacGia = TacGia;
        this.GiaTien = GiaTien;
        this.SoLuongNhap = SoLuongNhap;
        this.SoLuongTon = SoLuongTon;
    }

    public String getSachID() {
        return SachID;
    }

    public void setSachID(String SachID) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sách: ");
        SachID = sc.nextLine();
        while(true) {
            if(SachID.length() == 10)
                break;
            else {
                System.out.println("Ma sach chi co 10 ky tu, nhap lai: ");
                SachID = sc.nextLine();
            }
        }
        this.SachID = SachID;
    }

    public String getLoaiSach() {
        return LoaiSach;
    }

    public void setLoaiSach(String LoaiSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao loai sach: ");
        LoaiSach = sc.nextLine();
        while(true) {
            if(!LoaiSach.isEmpty())
                break;
            else {
                System.out.println("Loai sách không duoc de trong, nhap lai: ");
                LoaiSach = sc.nextLine();
            }
        }
        this.LoaiSach = LoaiSach;
    }

    public String getNgayXB() {
        return NgayXB;
    }

    public void setNgayXB(String NgayXB) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay xuat ban (dd/mm/yy) : ");
        NgayXB = sc.nextLine();
        while(true) {
            if(!NgayXB.isEmpty())
                break;
            else {
                System.out.println("Ngay xuat ban khong duoc de trong, nhap lai (dd/mm/yy) : ");
                NgayXB = sc.nextLine();
            }
        }
        this.NgayXB = NgayXB;
    }

    public String getNgayNhapSach() {
        return NgayNhapSach;
    }

    public void setNgayNhapSach(String NgayNhapSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay nhap sach: ");
        NgayNhapSach = sc.nextLine();
        while(true) {
            if(!NgayNhapSach.isEmpty())
                break;
            else {
                System.out.println("Ngay nhap sach khong duoc de trong, nhap lai (dd/mm/yy) : ");
                NgayNhapSach = sc.nextLine();
            }
        }
        this.NgayNhapSach = NgayNhapSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        TacGia = sc.nextLine();
        while(true) {
            if(!TacGia.isEmpty())
                break;
            else {
                System.out.println("Tac gia khong duoc de trong, nhap lai: ");
                TacGia = sc.nextLine();
            }
        }
        this.TacGia = TacGia;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tien: ");
        GiaTien = sc.nextFloat();
        while(true) {
            if(GiaTien < 1000000 && GiaTien > 0)
                break;
            else {
                System.out.println("Gia tien khong duoc de trong, nhap lai: ");
                GiaTien = Float.parseFloat(sc.nextLine());
            }
        }
        this.GiaTien = GiaTien;
    }

    public int getSoLuongNhap() {
        return SoLuongNhap;
    }

    public void setSoLuongNhap(int SoLuongNhap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhap sach: ");
        SoLuongNhap = sc.nextInt();
        while(true) {
            if(SoLuongNhap > 0)
                break;
            else {
                System.out.println("So luong nhap khong duoc de trong, nhap lai: ");
                SoLuongNhap = Integer.parseInt(sc.nextLine()) ;
            }
        }
        this.SoLuongNhap = SoLuongNhap;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong ton sach: ");
        SoLuongTon = sc.nextInt();
        while(true) {
            if(SoLuongTon >= 0 )
                break;
            else {
                System.out.println("So luong ton khong duoc de trong, nhap lai: ");
                SoLuongTon = Integer.parseInt(sc.nextLine());
            }
        }
        this.SoLuongTon = SoLuongTon;
    }
    
    public abstract void input();
    public abstract void output();

    @Override
    public String toString() {
        return "Sach{" + "SachID=" + SachID + ", LoaiSach=" + LoaiSach + ", NgayXB=" + NgayXB + ", NgayNhapSach=" + NgayNhapSach + ", TacGia=" + TacGia + ", GiaTien=" + GiaTien + ", SoLuongNhap=" + SoLuongNhap + ", SoLuongTon=" + SoLuongTon + '}';
    }

}
