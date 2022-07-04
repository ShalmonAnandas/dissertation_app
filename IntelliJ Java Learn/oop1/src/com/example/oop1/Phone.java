package com.example.oop1;

public class Phone {
    private String name;
    private int screenSize;
    private int ram;
    private int camera;

    public Phone(String name, int screenSize, int ram, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.ram = ram;
        this.camera = camera;
    }

    public Phone(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public void playMusic (String trackName){
        System.out.println("Playing " + trackName);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
