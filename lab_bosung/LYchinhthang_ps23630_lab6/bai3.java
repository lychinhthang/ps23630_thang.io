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
public class bai3 {

    private String hoten, email, cmnd, sdt;

    public bai3() {
    }

    public bai3(String hoten, String email, String cmnd, String sdt) {
        this.hoten = hoten;
        this.email = email;
        this.cmnd = cmnd;
        this.sdt = sdt;
    }
    public void xuat(){
       System.out.printf("Ho ten: %s\nEmail: %s\nCMND: %s\nSDT: %s",hoten,email,cmnd,sdt);
}
    public void nhap(Scanner s) {
        do {
            System.out.print("Ho ten: ");
            hoten = s.nextLine();
            if (hoten == null || hoten.equals("")) {
                System.out.println("Ho ten khong hop le. Vui long nhap lai");
            } else {
                break;
            }
        }while(true);
bai3ktra dv = new bai3ktra();
   do { 
            System.out.print("Email: ");
        email = s.nextLine();
 
 if(dv.isEmail(email)){
 break;
}
System.out.println("Email khong hop le. Vui long nhap lai email.");
    } while (true);

do { 
            System.out.print ("CMND: ");
        cmnd  = s.nextLine();
 
 if(dv.isCMND(cmnd)){
 break;
}
System.out.println("CMND khong hop le. Vui long nhap lai CMND.");
    } while (true);

do { 
             System.out.print (
    "SDT: ");
        sdt  = s.nextLine();
 
 if(dv.isSDT(sdt)){
 break;
}
System.out.println("SDT khong hop le. Vui long nhap lai SDT.");
    } while (true);


        

    

   

}

public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}
