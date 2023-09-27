import java.util.Scanner;
public class ChatBot {

    // instance variables
    private String name;
    private int number;

    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }

    // void method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }

    // void method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // void method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that returns a goodbye message -- note that this method does not print a string, but
    // rather RETURNS a string
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    public void heightInInches(double height){
        if (height > 67){
            System.out.println("Wow! You are " + height + " inches, that's taller than me!");
        } else if(height==67){
            System.out.println("Amazing! You are the same height as me! 67 inches!");
        } else {
            System.out.println("Oh wow.. That's shorter than me! You are " + height + " inches!");
        }
    }

    public int birthDate(int botBirthDate, int userBirthDate){
        if (botBirthDate > userBirthDate){
            return botBirthDate - userBirthDate;
        } else{
            return userBirthDate - botBirthDate;
        }
    }

    public String planet(){
        return "We are on planet Earth. However, you are a human and " + name + " is a chat bot!";
    }


    public void chips(){
        System.out.println("Some chip brands are Doritos, Lays, Pringles, and Cheetos.");
    }

    public String favChip(String favoriteChip){
        return favoriteChip;
    }

    public int amountOfChips(int numberOfChips) {
        int amountOfChips = numberOfChips;
        return amountOfChips;
    }


}

