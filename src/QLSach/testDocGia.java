/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.dsDocGia;
import QLSach.DocGia;

/**
 *
 * @author Manh Hai
 */
public class testDocGia {
    public static void main(String[] args) {
        DocGia arrDocGia[];
        dsDocGia arr = new dsDocGia();
        arrDocGia = arr.nhapdsDocGia();
        arr.xemdsDocGia(arrDocGia);     
    }
}

