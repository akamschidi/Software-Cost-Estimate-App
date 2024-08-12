import java.util.Scanner;

public class CostEstimateApp {
    private static final int emailLogin = 1400;
    private static final int socialLogin = 2800;
    private static final int dashboard = 1500;
    private static final int ratingSystem = 2000;
    private static final int Photos = 1200;
    private static final int messaging = 1800;
    private static final int QRCode = 2200;
    private static final int thirdPartyAPIIntegration = 3000;
    private static final int eSMSIntegration = 900;
    private static final int shoppingCart = 1000;
    private static final int userAdministration = 1350;
    private static final int ticketingSystem = 1150;
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome To Jays Software Agency");
    System.out.println("........Cost Estimate Page......");
    System.out.println("Select From The List Of Services Below To Get A Cost Estimate");
    System.out.println("Remember To Give A Space After Each Option");

    System.out.println("1. Email Login - $1400");
    System.out.println("2. Social Login - $2800");
    System.out.println("3. Dashboard - $1500");
    System.out.println("4. Rating System- $2000");
    System.out.println("5. Photos - $1200");
    System.out.println("6. Messaging - $1800");
    System.out.println("7. QR Code  - $2200");
    System.out.println("8. Third Party API Integration - $3000");
    System.out.println("9. eSMS Integration = 900");
    System.out.println("10. Shopping Cart - $1000");
    System.out.println("11. User Administration - $1350");
    System.out.println("12. Ticketing System - $1150");

    String service = scan.nextLine();
    String [] selectedService = service.split(" ");

    int totalEstimate = 0;
    for(String softwareservice : selectedService){
        switch (softwareservice) {
            case "1":
            totalEstimate += emailLogin; 
                break;

            case "2":
            totalEstimate += socialLogin;
            break;

            case "3":
            totalEstimate += dashboard;
            break;

            case "4":
            totalEstimate += ratingSystem;
            break;

            case "5":
            totalEstimate += Photos;
            break;

            case "6":
            totalEstimate += messaging;
            break;

            case "7":
            totalEstimate += QRCode;
            break;

            case "8":
            totalEstimate += thirdPartyAPIIntegration;
            break;

            case "9":
            totalEstimate += eSMSIntegration;
            break;

            case "10":
            totalEstimate += shoppingCart;
            break;

            case "11":
            totalEstimate += userAdministration;
            break;

            case "12":
            totalEstimate += ticketingSystem;
            break;

            default:
            System.out.println("Select A Valid Option: " + softwareservice);
                break;
        }
    }
System.out.println("Total Cost For Software Service: " + totalEstimate);
scan.close();

}
    
}
