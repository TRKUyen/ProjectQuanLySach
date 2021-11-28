/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSach;

import QLSach.dsSach;
import QLSach.Sach;

/**
 *
 * @author This PC
 */
public class testSach {
    public static void main(String[] args){
        Sach arrSach[];
        dsSach arr = new dsSach();
        arrSach = arr.nhapdsSach();
        arr.xemdsSach(arrSach);
    }
}
