package com.vasu;
public class AreDoubleare {
    public static void main(String[] args) {
        int x=10,y=15;
        int x1=10,y1=15;
        if(++x<10 | ++y>15){
            x++;
        }
        else{
            y++;
        }
        System.out.println(x+".."+y);
        if(++x1<10 || ++y1>15){
            x1++;
        }
        else{
            y1++;
        }
        System.out.println(x1+".."+y1);
    }
}
