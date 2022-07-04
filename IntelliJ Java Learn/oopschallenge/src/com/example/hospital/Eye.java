package com.example.hospital;

public class Eye extends Organ{
    private String color;

    public Eye(String name, String medCon, String color) {
        super(name, medCon);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printStatus(String color){
        System.out.println("┌─────────────────────────┐");
        this.printStatus();
        System.out.println("│Color: " + getColor());
        System.out.println("└─────────────────────────┘");
    }
}
