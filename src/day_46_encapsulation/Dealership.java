package day_46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car();
//        car1.make = "Bugatti Veyron";
//        car1.year = 2013;
//        car1.mileage = 750;

        car1.setModel("Bugatti Veyron");
        System.out.println("My car model = " +car1.getModel());
        car1.setYear(2013);
        System.out.println("My car year = " +car1.getYear());
        car1.setMileage(780);
        System.out.println("My car mileage = " +car1.getMileage());

        car1.setMileage(45230);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());

        System.out.println(car1);  // automatically calls toString


        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16605);
        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());

        System.out.println(alfaRomeo.toString());
        }
    }

