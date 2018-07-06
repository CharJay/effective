package com.effective.demo2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person.Builder("tom", 18).address("深圳").phone("110").builder();
        System.out.println(p.toString());
    }
}
