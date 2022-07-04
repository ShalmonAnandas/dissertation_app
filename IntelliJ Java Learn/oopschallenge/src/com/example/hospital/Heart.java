package com.example.hospital;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medCon, int heartRate) {
        super(name, medCon);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void printStatus(int heartRate){
        System.out.println("┌─────────────────────────┐");
        this.printStatus();
        System.out.println("│Heart rate: " + getHeartRate());
        System.out.println("└─────────────────────────┘");
    }
}
