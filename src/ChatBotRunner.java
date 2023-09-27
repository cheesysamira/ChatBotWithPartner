public class ChatBotRunner {
    public static void main(String[] args) {

        ChatBot debbie = new ChatBot("Debbie", 7);

        debbie.greeting("Samira and Raida");
        debbie.weather();
        debbie.favoriteNumber(23);
        debbie.heightInInches(70);

        System.out.println("Our birthdays are " + debbie.birthDate(26,22) + " day apart!");
        debbie.chips();
        System.out.println("Debbie's favorite chips are " + debbie.favChip("Doritos") + ".");
        System.out.println("The amount of chips Debbie ate was " + debbie.amountOfChips(15) + ".");

        System.out.println("There are " + debbie.convertFeetToMeters(16) + " in 16 feet");
        System.out.println("The sum of the numbers is " + debbie.addNumbers(5, 14, 25));

        System.out.println(debbie.planet());
        System.out.println(debbie.goodbye());


    }
}