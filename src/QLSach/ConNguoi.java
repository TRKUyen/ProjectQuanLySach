/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import java.util.Scanner;

/**
 *
 * @author Manh Hai
 */
public abstract class ConNguoi {
    private String HoTen;
    private String CMND;
    private String SDT;
    private String DiaChi;
    private String NgaySinh;
    private String GioiTinh;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        HoTen = scan.nextLine();
        while(true) {
            if(!HoTen.isEmpty())
                break;
            else { 
                System.out.println("Ho ten khong duoc de trong, nhap lai: ");
                HoTen = scan.nextLine();
            }
        }
        this.HoTen = HoTen;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap CMND: ");
        CMND = scan.nextLine();
        while(true) {
            if(CMND.length() == 8)
                break;
            else {
                System.out.println("CMND phai co 8 ky tu, nhap lai: ");
                CMND = scan.nextLine();
            }
        }
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap SDT: ");
        SDT = scan.nextLine();
        while(true) {
            if(SDT.length() == 10 || SDT.length() == 11)
                break;
            else {
                System.out.println("SDT co 10 hoac 11 so, nhap lai: ");
                SDT = scan.nextLine();
            }
        }
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap dia chi: ");
        DiaChi = scan.nextLine();
        while(true) {
            if(!DiaChi.isEmpty())
                break;
            else {
                System.out.println("Dia chi khong duoc de trong, nhap lai: ");
                DiaChi = scan.nextLine();
            }
        }
        this.DiaChi = DiaChi;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
        NgaySinh = scan.nextLine();
        while(true) {
            if(!NgaySinh.isEmpty()) 
                break;
            else {
                System.out.println("Nhap lai ngay sinh (dd/mm/yyyy): ");
                NgaySinh = scan.nextLine();
            }
        }
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gioi tinh: ");
        GioiTinh = scan.nextLine();
        while(true) {
            if(GioiTinh.equalsIgnoreCase("Nam") || GioiTinh.equalsIgnoreCase("Nu"))
                break;
            else {
                System.out.println("Nhap lai gioi tinh: ");
                GioiTinh = scan.nextLine();
            }
        }
        this.GioiTinh = GioiTinh;
    }
    
    public abstract void input();
    public abstract void output();

    @Override
    public String toString() {
        return "HoTen=" + HoTen + ", CMND=" + CMND + ", SDT=" + SDT + ", DiaChi=" + DiaChi + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh;
    }
    
    
}


