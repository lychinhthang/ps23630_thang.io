/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class bai3danhsachsinhvien {

    private ArrayList<bai3> list = new ArrayList<>();

    public void nhap() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            bai3 sv = new bai3();
            sv.nhap(s);
            list.add(sv);
        }
    }

    public void xuat() {
System.out.println("\n");
        System.out.println("Danh sach sinh vien");
        for (bai3 item : list) {
            item.xuat();
       System.out.println("\n");
            
        }
    }

}
