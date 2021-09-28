package com.vasu;
public class Pseudo1 {
    public static void main(String[] args) {
        int p = 5, q = 6, r = 4;
        if (p > q || (r + q) < (8 - r))
            q = 9 & q;
        else{
            p = (p + 8) + p;
    }
        System.out.println(p+q+r);

    }
}
