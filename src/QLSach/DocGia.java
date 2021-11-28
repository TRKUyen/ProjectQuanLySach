/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.ConNguoi;
import java.util.Scanner;

/**
 *
 * @author Manh Hai
 */
public class DocGia extends ConNguoi{
    private String DocGiaID;

    public DocGia() {
    }

    public DocGia(String DocGiaID) {
        this.DocGiaID = DocGiaID;
    }

    public String getDocGiaID() {
        return DocGiaID;
    }

    public void setDocGiaID(String DocGiaID) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ID doc gia: ");
        DocGiaID = scan.nextLine();
        while(true) {
            if(!DocGiaID.isEmpty())  
                break;
            else {
                System.out.println("Doc gia ID khong duoc de trong, nhap lai: ");
                DocGiaID = scan.nextLine();
            }
        }
        this.DocGiaID = DocGiaID;
    }

    @Override
    public void input() {
        System.out.println("=========NHAP THONG TIN DOC GIA=========");
        super.setHoTen("");
        super.setCMND("");
        super.setSDT("");
        super.setNgaySinh("");
        super.setGioiTinh("");
        super.setDiaChi("");
        setDocGiaID("");
    }

    @Override
    public String toString() {
        return super.toString() + ", DocGiaID=" + DocGiaID;
    } 

    @Override
    public void output() {
        System.out.println(toString());
    }
}
