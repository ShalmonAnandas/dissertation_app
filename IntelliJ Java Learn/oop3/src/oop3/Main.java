package oop3;

public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine("Renault", 8000);
//        Car mercedes = new Car("AMG", 2, "Silver", new Engine("Renault", 8000));
//        System.out.println(mercedes.getName());
//        Engine engine = mercedes.getEngine();
//
//        System.out.println(mercedes.getEngine().getModel());

//        Car mercedes = null;
//        if(mercedes != null){
//            mercedes.getName();
//        }else{
//            System.out.println("The car was null");
//        }

//        final int a = 5;
//        a = a+1;

        final Engine engine = new Engine("renault", 8000);

        engine.setRpm(10000);

    }
}
