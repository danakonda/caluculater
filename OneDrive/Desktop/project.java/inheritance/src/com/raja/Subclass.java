package com.raja;

public class Subclass extends A {
    int num;
    String name;
    Subclass(int num, String name) {
       super(num,name);
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass(5, "Raja");
        System.out.println("Number: " + obj.num);
        System.out.println("Name: " + obj.name);
        int n=obj.num;
        System.out.println(obj instanceof Object );
    }

}
