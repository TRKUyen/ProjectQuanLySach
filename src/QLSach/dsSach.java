/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.Sach;
import QLSach.LoaiSach;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class dsSach extends Sach {
    private String []DSSach;
    private int SoLuongSachHienCo;

    public dsSach() {
    }

    public String[] getDSSach() {
        return DSSach;
    }

    public void setDSSach(String[] DSSach) {
        this.DSSach = DSSach;
    }

    public int getSoLuongSachHienCo() {
        return SoLuongSachHienCo;
    }

    public void setSoLuongSachHienCo(int SoLuongSachHienCo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach hien co: ");
        SoLuongSachHienCo = Integer.parseInt(sc.nextLine());
        while(true) {
            if(SoLuongSachHienCo >= 0)
                break;
            else {
                System.out.println("So luong sach khong duoc de trong, nhap lai: ");
                SoLuongSachHienCo = Integer.parseInt(sc.nextLine()) ;
            }
        }
        this.SoLuongSachHienCo = SoLuongSachHienCo;
    }
    
    public Sach[] nhapdsSach(){
        Scanner sc = new Scanner(System.in);
        Sach sach[];
        System.out.println("Nhap danh sach sach nhap vao: ");
        int n = Integer.parseInt(sc.nextLine());
        sach = new Sach[n];
        for(int i=0;i<n;i++){
            sach[i] = new LoaiSach();
            sach[i].input();
        }
        return sach;
    }
    
    public void xemdsSach(Sach [] sach){
        for (Sach sach1 : sach) {
            sach1.output();
        }
    }

    @Override
    public void input() {
        
    }
        

    @Override
    public void output() {
        
    }
        
    
}
