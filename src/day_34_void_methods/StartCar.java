package day_34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        System.out.println("Different steps to start your car very easy as below ");
        sitItnCar();
        StartTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void sitItnCar() {
        System.out.println("1. Please use your remote control to open the door!");
    }

    public static void StartTheCar() {
        System.out.println("2. Please use your key to start the engine");
    }

    public static void shiftToDrive() {
        System.out.println("3. Now you can use the control part to move the car slowly");

    }

    public static void pressGasPedal() {
        System.out.println("4. Please push the gas pedal and move safely");
    }
}