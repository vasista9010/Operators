package com.javalang;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        int x,y, z;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter numbers");
         x=input.nextInt();
         y=input.nextInt();
         z=x+y;
        System.out.println("After Addition");
        System.out.println(z);
    }

}
