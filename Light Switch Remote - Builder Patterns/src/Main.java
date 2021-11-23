import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Client house = new Client();
        boolean notQuit = true;
        while(notQuit) {
            Scanner input = new Scanner(System.in);
            System.out.println("Main Menu:");
            System.out.println("Please choose a light to switch.");
            System.out.println("1. Christmas Lights");
            System.out.println("2. Living Room Light");
            System.out.println("Or enter Q to QUIT!");
            String userChoice = input.nextLine();
            if (userChoice.equals("Q")) {
                notQuit = false;
            } else {
                System.out.println("");
                int userNum = Integer.valueOf(userChoice);
                remote.setCommand(house.getCommand(userNum));
                remote.pressButton();
                System.out.println("");
            }
        }
    } 
}
