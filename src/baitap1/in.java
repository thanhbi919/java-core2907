//package baitap1;

import java.util.Scanner;

public class in {
    public static void main(String[] arg){
        Scanner a = new Scanner(System.in);
        String ten=a.nextLine();
        System.out.println("Tuoi cua ban "+ ten);
        System.out.println("Nhap tuoi cua ban");
        int tuoi = a.nextInt();
        System.out.println("Tuoi cua ban" + tuoi);
        a.nextLine();
        System.out.println("Truong ban dang hoc");
        String truonghoc =a.nextLine();
        System.out.println("Truong ban hoc" + truonghoc);
    }
}
