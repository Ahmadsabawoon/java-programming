package day_47_constructor;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("563 Broadway, El Cajon");
        cybertekAddress.setCity("San Diego");
        cybertekAddress.setState("California");
        cybertekAddress.setZipcode("92021");

        System.out.println("cybertekAddress address: " + cybertekAddress.toString());

        cybertekAddress.setStreet("708 N Mollison Ave, Suit #17");
        System.out.println("address after update " + cybertekAddress);
        System.out.println("street ifo = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("jadjf;lja;fj;lasj;fd");
        newAddress.setStreet("El Cajon");
        newAddress.setZipcode("92021");

        Address papaJohnPizza = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John pizza = " + papaJohnPizza.toString());







    }
}
