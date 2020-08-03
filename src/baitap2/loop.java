package baitap2;

import java.util.Arrays;
import java.util.Scanner;

public class loop {
    public static void main(String[] arg){
        Scanner lo = new Scanner(System.in);
        System.out.println("Nhap vao so ban muon tinh ");
        int b=lo.nextInt();
        for (byte i=1;i<=10;i++){
            System.out.println(b+" x "+ i +" = " +b*i);
        }
    }
}
