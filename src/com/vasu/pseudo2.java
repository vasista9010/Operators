package com.vasu;
public class pseudo2 {
    public static void main(String[] args) {
        int p=1,q=6,r=7;
        q=(p&6)^q;
        r=7+p;
        r=(r+8)&p;
        System.out.println(p+q+r);
    }
}
