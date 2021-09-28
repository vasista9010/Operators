package com.vasu;
public class SingleAndLogic {
    public static void main(String[] args) {
        int x=20,y=50;
        if(--x>20 & --y<50){
            --x;
        }
        else{
            y--;
        }
        System.out.println(x+"--"+y);
    }
}
