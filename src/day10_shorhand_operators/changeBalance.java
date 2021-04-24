package day10_shorhand_operators;

public class changeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("Balance " + balance);
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        // decrease balance by baklava price
        balance = balance - baklava;
        System.out.println(" balance after baklava: " + balance);
        
        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("Balance after kenafa : = " + balance);
        // second kenafa is 50% off. lets buy it 
        kenafa = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
        // buy it and decrease balance kenafa price.
        balance = balance - kenafa;
        System.out.println("balance after second kenafa is = " + balance);

        double plove = 7.99;
        System.out.println("plove " + plove);
        balance = balance - plove;
        System.out.println("Balance after plove = " + balance);

        double iceTea = 3;
        System.out.println("iceTea = " + iceTea);
        // buy 4 iced tea and decrease balance
        balance = balance - iceTea *4;
        System.out.println("balance after 4 iced tea = $ " + balance);
        // return baklava
        System.out.println("returning baklava = " +baklava);
        balance = balance +baklava;
        System.out.println("Balance after returning baklava = $" + balance);


        
    }
}
