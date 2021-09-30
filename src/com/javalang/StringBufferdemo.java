package com.javalang;
public class StringBufferdemo {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("vasu");
        System.out.println(sb.reverse());
        StringBuffer sb1= new StringBuffer();
        sb1.append("PI value is");
        sb1.append(3.14);
        sb1.append("It is exactly:");
        sb1.append(true);
        sb1.append("\r\n"+"PI value is "+ 3.14 + " It is exactly:"+ true);
        System.out.println(sb1);
        }
    }

