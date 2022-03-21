package com.u1l6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Audi");
    System.out.println(new Car("Audi").name);
    System.out.println(new Car("Audi").equals(car));
    System.out.println(new Car("Audi").hashCode());
    }
}
