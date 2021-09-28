package com.vasu;
public class LogicalDoubleAnd {
    public static void main(String[] args) {
    int x=10 ,y=30;
    if(++x<10 && ++y>30){
        x++;
    }
    else{
        y++;
    }
        System.out.println(x+"..."+y);
    }
}
