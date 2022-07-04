package com.example.hospital;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public void leftEye() {
        LeftEye leftEye = new LeftEye("left eye", "normal", "blue");
        leftEye.printStatus(leftEye.getColor());
        System.out.println("╔═══════════╗");
        System.out.println("║Exit[0]    ║");
        System.out.println("║MainMenu[1]║");
        System.out.println("╚═══════════╝");
        System.out.print("Action: ");
        int leftEyeInput = sc.nextInt();
        if (leftEyeInput == 1) {
            mainMenu();
        } else {
            System.exit(0);
        }
    }

    public void rightEye(){
        RightEye rightEye = new RightEye("Right eye", "myopia", "blue");
        rightEye.printStatus(rightEye.getColor());
        System.out.println("╔═══════════╗");
        System.out.println("║Exit[0]    ║");
        System.out.println("║MainMenu[1]║");
        System.out.println("╚═══════════╝");
        System.out.print("Action: ");
        int rightEyeInput = sc.nextInt();
        if (rightEyeInput == 1) {
            mainMenu();
        } else {
            System.exit(0);
        }
    }

    public void heart(){
        Heart heart = new Heart("Heart", "Normal", 75);
        heart.printStatus(Integer.parseInt(String.valueOf(heart.getHeartRate())));
        System.out.println("╔═══════════╗");
        System.out.println("║Exit[0]    ║");
        System.out.println("║MainMenu[1]║");
        System.out.println("╚═══════════╝");
        System.out.print("Action: ");
        int heartInput = sc.nextInt();
        if (heartInput == 1) {
            mainMenu();
        }
        else {
            System.exit(0);
        }
    }

    public void stomach(){
        Stomach stomach = new Stomach("Stomach", "PUD");
        System.out.println("┌─────────────────────────┐");
        stomach.printStatus();
        System.out.println("└─────────────────────────┘");
        System.out.println("╔══════════════════╗");
        System.out.println("║Exit[0]           ║");
        System.out.println("║MainMenu[1]       ║");
        System.out.println("║Start Digestion[2]║");
        System.out.println("╚══════════════════╝");
        System.out.print("Action: ");
        int stomachInput = sc.nextInt();
        if (stomachInput == 1) {
            mainMenu();
        }else if(stomachInput == 2){
            System.out.println("Digestion Started ...");
            mainMenu();
        }else{
            System.exit(0);
        }
    }

    public void skin(){
        Skin skin = new Skin("Skin", "Burned");
        System.out.println("┌─────────────────────────┐");
        skin.printStatus();
        System.out.println("└─────────────────────────┘");
        System.out.println("╔═══════════╗");
        System.out.println("║Exit[0]    ║");
        System.out.println("║MainMenu[1]║");
        System.out.println("╚═══════════╝");
        System.out.print("Action: ");
        int skinInput = sc.nextInt();
        if (skinInput == 1){
            mainMenu();
        }else{
            System.exit(0);
        }
    }

    public void mainMenu(){
        System.out.println("╔═════════╗");
        System.out.println("║Name: Tom║");
        System.out.println("║Age: 25  ║");
        System.out.println("╚═════════╝");
        System.out.println("┌────────────────┐");
        System.out.println("│Choose an organ:│ ");
        System.out.println("│1. Left Eye     │");
        System.out.println("│2. Right Eye    │");
        System.out.println("│3. Heart        │");
        System.out.println("│4. Stomach      │");
        System.out.println("│5. Skin         │");
        System.out.println("│0. Quit         │");
        System.out.println("└────────────────┘");
        System.out.print("Organ to be displayed [1]: ");

        int organChosen = sc.nextInt();

        switch (organChosen){
            case 6:
                System.exit(0);
                break;
            case 1:
                leftEye();
                break;
            case 2:
                rightEye();
                break;
            case 3:
                heart();
                break;
            case 4:
                stomach();
                break;
            case 5:
                skin();
                break;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mainMenu();
    }
}
