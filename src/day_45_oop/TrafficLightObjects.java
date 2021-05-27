package day_45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        // create traffic light object

        TrafficLight trafficlight = new TrafficLight();
        //trafficLight.color = "red";
        // we will assign / update the value of the color using a method of the class

        trafficlight.changeColor("red");
        // System.out.println(trafficLight.color); Direct access to variable and not recommended
        // call method to access the variable
        trafficlight.showColor();

        trafficlight.changeColor("green");
        trafficlight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("yellow00                       ");                          // trafficLight2.color = "black";
        trafficLight2.showColor();


    }
}
