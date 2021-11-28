/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.Sach;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class LoaiSach extends Sach{
    private String IDLoaiSach;
    private String TenLoaiSach;

    public LoaiSach() {
    }
    
    public String getIDLoaiSach() {
        return IDLoaiSach;
    }

    public void setIDLoaiSach(String IDLoaiSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID loai sach: ");
        IDLoaiSach = sc.nextLine();
        while(true) {
            if(!IDLoaiSach.isEmpty())
                break;
            else {
                System.out.println("ID loai sach khong duoc de trong, nhap lai: ");
                IDLoaiSach = sc.nextLine();
            }
        }
        this.IDLoaiSach = IDLoaiSach;
    }

    public String getTenLoaiSach() {
        return TenLoaiSach;
    }

    public void setTenLoaiSach(String TenLoaiSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten loai sach: ");
        TenLoaiSach = sc.nextLine();
        while(true) {
            if(!TenLoaiSach.isEmpty())
                break;
            else {
                System.out.println("Ten loai sach khong duoc de trong, nhap lai: ");
                TenLoaiSach = sc.nextLine();
            }
        }
        this.TenLoaiSach = TenLoaiSach;
    }

    /**
     *
     */
    @Override
    public void input() {
        System.out.println("=======NHAP THONG TIN LOAI SACH=======");
        super.setSachID("");
        super.setLoaiSach("");
        super.setNgayXB("");
        super.setNgayNhapSach("");
        super.setTacGia("");
        super.setGiaTien(0);
        super.setSoLuongNhap(0);
        super.setSoLuongTon(0);
        setIDLoaiSach("");
        setTenLoaiSach("");
        
    }
      
    @Override
    public String toString() {
        return super.toString() + "LoaiSach{" + "IDLoaiSach=" + IDLoaiSach + ", TenLoaiSach=" + TenLoaiSach + '}';
    }

   @Override
    public void output() {
        System.out.println(toString());
    }
}
