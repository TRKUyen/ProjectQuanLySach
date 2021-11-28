/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.DocGia;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class dsDocGia extends DocGia{
    private String []DSDocGia;
    private int SLDocGia;

    public dsDocGia() {
    }

    public String[] getDSDocGia() {
        return DSDocGia;
    }

    public void setDSDocGia(String[] DSDocGia) {
        this.DSDocGia = DSDocGia;
    }

    public int getSLDocGia() {
        return SLDocGia;
    }

    public void setSLDocGia(int SLDocGia) {
        this.SLDocGia = SLDocGia;
    }
    
    public DocGia[] nhapdsDocGia(){
        Scanner sc = new Scanner(System.in);
        DocGia dg[];
        System.out.println("Nhap danh sach doc gia mua hang: ");
        int n = Integer.parseInt(sc.nextLine());
        dg = new DocGia[n];
        for(int i=0;i<n;i++){
            dg[i] = new DocGia();
            dg[i].input();
        }
        return dg;
    }
    
    public void xemdsDocGia(DocGia []dg){
        for(DocGia dg1 : dg){
            dg1.output();
        }
    }
}
