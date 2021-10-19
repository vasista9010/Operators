package com.javalang;
import java.lang.reflect.Method;
class student {
    public int getrollno(){
        return 10;
    }
    public String getName(){
        return null;
    }
}
public class Methodnames {
    public static void main(String[] args) throws ClassNotFoundException {
        int count=0;
        Class<?> c= Class.forName("java.lang.Object");
        Method [] m= c.getDeclaredMethods();
        for(Method m1:m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("total number of methods"+count);
    }
}
