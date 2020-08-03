package baitap2;

import java.util.Arrays;
import java.util.Scanner;
public class calculate {
    public static void main(String[] arg){
        Scanner cal = new Scanner(System.in);
        System.out.println("Ban nhap vao so muon tinh");
        int a=cal.nextInt();
        int b= a*10+a;
        int c=a*100+b;
        System.out.println("tong cac so" + a + "," + b+","+c+"="+(a+b+c));
    }
}
