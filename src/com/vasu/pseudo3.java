package com.vasu;
public class pseudo3 {
    Integer fun(Integer a, Integer b, Integer c) {
        c = (a & b) + c;
        b = (b & 4) ^ c;
        if ((b - c) < (c - b)) {
            b = (a + a) + b;
        }

        return  a+b+c;
}
    public static void main(String[] args) {
        pseudo3 p= new pseudo3();
        System.out.println(p.fun(5,4,8));
    }
    }

