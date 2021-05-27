package SelfStudyPractice;

import java.util.ArrayList;
import java.util.List;

public class PracticeForArrayAsList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("Mazda");
        myCars.add("ford");
        myCars.add("Mokskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        myCars.add("Lamberghini");
        System.out.println(myCars);

        myCars.set(5, "Ahmad");
        System.out.println(myCars);
        myCars.set(myCars.indexOf("Ahmad"), "yogo");
        System.out.println(myCars);
        myCars.set(myCars.indexOf("Mazda"), "Toyoya");
        System.out.println(myCars);

    }
}
