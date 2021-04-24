package day_34_void_methods;

public class EtsySearchClass {
    public static void main(String[] args) {
        System.out.println("---Starting ETSY search smoke test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--- ETSY search smoke test completed - pass ---");
    }
    public static void openBrowser(){
        System.out.println("Launching chrome browser");

    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigate to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");

    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("Pass: Search results are successfully displayed");


    }


    }
