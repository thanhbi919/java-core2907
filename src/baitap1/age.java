package baitap1;
import java.util.Arrays;
import java.util.Scanner;
public class age {
    public static void main(String[] age){
        Scanner tuoi = new Scanner(System.in);
        System.out.println("ban hay nhap tuoi cua ban");
        int you=tuoi.nextInt();
        System.out.println("Tuoi cua ban" + you);
        System.out.println("ban hay nhap tuoi nguoi yeu ba10n");
        int love=tuoi.nextInt();
        System.out.println("age = " + (you+love));

    }
}
