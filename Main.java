import java.util.Scanner;

public class Main{

    private static final Scanner scanner = new Scanner(System.in);

    private int intValue;


    public static void main(String[] args) {

        Main main = new Main();

        //The first value is provided
        main.setIntValue(main.enterInput());

        //Value is incremented and information displayed
        main.incrementInt(main.intValue);

    }

    // Allows the user to input a value and verifies if it is an int
    public int enterInput(){
        while(true){
            System.out.println("Please provide a number:");
            try{
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            }catch (NumberFormatException e){
                System.out.println("\nInvalid input. Please enter a valid integer.");
            }
        }
    }


    // Increments given Int and displays original value and the incremented value
    public void incrementInt(int number){
        number++;

        System.out.println(toString(number));
    }

    // toString method with an int as parameter
    public String toString(int num){
        return "\nMain {" +
                "\nOriginal value: " + this.intValue +
                "\nIncremented to: " + num + "\n}";
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }
}
