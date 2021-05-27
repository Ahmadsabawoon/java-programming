package day_45_oop;

public class TrafficLight {
    String color;
// this is read only method, display value of color variable
    public void showColor() {
        System.out.println("current color = " + color);

    }
    // this method update the value of color variable
    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("changing to Color = " + newColor);
    }
}
