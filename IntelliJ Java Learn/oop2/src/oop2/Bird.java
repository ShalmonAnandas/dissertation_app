package oop2;

import sun.security.rsa.RSAUtil;

public class Bird extends Animal{
    private int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        System.out.println("Chewing "+ food);
    }

    public void fly(){
        System.out.println(this.getName()+" is flying");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
