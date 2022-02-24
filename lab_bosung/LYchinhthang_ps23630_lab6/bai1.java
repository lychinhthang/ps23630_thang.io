/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class bai1 {
    public static void main(String[] args) {
        String HoVaTen, Ho, Ten, TenDem;
        Scanner scanner = new Scanner(System.in);
        HoVaTen = scanner.nextLine();

        Ho = HoVaTen.substring(0, HoVaTen.indexOf(" "));
        Ten = HoVaTen.substring(HoVaTen.lastIndexOf(" "), HoVaTen.length()).trim();
// lastIndexOf: chuỗi ký tự trắng cuối cùng tìm thấy trong họ và tên
        TenDem = HoVaTen.substring(HoVaTen.indexOf(" "), HoVaTen.lastIndexOf(" "));

        System.out.println("Họ\t:" + Ho.toUpperCase());
// toUpperCase: In hoa
        System.out.println("Tên\t:" + Ten.toUpperCase());
        System.out.println("Tên Đệm\t:" + TenDem);
    }
}
