package com.javalang;
public class HEADPHONES {
    static  String Name="One plus";
     static String color ="black/blue";
    String[] controls={"power","volume","play/pause"};
    static  boolean power=false;
     static int volume=10;
     public static void poweron() {
         power = true;
         System.out.println(true);
     }
     public static void poweroff(){
         power=false;
         System.out.println(false);
     }
    public static void volumeup(){
         volume++;
        System.out.println(volume);
    }
    public static void volumedown(){
        volume--;
        System.out.println(volume);
    }
    public static void main(String[] args) {
        String[] controls={"power","volume","play/pause"};
        for(String s:controls){
            System.out.println(s);
        }
        HEADPHONES h= new HEADPHONES();
        System.out.println(h.controls);
        System.out.println(HEADPHONES.color);
        System.out.println(HEADPHONES.Name);
         HEADPHONES.volumedown();
         HEADPHONES.volumeup();
         HEADPHONES.poweroff();
         HEADPHONES.poweron();
    }
    }
